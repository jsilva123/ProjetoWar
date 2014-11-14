/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import model.Baralho;
import model.Dado;
import model.Estado;
import model.Jogador;
import model.Turno;

/**
 *
 * @author fabiiane
 */
public class WarController {

    private static WarController instance;

    private boolean fimDeJogo;
    private int numeroDaTroca;
    private int numeroJogadores;
    private ArrayList<Jogador> jogadores;
    private Baralho baralho;
    private Turno turno;
    private Dado dados;
    private IniciaJogo iniciador;
    private Regras regras;

    private WarController() {
        dados = new Dado();
        baralho = new Baralho(12, 28);
        regras = new Regras();
        turno = new Turno(4);
        iniciador = new IniciaJogo();
        numeroDaTroca = 0;
    }

    public static WarController getInstance() {
        if (instance == null) {
            instance = new WarController();
        }
        return instance;
    }

    public void setOrigem(int idOrigem) {
        turno.setOrigem(idOrigem);
    }
    
    public void setDestino(int idDestino) {
        turno.setOrigem(idDestino);
    }
    
    public int getOrigem(){
        return turno.getOrigem();
    }
    public int getDestino(){
        return turno.getDestino();
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void iniciaJogadores(int numeroJogadores, String[] nomes, Color[] cores) {
        setNumeroJogadores(numeroJogadores);
        jogadores = iniciador.iniciaJogadores(nomes, cores);
    }

    public void distribuiEstados() {
        iniciador.distribuiTerritorios(jogadores, baralho.getCartasEstados());
    }

    public void distribuiObjetivos() {
        iniciador.distribuiObjetivo(jogadores, baralho.getCartasObjetivos());
    }

    public String getNomeJogador(int idJogador) {
        return jogadores.get(idJogador).getNome();
    }

    public Color getCorJogador(int idJogador) {
        return jogadores.get(idJogador).getCor();
    }

    public String getNomeCorJogador(int idJogador) {
        return jogadores.get(idJogador).nomeDaCor();
    }

    public int getTotalDeExercitoJogador(int idJogador) {
        return jogadores.get(idJogador).getTotalDeExercitos();
    }

    public void primeiraRodada() {
        turno.getJogadorCorrente();
    }

    public int getEtapaCorrente() {
        return turno.getEtapa();
    }

    public void atualizaMapa(JButton[] botoes) {
        jogadores.stream().forEach((jogador) -> {
            for (Estado estado : jogador.getEstados()) {
                botoes[estado.getIdEstado()].setText(Integer.toString(estado.getNumeroExercitos()));
                botoes[estado.getIdEstado()].setBackground(jogador.getCor());
                if (jogador.getCor() == Color.BLUE || jogador.getCor() == Color.BLACK) {
                    botoes[estado.getIdEstado()].setForeground(Color.WHITE);
                } else {
                    botoes[estado.getIdEstado()].setForeground(Color.BLACK);
                }

            }
        });
    }

    public Jogador getJogadorCorrente() {
        return jogadores.get(turno.getJogadorCorrente());
    }

    public String getCaminhoFotoObjetivoJogador() {
        return "/view/imagens/Cartas Objetivo/" + Integer.toString(jogadores.get(turno.getJogadorCorrente()).getCartaObjetivo().getIdCarta()) + ".jpg";
    }

    public String getCaminhoFotoEstadoJogador(int numeroDaCarta) {
        return "/view/imagens/Cartas Território/" + Integer.toString(jogadores.get(turno.getJogadorCorrente()).getCartasTerritorio().get(numeroDaCarta).getIdCartaEstado()) + ".jpg";
    }

    public int getNumeroDeCartasEstadoJogador() {
        return jogadores.get(turno.getJogadorCorrente()).getCartasTerritorio().size();
    }

    public void passaEtapa() {
        turno.finalizaEtapa();
    }

    public void receberExercitos() {
        turno.recebeExercitos(jogadores.get(turno.getJogadorCorrente()));
    }

    public int getNumExercitoGanhos() {
        return jogadores.get(turno.getJogadorCorrente()).getnExercitosGanhos();
    }

    public int getNumeroJogadorCorrente() {
        return turno.getJogadorCorrente();
    }

    public void alocaExercito(int idEstado, int numeroExercito) {
        turno.distribuiExercito(jogadores.get(turno.getJogadorCorrente()), jogadores.get(turno.getJogadorCorrente()).getEstadoPorId(idEstado), numeroExercito);
    }

    public int[] getIdsEstadosEvizinhosJogadorCorrente() {
        ArrayList<Integer> idsEstadosEVizinhos = new ArrayList<>();
        int[] temporario;
        temporario = jogadores.get(turno.getJogadorCorrente()).getIdsEstados();
        for (int i = 0; i < temporario.length; i++) {
            idsEstadosEVizinhos.add(temporario[i]);
        }
        for (Estado estado : jogadores.get(turno.getJogadorCorrente()).getEstados()) {
            for (int i = 0; i < estado.getVizinhos().length; i++) {
                idsEstadosEVizinhos.add(estado.getVizinhos()[i]);
            }
        }
        temporario = new int[idsEstadosEVizinhos.size()];
        for (int i = 0; i < idsEstadosEVizinhos.size(); i++) {
            temporario[i] = idsEstadosEVizinhos.get(i);
        }
        return temporario;
    }

    public int getIdAtacante() {
        return turno.getIdEstadoAtacante();
    }

    public int getIdDefensor() {
        return turno.getIdEstadoDefensor();
    }

    public void setIdAtacante(int idAtacante) {
        turno.setIdEstadoAtacante(idAtacante);
    }

    public void setIdDefensor(int idDefensor) {
        turno.setIdEstadoDefensor(idDefensor);
    }

    public boolean isPrimeiraRodada() {
        return turno.isPrimeiraRodada();
    }

    public void finalizaTurno() {
        turno.finalizaTurno(jogadores.size());
    }
    
    public boolean trocaCartasTerritorio(){
        return turno.trocaCartas(null, null, null, null, baralho);
    }
    
    public int getNumeroExercitoTroca(){
        return turno.getNumeroExercitoTroca();
    }
    
    public boolean deslocaExercitoJogador(int quantidadeExercitos){
        if(turno.getOrigem() == -1 || turno.getOrigem() == -1){
            return false;
        }
        if(regras.validaDeslocamento(  getJogadorCorrente().getEstadoPorId(turno.getOrigem()), getJogadorCorrente().getEstadoPorId(turno.getDestino()), quantidadeExercitos , getJogadorCorrente().getUltimoDestinoDeslocamento())) {
            getJogadorCorrente().desloca(turno.getOrigem(), turno.getDestino(), quantidadeExercitos);
            return true;
        }
        return false;
    }
}
