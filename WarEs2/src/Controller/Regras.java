/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import javafx.scene.paint.Color;
import model.CartaEstado;
import model.CartaObjetivo;
import model.ConstantesEstados;
import model.Estado;
import model.Jogador;
import model.Regioes;

/**
 *
 * @author Luiz Felipe e Roberto 
 */



/**
 * 
 * @author Martelo
 */
public class Regras {
    
    /**
     * verifica se um jogador atingiu o seu objetivo.  O switch possui como parâmetro o id da cartaObjetivo do jogador.
     * @param jogador
     * @param cartaObjetivo
     * @param jogadores é um ArrayList de todos os jogadores que compõem uma partida
     * @return 
     */
    public boolean verificaJogadorGanhouJogo(Jogador jogador, CartaObjetivo cartaObjetivo, ArrayList<Jogador> jogadores){
        switch(cartaObjetivo.getIdCarta()){
            case 0:
                return (jogador.getEstados().size() >= 15);
            case 1:
                return(verificaJogadorPossuiTodaRegiao(jogador, Regioes.NORDESTE) && verificaJogadorPossuiTodaRegiao(jogador, Regioes.CENTROOESTE));
            case 2:
                return(verificaJogadorPossuiTodaRegiao(jogador, Regioes.NORDESTE) && verificaJogadorPossuiTodaRegiao(jogador, Regioes.SUDESTE));
            case 3:
                if(verificaJogadorPossuiTodaRegiao(jogador, Regioes.NORTE) && verificaJogadorPossuiTodaRegiao(jogador, Regioes.CENTROOESTE)){
                    return (verificaJogadorPossuiTodaRegiao(jogador, Regioes.SUL) ||
                            verificaJogadorPossuiTodaRegiao(jogador, Regioes.SUDESTE) ||
                            verificaJogadorPossuiTodaRegiao(jogador, Regioes.NORDESTE));
                }
                else
                    return false;                
            case 4:
                if(verificaJogadorPossuiTodaRegiao(jogador, Regioes.NORTE) && verificaJogadorPossuiTodaRegiao(jogador, Regioes.SUL)){
                    return (verificaJogadorPossuiTodaRegiao(jogador, Regioes.CENTROOESTE) ||
                            verificaJogadorPossuiTodaRegiao(jogador, Regioes.SUDESTE) ||
                            verificaJogadorPossuiTodaRegiao(jogador, Regioes.NORDESTE));
                }
                else
                    return false; 
            case 5:
                if(jogador.getEstados().size() >= 11){
                    for(Estado estadoJogador : jogador.getEstados()){
                        if(estadoJogador.getNumeroExercitos() < 2)
                            return false;
                    }
                    return true;
                }
                else
                    return false;
            case 6: //destroi amarelo
                if (!jogador.getCor().equals(java.awt.Color.YELLOW) && jogador.getAtivo()) {
                    for (Jogador j : jogadores) {
                        if (j.getCor().equals(java.awt.Color.YELLOW) && !j.getAtivo()) {
                            return j.getAssassino().equals(jogador.getCor());
                        }
                    }
                } else if (jogador.getCor().equals(java.awt.Color.YELLOW)) {
                    return jogador.getEstados().size() >= 15;
                }                
                for (Jogador j : jogadores) {
                    if (j.getCor().equals(java.awt.Color.YELLOW)) {
                        if(j.getAtivo()== false)
                            return jogador.getEstados().size() >= 15;
                    }
                }                
                return false;
            case 7: //destroi azul
                if (!jogador.getCor().equals(java.awt.Color.BLUE) && jogador.getAtivo()) {
                    for (Jogador j : jogadores) {
                        if (j.getCor().equals(java.awt.Color.BLUE) && !j.getAtivo()) {
                            return j.getAssassino().equals(jogador.getCor());
                        }
                    }
                } else if (jogador.getCor().equals(java.awt.Color.BLUE)) {
                    return jogador.getEstados().size() >= 15;
                }                
                for (Jogador j : jogadores) {
                    if (j.getCor().equals(java.awt.Color.BLUE)) {
                        if(j.getAtivo()== false)
                            return jogador.getEstados().size() >= 15;
                    }
                }                
                return false;       
            case 8: //destroi branco
                if (!jogador.getCor().equals(java.awt.Color.WHITE) && jogador.getAtivo()) {
                    for (Jogador j : jogadores) {
                        if (j.getCor().equals(java.awt.Color.WHITE) && !j.getAtivo()) {
                            return j.getAssassino().equals(jogador.getCor());
                        }
                    }
                } else if (jogador.getCor().equals(java.awt.Color.WHITE)) {
                    return jogador.getEstados().size() >= 15;
                }                
                for (Jogador j : jogadores) {
                    if (j.getCor().equals(java.awt.Color.WHITE)) {
                        if(j.getAtivo()== false)
                            return jogador.getEstados().size() >= 15;
                    }
                }                
                return false;
            case 9: //destroi preto
                if (!jogador.getCor().equals(java.awt.Color.BLACK) && jogador.getAtivo()) {
                    for (Jogador j : jogadores) {
                        if (j.getCor().equals(java.awt.Color.BLACK) && !j.getAtivo()) {
                            return j.getAssassino().equals(jogador.getCor());
                        }
                    }
                } else if (jogador.getCor().equals(java.awt.Color.BLACK)) {
                    return jogador.getEstados().size() >= 15;
                }                
                for (Jogador j : jogadores) {
                    if (j.getCor().equals(java.awt.Color.BLACK)) {
                        if(j.getAtivo()== false)
                            return jogador.getEstados().size() >= 15;
                    }
                }                
                return false;
            case 10: //destroi Verde
                if (!jogador.getCor().equals(java.awt.Color.GREEN) && jogador.getAtivo()) {
                    for (Jogador j : jogadores) {
                        if (j.getCor().equals(java.awt.Color.GREEN) && !j.getAtivo()) {
                            return j.getAssassino().equals(jogador.getCor());
                        }
                    }
                } else if (jogador.getCor().equals(java.awt.Color.GREEN)) {
                    return jogador.getEstados().size() >= 15;
                }                
                for (Jogador j : jogadores) {
                    if (j.getCor().equals(java.awt.Color.GREEN)) {
                        if(j.getAtivo()== false)
                            return jogador.getEstados().size() >= 15;
                    }
                }                
                return false;
            case 11: //destroi vermelho
                if (!jogador.getCor().equals(java.awt.Color.RED) && jogador.getAtivo()) {
                    for (Jogador j : jogadores) {
                        if (j.getCor().equals(java.awt.Color.RED) && !j.getAtivo()) {
                            return j.getAssassino().equals(jogador.getCor());
                        }
                    }
                } else if (jogador.getCor().equals(java.awt.Color.RED)) {
                    return jogador.getEstados().size() >= 15;
                }                
                for (Jogador j : jogadores) {
                    if (j.getCor().equals(java.awt.Color.RED)) {
                        if(j.getAtivo()== false)
                            return jogador.getEstados().size() >= 15;
                    }
                }                
                return false;
            default:
                return false;
        }
    }
    
