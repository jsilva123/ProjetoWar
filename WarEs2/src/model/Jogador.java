
package model;

import java.awt.Color;
import java.util.ArrayList;

public class Jogador {
     
    private String nome;
    private Color cor;
    private ArrayList<Integer> estados;
    private CartaObjetivo Cartaobjetivo;
    private ArrayList<CartaEstado> cartasTerritorio;
    
    public Jogador(){
       
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

    public CartaObjetivo getCartaobjetivo() {
        return Cartaobjetivo;
    }

    public void setCartaobjetivo(CartaObjetivo Cartaobjetivo) {
        this.Cartaobjetivo = Cartaobjetivo;
    }

    public ArrayList<CartaEstado> getCartasTerritorio() {
        return cartasTerritorio;
    }

    public ArrayList<Integer> getEstados(){
        return estados;
    }
    
}
