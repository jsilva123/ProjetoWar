package model;

import Controller.Regras;
import java.util.ArrayList;

public class Turno {

    private int jogadorCorrente;
    private int etapa;
    private final int numMaxEtapa;
    private boolean primeiraRodada;
    private int numTroca;
    private Regras regras;
    private int idEstadoAtacante;
    private int idEstadoDefensor;
    

    public Turno(int numMaxEtapa) {
        this.jogadorCorrente = 0;
        this.etapa = 0;
        this.numMaxEtapa = numMaxEtapa;
        this.numTroca = 0;
        this.regras = new Regras();
        idEstadoAtacante = -1;
        idEstadoDefensor = -1;
        this.primeiraRodada = true;
    }

    public int getEtapa() {
        return etapa;
    }

    public int getIdEstadoAtacante() {
        return idEstadoAtacante;
    }

    public boolean isPrimeiraRodada() {
        return primeiraRodada;
    }

    public void setPrimeiraRodada(boolean primeiraRodada) {
        this.primeiraRodada = primeiraRodada;
    }

    public void setIdEstadoAtacante(int idEstadoAtacante) {
        this.idEstadoAtacante = idEstadoAtacante;
    }

    public int getIdEstadoDefensor() {
        return idEstadoDefensor;
    }

    public void setIdEstadoDefensor(int idEstadoDefensor) {
        this.idEstadoDefensor = idEstadoDefensor;
    }

    public int getJogadorCorrente() {
        return jogadorCorrente;
    }

    public void finalizaTurno(int numJogadores) {
        jogadorCorrente++;
        if (jogadorCorrente == numJogadores) {
            jogadorCorrente = 0;
        }
        etapa = 0;
    }

    public void finalizaEtapa() {
        etapa++;
        if (etapa == numMaxEtapa) {
            etapa = 1;
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
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 4);
                    break;
                case 2:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 6);
                    break;
                case 3:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 8);
                    break;
                case 4:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 10);
                    break;
                case 5:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 12);
                    break;
                case 6:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + 15);
                    break;
                default:
                    j.setnExercitosGanhos(j.getnExercitosGanhos() + (15 + (numTroca - 6) * 5));
                    break;
            }

            /**
             * coloca automaticamente dois exercitos de bonus,caso o territorio
             * de alguma das cartas pertenca ao jogador
             */
            if (j.getEstadoPorId(c1.getIdCartaEstado()) != null ) {
                j.getEstadoPorId(c1.getIdCartaEstado()).ganhaExercitos(2);
            }
            if (j.getEstadoPorId(c2.getIdCartaEstado()) != null) {
               j.getEstadoPorId(c2.getIdCartaEstado()).ganhaExercitos(2);
            }
            if (j.getEstadoPorId(c3.getIdCartaEstado()) != null) {
                j.getEstadoPorId(c3.getIdCartaEstado()).ganhaExercitos(2);
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
     * jogador recebe novos exercitos a cada rodada de acordo com qtd de
     * territorios e regioes que possui
     *
     * @param j
     */
    public void recebeExercitos(Jogador j) {
        int numExercitosPossuidos = j.getTotalDeExercitos();
        int qtdExercitosRecebidos = numExercitosPossuidos / 2;
        int qtdPorRegiao = 0;
        
        //ganha exercitos por região
        
        if(regras.verificaJogadorPossuiTodaRegiao(j, Regioes.NORTE))
            qtdPorRegiao += Regioes.NORTE.getBonusExercito();
        if(regras.verificaJogadorPossuiTodaRegiao(j, Regioes.NORDESTE))
            qtdPorRegiao += Regioes.NORDESTE.getBonusExercito();
        if(regras.verificaJogadorPossuiTodaRegiao(j, Regioes.CENTROOESTE))
            qtdPorRegiao += Regioes.CENTROOESTE.getBonusExercito();
        if(regras.verificaJogadorPossuiTodaRegiao(j, Regioes.SUDESTE))
            qtdPorRegiao += Regioes.SUDESTE.getBonusExercito();
        if(regras.verificaJogadorPossuiTodaRegiao(j, Regioes.SUL))
            qtdPorRegiao += Regioes.SUL.getBonusExercito();
        
        qtdExercitosRecebidos += qtdPorRegiao;
        j.setnExercitosGanhos(j.getnExercitosGanhos() + qtdExercitosRecebidos);
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
        if (qtd <= j.getnExercitosGanhos()) {
            e.setNumeroExercitos(e.getNumeroExercitos() + qtd);
            j.setnExercitosGanhos(j.getnExercitosGanhos() - qtd);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Desloca exercitos do estado origem para o estado destino
     *
     * @author Pessanha e Martelo
     * @param origem Local atual do exercito
     * @param destino Local para onde o exercito sera alocado
     * @param qtdDeslocamento quantidade de exercito a ser deslocada
     */
    public void desloca(Estado origem, Estado destino, int qtdDeslocamento) {
        origem.perdeExercitos(qtdDeslocamento);
        destino.ganhaExercitos(qtdDeslocamento);

    }

    /**
     * Verifica vencedor de uma batalha de acordo com os valores dos dados. caso
     * o territorio atacado seja consquistado pelo jogador atacante, seta a
     * variavel boolean desse jogador para que no final do turno ele receba uma
     * carta territorio
     *
     * @author Pessanha
     * @param jAtacante jogador que esta realizando o ataque
     * @param jDefensor jogador que esta se defendemdo do ataque
     * @param atacante estado de onde parte o ataque
     * @param defensor estado atacado
     * @param numExercitos qtd de exercitos atacando
     * @param dadosAtacante valores dos dados do atacante
     * @param dadosDefensor valores dos dados do defensor
     */
    public void batalha(Jogador jAtacante,Jogador jDefensor  ,Estado atacante, Estado defensor, int numExercitos, int[] dadosAtacante, int[] dadosDefensor) {
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

            if (regras.conquistaTerritorio(defensor)) {
                jAtacante.setConquistouTerritorio(true);
                atualizaAposConquista(jAtacante, jDefensor, defensor, atacante, numExercitos - perdas[0]);
            }
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

    /**
     * caso jogar tenha conquistado algum territorio durante o turno, jogador
     * deve ganhar uma nova carta territorio;
     *
     * @param j
     * @param baralho
     */
    public void darCartaTerritorio(Jogador j, Baralho baralho) {
        if (j.isConquistouTerritorio()) {
            j.setConquistouTerritorio(false);
            j.getCartasTerritorio().add(baralho.getCartasEstados().get(0));
            baralho.getCartasEstados().remove(0);
        }
    }

    /**
     * ordena em ordem crecente um vetor de inteiros
     *
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
     *
     * @param j Jogador a ser verificado
     */
    public void calculaQtdRegioes(Jogador j) {
        int qtd = 0;
        for (Regioes regiao : Regioes.values()) {
            if (regras.verificaJogadorPossuiTodaRegiao(j, regiao)) {
                qtd++;
            }
        }

        j.setQtdRegioes(qtd);
    }

}
