package model;

import Controller.Regras;
import java.util.ArrayList;

public class Turno {

    private int jogadorCorrente;
    private int etapa;
    private final int numMaxEtapa;
    private int numTroca;
    private Regras regras;

    public Turno(int numMaxEtapa) {
        this.jogadorCorrente = 0;
        this.etapa = 1;
        this.numMaxEtapa = numMaxEtapa;
        this.numTroca = 0;
        this.regras = new Regras();
    }

    public int getEtapa() {
        return etapa;
    }

    public int getJogadorCorrente() {
        return jogadorCorrente;
    }

    public void finalizaTurno(int numJogadores) {
        jogadorCorrente++;
        etapa = 0;
        if (jogadorCorrente == numJogadores) {
            jogadorCorrente = 0;
        }

    }

    public void finalizaEtapa() {
        etapa++;
        if (etapa == numMaxEtapa) {
            etapa = 0;
        }
    }
    
    //implementação das ações que podem ser realizados por um jogador durante seu turno

    /**
     * realiza a troca de cartas por execitos. Valores estabelecidos pela tabela
     * encontrada no tabuleiro do war original.
     *
     * @author Pessanha
     * @param j
     * @param c1
     * @param c2
     * @param c3
     * @param baralho baralho 
     */
    public void trocaCartas(Jogador j, CartaEstado c1, CartaEstado c2, CartaEstado c3, Baralho baralho) {
        if (regras.validaTrocaCartas(c1, c2, c3)) {
            switch (numTroca) {
                case 1:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 3);
                    break;
                case 2:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 5);
                    break;
                case 3:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 7);
                    break;
                case 4:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 9);
                    break;
                case 5:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 11);
                    break;
                case 6:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 14);
                    break;
                default:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + (14 + (numTroca - 6) * 5));
                    break;
            }

            /**
             * coloca automaticamente dois exercitos de bonus,caso o territorio
             * de alguma das cartas pertenca ao jogador
             */
            if (j.getCartasTerritorio().contains(c1)) {
                c1.getEstado().setNumeroExercitos(c1.getEstado().getNumeroExercitos() + 2);
            }
            if (j.getCartasTerritorio().contains(c2)) {
                c2.getEstado().setNumeroExercitos(c2.getEstado().getNumeroExercitos() + 2);
            }
            if (j.getCartasTerritorio().contains(c3)) {
                c3.getEstado().setNumeroExercitos(c3.getEstado().getNumeroExercitos() + 2);
            }
            //remove as cartas da mao do jogador
            j.getCartasTerritorio().remove(c1);
            baralho.getCartasEstados().add(c1);
            j.getCartasTerritorio().remove(c2);
            baralho.getCartasEstados().add(c2);
            j.getCartasTerritorio().remove(c3);
            baralho.getCartasEstados().add(c3);

            
            
        }
  
    }
    
    /**
     * jogador recebe novos exercitos a cada rodada de acordo com qtd
     * de territorios e regioes que possui
     * @param j 
     */
    public void recebeExercitos(Jogador j){
        int numExercitosPossuidos = j.getTotalDeExercitos();
        int numRegioesPossuidas = j.getQtdRegioes();
        int qtdExercitosRecebidos = numExercitosPossuidos/2 + numRegioesPossuidas*2;       
        j.setnExercitosGanhos(j.getnExercitosGanhos()+qtdExercitosRecebidos);
    }

    /**
     * adiciona exercitos ao territorio escolhido pelo jogador. Verifica se o
     * jogador possiu a quantidade de exercito disponível.
     *
     * @author Pessanha
     * @param j Jogador
     * @param e Territorio destino
     * @param qtd Quantidade de exercito a ser alocada no territorio e
     * @return
     */
    public boolean distribuiExercito(Jogador j, Estado e, int qtd) {
        if (qtd < j.getnExercitosGanhos()) {
            e.setNumeroExercitos(e.getNumeroExercitos() + qtd);
            j.setnExercitosGanhos(j.getnExercitosGanhos() - qtd);
            return true;
        } else {
            return false;
        }

    }
    
    /**
     * Desloca exercitos do estado origem para o estado destino
     * @author Pessanha e Martelo
     * @param origem Local atual do exercito
     * @param destino Local para onde o exercito sera alocado
     * @param qtdDeslocamento quantidade de exercito a ser deslocada
     */
    public void desloca(Estado origem, Estado destino, int qtdDeslocamento) {
        origem.setNumeroExercitos(origem.getNumeroExercitos() - qtdDeslocamento);
        destino.setNumeroExercitos(destino.getNumeroExercitos() + qtdDeslocamento);

    }
    
    /**
     * Verifica vencedor de uma batalha de acordo com os valores dos dados.
     * caso o territorio atacado seja consquistado pelo jogador atacante, seta a variavel boolean 
     * desse jogador para que no final do turno ele receba uma carta territorio
     * @author Pessanha
     * @param j jogador que esta realizando o ataque
     * @param atacante estado de onde parte o ataque
     * @param defensor estado atacado
     * @param numExercitos qtd de exercitos atacando
     * @param dadosAtacante valores dos dados do atacante
     * @param dadosDefensor valores dos dados do defensor
     */
    public void batalha(Jogador j, Estado atacante, Estado defensor, int numExercitos, int[] dadosAtacante, int[] dadosDefensor) {
        if (regras.condicaoAtaque(atacante, defensor, numExercitos)) {
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
            
            if(regras.conquistaTerritorio(defensor)){
                j.setConquistouTerritorio(true);
            }
        }
    }
    
    /**
     * caso jogar tenha conquistado algum territorio durante o turno, jogador deve ganhar 
     * uma nova carta territorio;
     * @param j
     * @param baralho 
     */
    public void darCartaTerritorio(Jogador j, Baralho baralho){
        if(j.isConquistouTerritorio()){
            j.setConquistouTerritorio(false);
            j.getCartasTerritorio().add(baralho.getCartasEstados().get(0));
        }
    }
    
    /**
     * ordena em ordem crecente um vetor de inteiros
     * @author Pessanha e Martelo
     * @param vetor vetor a ser ordenado
     * @return o vetor ordenado
     */
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
    
    /**
     * calcular quantas regioes determinado jogador possui
     * @param j Jogador a ser verificado
     */
    public void calculaQtdRegioes(Jogador j){
        int qtd = 0;
        for(Regioes regiao : Regioes.values()){
            if(regras.verificaJogadorPossuiTodaRegiao(j, regiao))
                qtd ++;
        }
        
        j.setQtdRegioes(qtd);
    }

}
