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
    private int origem;
    private int destino;

    public Turno(int numMaxEtapa) {
        this.jogadorCorrente = 0;
        this.etapa = 0;
        this.numMaxEtapa = numMaxEtapa;
        this.numTroca = 1;
        this.regras = new Regras();
        this.primeiraRodada = true;
        destino = -1;
        origem = -1;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }


    public boolean isPrimeiraRodada() {
        return primeiraRodada;
    }

    public void setPrimeiraRodada(boolean primeiraRodada) {
        this.primeiraRodada = primeiraRodada;
    }

    public int getJogadorCorrente() {
        return jogadorCorrente;
    }

    public void finalizaTurno(int numJogadores) {
        
        jogadorCorrente++;
        if (jogadorCorrente == numJogadores) {
            jogadorCorrente = 0;
            primeiraRodada = false;
        }
    }

    public void finalizaEtapa() {
        etapa++;
        if (etapa == numMaxEtapa) {
            etapa = 0;
        }
    }

    public int getNumeroExercitoTroca() {

        switch (numTroca) {
            case 1:
                return 3;
            case 2:
                return 5;
            case 3:
                return 7;
            case 4:
                return 9;
            case 5:
                return 11;
            case 6:
                return 14;
            default:
                return (14 + (numTroca - 6) * 5);
        }

    }

    public boolean trocaCartas(Jogador j, int idCarta1, int idCarta2, int idCarta3, Baralho baralho) {

        if (regras.validaTrocaCartas(j.getCartasTerritorio().get(idCarta1), j.getCartasTerritorio().get(idCarta1), j.getCartasTerritorio().get(idCarta1))) {
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
            if (j.possuitalEstado(j.getCartasTerritorio().get(idCarta1).getIdCartaEstado()) == true) {
                j.ganhaExercitos(j.getCartasTerritorio().get(idCarta1).getIdCartaEstado(), 2);
            }
            if (j.possuitalEstado(j.getCartasTerritorio().get(idCarta2).getIdCartaEstado()) == true) {
                j.ganhaExercitos(j.getCartasTerritorio().get(idCarta2).getIdCartaEstado(), 2);
            }
            if (j.possuitalEstado(j.getCartasTerritorio().get(idCarta3).getIdCartaEstado()) == true) {
                j.ganhaExercitos(j.getCartasTerritorio().get(idCarta3).getIdCartaEstado(), 2);
            }
            //remove as cartas da mao do jogador
            baralho.getCartasEstados().add(j.getCartasTerritorio().remove(idCarta1));
            baralho.getCartasEstados().add(j.getCartasTerritorio().remove(idCarta2));
            baralho.getCartasEstados().add(j.getCartasTerritorio().remove(idCarta3));

            numTroca++;

            return true;

        }
        return false;
    }

    /**
     * jogador recebe novos exercitos a cada rodada de acordo com qtd de
     * territorios e regioes que possui
     *
     * @param j
     */
    public void recebeExercitos(Jogador j) {
        int numExercitosPossuidos = j.getEstados().size();
        int qtdExercitosRecebidos = numExercitosPossuidos / 2;
        int qtdPorRegiao = 0;

        //ganha exercitos por região
        if (regras.verificaJogadorPossuiTodaRegiao(j, Regioes.NORTE)) {
            qtdPorRegiao += Regioes.NORTE.getBonusExercito();
        }
        if (regras.verificaJogadorPossuiTodaRegiao(j, Regioes.NORDESTE)) {
            qtdPorRegiao += Regioes.NORDESTE.getBonusExercito();
        }
        if (regras.verificaJogadorPossuiTodaRegiao(j, Regioes.CENTROOESTE)) {
            qtdPorRegiao += Regioes.CENTROOESTE.getBonusExercito();
        }
        if (regras.verificaJogadorPossuiTodaRegiao(j, Regioes.SUDESTE)) {
            qtdPorRegiao += Regioes.SUDESTE.getBonusExercito();
        }
        if (regras.verificaJogadorPossuiTodaRegiao(j, Regioes.SUL)) {
            qtdPorRegiao += Regioes.SUL.getBonusExercito();
        }

        qtdExercitosRecebidos += qtdPorRegiao;
        j.setnExercitosGanhos(j.getnExercitosGanhos() + qtdExercitosRecebidos);
    }

}