    /**
     * verifica se o um jogador possui todos os estados de uma regiao específica
     * @author Martelo
     * @param jogador
     * @param regiao
     * @return 
     */
     public boolean verificaJogadorPossuiTodaRegiao(Jogador jogador, Regioes regiao){        
        for (ConstantesEstados estadoRegiao : regiao.getEstados()) { //estado da região = constante estados
            boolean jogadorPossui  = false;
            for (Estado estadoJogador : jogador.getEstados()) { // Estado
                if(estadoRegiao.getIdEstado() == estadoJogador.getIdEstado()){
                    jogadorPossui = true;
                }
                if(jogadorPossui)
                    break;
            }
            if(!jogadorPossui)
                return false;
        }
         return true;
     }
    
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
    public boolean verificaPossuiEstadoCarta(CartaEstado c1, Jogador j) {
        return j.getEstados().stream().anyMatch((estado) -> (estado.getIdEstado()== c1.getIdCartaEstado()));
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

    public boolean validaTrocaCartas(CartaEstado c1, CartaEstado c2, CartaEstado c3) {
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
        atacante.perdeExercitos(qtdDeslocamento);
        vencedor.getEstados().add(conquistado);
        perdedor.getEstados().remove(conquistado);

    }

    public boolean deslocaExercitoAposConquista(int numAtaque, int numDesloca) {
        return numDesloca <= numAtaque;
    }

    public boolean conquistaTerritorio(Estado defensor) {
        return defensor.getNumeroExercitos() == 0;
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



}
