/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.CartaEstado;
import model.Estado;
import model.Jogador;

/**
 *
 * @author Luiz Felipe e Roberto 
 */
public class Regras {
    
    
    
    public boolean verificaElimicacaoConcorrente(Jogador jogador){
        return jogador.getEstados().isEmpty();
            
    }

    /**
     * verificar condição para adicionar 2 exercitos extras nos territorios
     * retornados
     *
     * @param c1
     * @param c2
     * @param c3
     * @param j
     * @return - retorna os estador a terem os exercitos aumentados
     */
    public ArrayList<Integer> verificaPossuiEstadoCarta(CartaEstado c1, CartaEstado c2, CartaEstado c3, Jogador j) {
        ArrayList<Integer> retorno = new ArrayList<>();
        if (j.getEstados().contains(c1.getIdCarta())) {
            retorno.add(c1.getIdCarta());
        }
        if (j.getEstados().contains(c2.getIdCarta())) {
            retorno.add(c2.getIdCarta());
        }
        if (j.getEstados().contains(c3.getIdCarta())) {
            retorno.add(c3.getIdCarta());
        }

        return retorno;
    }

    /**
     * Deve ser verificada a cada rodada
     *
     * @param j - jogador corrente
     * @return - true caso jogador seja obrigado a realizar a troca
     */
    public boolean VerificaTrocaObrigatoria(Jogador j) {
        return j.getCartasTerritorio().size() >= 5;
    }

    public boolean validaTrocaCartas(int numDaTroca, CartaEstado c1, CartaEstado c2, CartaEstado c3) {
        if (c1.getSimbolo() == 4 && c2.getSimbolo() != 4 && c3.getSimbolo() != 4) {//c1 coringa
            if ((c2.getSimbolo() != c3.getSimbolo()) || (c2.getSimbolo() == c3.getSimbolo())) {
                return true;
            }
        }
        if (c2.getSimbolo() == 4 && c1.getSimbolo() != 4 && c3.getSimbolo() != 4) {//c2 coringa
            if ((c1.getSimbolo() != c3.getSimbolo()) || (c1.getSimbolo() == c3.getSimbolo())) {
                return true;
            }
        }
        if (c3.getSimbolo() == 4 && c2.getSimbolo() != 4 && c1.getSimbolo() != 4) {//c3 coringa
            if ((c2.getSimbolo() != c1.getSimbolo()) || (c2.getSimbolo() == c1.getSimbolo())) {
                return true;
            }
        }

        if (c1.getSimbolo() == 4 && c2.getSimbolo() == 4 && c3.getSimbolo() != 4) {//c1 e c2 coringa
            return true;
        }
        if (c2.getSimbolo() == 4 && c1.getSimbolo() != 4 && c3.getSimbolo() == 4) {//c2 e c3 coringa
            return true;
        }
        if (c3.getSimbolo() == 4 && c2.getSimbolo() != 4 && c1.getSimbolo() == 4) {//c1 e c3 coringa
            return true;
        }

        return (c1.getSimbolo() != c2.getSimbolo() && c1.getSimbolo() != c3.getSimbolo() && c2.getSimbolo() != c3.getSimbolo())
                || (c1.getSimbolo() == c2.getSimbolo() && c1.getSimbolo() == c3.getSimbolo());
    }

    public boolean conquistaCarta(Estado e) {
        return conquistaTerritorio(e);
    }

    //VER ONDE COLOCAR
    public void desloca(Estado origem, Estado destino, int qtdDeslocamento) {
        origem.setNumeroExercitos(origem.getNumeroExercitos() - qtdDeslocamento);
        destino.setNumeroExercitos(destino.getNumeroExercitos() + qtdDeslocamento);

    }

    public boolean validaDeslocamento(Estado origem, Estado destino, int qtdDeslocamento, Estado ultimoDestino) {
        if (ultimoDestino == null) {
            return qtdDeslocamento < origem.getNumeroExercitos() && verificaVizinhos(origem, destino);
        } else {
            return qtdDeslocamento < origem.getNumeroExercitos() && verificaVizinhos(origem, destino) && origem.getIdEstado() != ultimoDestino.getIdEstado();
        }
    }

    /**
     * atualiza o numero de exercitos do estado conquistado e do estado
     * atacante, atualiza tambem o jogador dono do estado conquistado.
     *
     * @param vencedor jogador que consquistou o territorio
     * @param perdedor jogador derrotado
     * @param conquistado territorio conquistado
     * @param atacante territorio de origem do ataque
     * @param qtdDeslocamento numero de exercitos a ser deslocado
     */
    public void atualizaAposConquista(Jogador vencedor, Jogador perdedor, Estado conquistado, Estado atacante, int qtdDeslocamento) {
        conquistado.setNumeroExercitos(qtdDeslocamento);
        atacante.setNumeroExercitos(atacante.getNumeroExercitos() - qtdDeslocamento);
        vencedor.getEstados().add(conquistado);
        perdedor.getEstados().remove(conquistado);

    }

    public boolean deslocaExercitoAposConquista(int numAtaque, int numDesloca) {
        return numDesloca <= numAtaque;
    }

    public boolean conquistaTerritorio(Estado defensor) {
        return defensor.getNumeroExercitos() == 0;
    }

    public void batalha(Estado atacante, Estado defensor, int numExercitos, int[] dadosAtacante, int[] dadosDefensor) {
        dadosDefensor = ordena(dadosDefensor);
        dadosAtacante = ordena(dadosAtacante);
        int comparacoes;
        //1º indice = numero de exercitos perdidos pelo atacante
        //2ª indice = numero de exercitos perdidos pelo defensor
        int[] perdas = {0, 0};
        if (dadosAtacante.length > dadosDefensor.length) {
            comparacoes = dadosDefensor.length;
        } else {
            comparacoes = dadosAtacante.length;
        }

        for (int i = 1; i <= comparacoes; i++) {
            if (dadosAtacante[dadosAtacante.length - i] > dadosDefensor[dadosDefensor.length - i]) {
                perdas[1]++;
            } else {
                perdas[0]++;
            }
        }

        
        atacante.perdeExercitos(perdas[0]);
        defensor.perdeExercitos(perdas[1]);

    }

    public boolean condicaoAtaque(Estado atacante, Estado defensor, int numExercitos) {
        if (atacante.getNumeroExercitos() > 1) {
            if (verificaVizinhos(atacante, defensor)) {
                if (numExercitos < atacante.getNumeroExercitos() && numExercitos >= 1 && numExercitos <= 3) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    public boolean verificaVizinhos(Estado e1, Estado e2) {
        for (int v : e1.getVizinhos()) {
            if (v == e2.getIdEstado()) {
                return true;
            }
        }
        return false;
    }

    public int[] ordena(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        return vetor;
    }

}
