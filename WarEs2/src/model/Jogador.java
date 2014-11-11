package model;

import java.awt.Color;
import java.util.ArrayList;

public class Jogador {

    private String nome;
    private Color cor;
    private ArrayList<Estado> estados;
    private boolean ultimoJogador;
    private CartaObjetivo Cartaobjetivo;
    private ArrayList<CartaEstado> cartasTerritorio;
    private int nExercitosGanhos;

    public Jogador(String nome, Color cor) {
        this.ultimoJogador = false;
        this.nExercitosGanhos = 0;
        this.nome = nome;
        this.cor = cor;
    }

    public int getnExercitosGanhos() {
        return nExercitosGanhos;
    }

    public void setnExercitosGanhos(int nExercitosGanhos) {
        this.nExercitosGanhos = nExercitosGanhos;
    }

    public boolean isUltimoJogador() {
        return ultimoJogador;
    }

    public void setUltimoJogador(boolean ultimoJogador) {
        this.ultimoJogador = ultimoJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public CartaObjetivo getCartaObjetivo() {
        return Cartaobjetivo;
    }

    public void setCartaObjetivo(CartaObjetivo Cartaobjetivo) {
        this.Cartaobjetivo = Cartaobjetivo;
    }

    public ArrayList<CartaEstado> getCartasTerritorio() {
        return cartasTerritorio;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void ganhaExercitos(int idEstado, int quantidade) {
        estados.stream().filter((estado) -> (estado.getIdEstado() == idEstado)).forEach((estado) -> {
            estado.ganhaExercitos(quantidade);
        });
    }

    public void perdeExercitos(int idEstado, int quantidade) {
        estados.stream().filter((estado) -> (estado.getIdEstado() == idEstado)).forEach((estado) -> {
            estado.perdeExercitos(quantidade);
        });
    }

    public int getNumExercitoNoEstado(int idEstado) {
       int numeroExercito = 0;
        for (Estado estado : estados) {
            if (estado.getIdEstado() == idEstado) {
                numeroExercito = estado.getNumeroExercitos();
            } 
        }
       return numeroExercito;
    }

}
