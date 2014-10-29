package model;

import java.util.ArrayList;

public class Estado {

    private NomesEstados nome;
    private int numeroExercitos;
    private ArrayList<Estado> vizinhos;

    public Estado(int numeroExercitos, NomesEstados nome, ArrayList<Estado> vizinhos) {
        this.numeroExercitos = numeroExercitos;
        this.nome = nome;
        this.vizinhos = vizinhos;
    }

    public NomesEstados getNome() {
        return nome;
    }

    public void setNome(NomesEstados nome) {
        this.nome = nome;
    }

    public int getNumeroExercitos() {
        return numeroExercitos;
    }

    public void setNumeroExercitos(int numeroExercitos) {
        this.numeroExercitos = numeroExercitos;
    }

    public ArrayList<Estado> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(ArrayList<Estado> vizinhos) {
        this.vizinhos = vizinhos;
    }

}
