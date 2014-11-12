package model;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {

    private ArrayList<CartaEstado> cartasEstados;
    private ArrayList<CartaObjetivo> cartasObjetivos;
    private final int numObjetivos;
    private final int numTerritorios;
    
    public Baralho(int numObjetivos, int numTerritorios){
        this.numObjetivos = numObjetivos;
        this.numTerritorios = numTerritorios;
        cartasEstados = new ArrayList<>();
        cartasObjetivos = new ArrayList<>();
        criaCartasObjetivo();
        criaCartasTerritorio();
    }

    public ArrayList<CartaEstado> getCartasEstados() {
        return cartasEstados;
    }

    public ArrayList<CartaObjetivo> getCartasObjetivos() {
        return cartasObjetivos;
    }

    public void criaCartasObjetivo(){
        int[] idsObjetivosEmbaralhados;
        idsObjetivosEmbaralhados = embaralhaCartas(numObjetivos);
        for (int i = 0; i < idsObjetivosEmbaralhados.length; i++) {
            cartasObjetivos.add(new CartaObjetivo(idsObjetivosEmbaralhados[i]));
        }
    }
    
    public void criaCartasTerritorio(){
        int[] idsEstadosEmbaralhados;
        idsEstadosEmbaralhados = embaralhaCartas(numTerritorios);
        for (int i = 0; i < idsEstadosEmbaralhados.length; i++) {
            cartasEstados.add(new CartaEstado(ConstantesEstados.getConstantesPorId(idsEstadosEmbaralhados[i])));
        }
    }
    
    public int[] embaralhaCartas(int numCartas){
        Random gerador = new Random();
        int[] idsCartas = new int[numCartas];
        for (int i = 0; i< numCartas; i++){
            idsCartas[i] = i;
        }
        for (int i = 0; i < numCartas; i++){
            int randomico = gerador.nextInt(numCartas);
            int aux2 = idsCartas[i];
            idsCartas[i] = idsCartas[randomico];
            idsCartas[randomico] = aux2;
        }
        return idsCartas;
    }
    
}
