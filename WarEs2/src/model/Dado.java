package model;

import java.util.Random;

public class Dado {
    
    private final Random gerador;
    private int numDado;

    public Dado(){
        gerador = new Random();
        this.numDado = 1;
    }
    
    public int[] jogarDado(int numeroDeDados){
        int[] numSorteados = new int[numeroDeDados];
        for(int i= 0;i< numeroDeDados;i++){
           numDado = gerador.nextInt(6);
           numSorteados[i] = numDado;
        }
        
        return numSorteados;
    }
    
}
