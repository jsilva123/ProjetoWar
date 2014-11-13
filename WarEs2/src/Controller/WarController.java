/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.util.ArrayList;
import model.Baralho;
import model.Dado;
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
    
    private WarController(){
        dados = new Dado();
        baralho = new Baralho(12,28);
        regras = new Regras();
        iniciador = new IniciaJogo();
        numeroDaTroca = 0;
    }
    
    public static WarController getInstance(){
     if(instance == null)
         instance = new WarController();
     return instance;
    }

    public void setNumeroJogadores(int numeroJogadores){
        this.numeroJogadores = numeroJogadores;
    }
    
    public int getNumeroJogadores(){
        return numeroJogadores;
    }
    
    public void iniciaJogadores(int numeroJogadores, String[] nomes, Color[] cores){
        setNumeroJogadores(numeroJogadores);
        jogadores = iniciador.iniciaJogadores(nomes, cores);
    }
    
    public void distribuiEstados(){
        iniciador.distribuiTerritorios(jogadores, baralho.getCartasEstados());
    }
    
    public void distribuiObjetivos(){
       iniciador.distribuiObjetivo(jogadores, baralho.getCartasObjetivos());
    }
    
    public String getNomeJogador(int idJogador){
        return jogadores.get(idJogador).getNome();
    }
    
    public Color getCorJogador(int idJogador){
        return jogadores.get(idJogador).getCor();
    }
    
    public String getNomeCorJogador(int idJogador){
        return jogadores.get(idJogador).nomeDaCor();
    }
    
    public int getTotalDeExercitoJogador(int idJogador){
        return jogadores.get(idJogador).getTotalDeExercitos();
    }
    
    public void primeiraRodada(){
        turno.getJogadorCorrente();
    }
    
    public int nExercitosReceber (Jogador jogador){
        return (jogador.getEstados().size()/2);
    }
    
}
