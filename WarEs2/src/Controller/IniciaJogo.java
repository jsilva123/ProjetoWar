package Controller;

import java.awt.Color;
import java.util.ArrayList;
import model.CartaEstado;
import model.CartaObjetivo;
import model.ConstantesEstados;
import model.Estado;
import model.Jogador;

public class IniciaJogo {

    public ArrayList<Jogador> iniciaJogadores(String[] nomes, Color[] cores) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        for (int i = 0; i < nomes.length; i++) {
            jogadores.add(i, new Jogador(nomes[i], cores[i]));
        }

        return jogadores;
    }

    public void distribuiObjetivo(ArrayList<Jogador> jogadores, ArrayList<CartaObjetivo> cartaObjetivos) {
        for (int i = 0; i < jogadores.size(); i++) {
            jogadores.get(i).setCartaObjetivo(cartaObjetivos.remove(i));
        }
    }

    public void distribuiTerritorios(ArrayList<Jogador> jogadores, ArrayList<CartaEstado> cartaEstados) {

        int corrente = 0;
        int ultimoJogador = 0;

        for (CartaEstado cartaEstado : cartaEstados) {
            if (cartaEstado.getSimbolo() != 4) { // para não distribuir curingas no início
                jogadores.get(corrente).getEstados().add(new Estado(cartaEstado.getEstado()));
                ultimoJogador = corrente;
                corrente++;
                if (corrente == jogadores.size()) {
                    corrente = 0;
                }
            }
        }
        jogadores.get(ultimoJogador).setUltimoJogador(true);
    }

}
