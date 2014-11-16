package model;

import java.util.Random;

public class Dado {

    private final Random gerador;
    private int numDado;

    public Dado() {
        gerador = new Random();
        this.numDado = 1;
    }

    public int[] jogarDado(int numeroDeDados) {
        int[] numSorteados = new int[numeroDeDados];
        for (int i = 0; i < numeroDeDados; i++) {
            numDado = gerador.nextInt(6) + 1;
            numSorteados[i] = numDado;
        }

        return bubbleSort(numSorteados);
    }

    public int[] bubbleSort(int[] intArray) {

        int n = intArray.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (intArray[j - 1] < intArray[j]) {
                    //swap the elements!
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }
        return intArray;
    }
}
