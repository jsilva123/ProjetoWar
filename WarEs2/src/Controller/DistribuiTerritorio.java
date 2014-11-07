/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.Random;
import model.CartaEstado;
import model.ConstantesEstados;
import model.Jogador;

/**
 *
 * @author Luiz Felipe
 */
public class DistribuiTerritorio {

    private ArrayList<CartaEstado> baralhoTerritorio;

    public void geraBaralho() {
        Random random = new Random();
        int indice;
        baralhoTerritorio = new ArrayList<>(24);
        CartaEstado carta;
        for (ConstantesEstados e : ConstantesEstados.values()) {
            //carta = new CartaEstado(e);
            if (baralhoTerritorio.isEmpty()) {
               // baralhoTerritorio.add(random.nextInt(25) + 1, carta);
            } else {
                do {
                    indice = random.nextInt(25) + 1;
                } while (baralhoTerritorio.get(indice) == null);

               // baralhoTerritorio.add(indice, carta);
            }

        }
    }

    public void distribui(ArrayList<Jogador> jogadores) {
        int cont = 24;
        int qtdJogadores = jogadores.size();
        int aux = 0;
        if (cont % qtdJogadores != 0) {
            cont = cont - (cont % qtdJogadores);
        }
        while (cont > 0) {
            jogadores.get(aux).getCartasTerritorio().add(baralhoTerritorio.get(cont));
            cont--;
            aux++;
            if (aux == qtdJogadores) {
                aux = 0;
            }
        }

    }

    public ArrayList<CartaEstado> getBaralhoTerritorio() {
        return baralhoTerritorio;
    }

}
