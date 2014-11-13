package model;

public class Estado {

    private final ConstantesEstados constantes;
    private int numeroExercitos;

    public Estado(ConstantesEstados constante) {
        this.numeroExercitos = 1;
        this.constantes = constante;
    }

    public int getIdEstado(){
        return constantes.getIdEstado();
    }
    
    public String getNome() {
        return constantes.getNome();
    }

    public int getNumeroExercitos() {
        return numeroExercitos;
    }

    public void setNumeroExercitos(int numeroExercitos) {
        this.numeroExercitos = numeroExercitos;
    }

    public int[] getVizinhos() {
        return constantes.getVizinhos();
    }
    
    public void ganhaExercitos(int quantidade){
        numeroExercitos = numeroExercitos + quantidade;
    }
    
    public void perdeExercitos(int quantidade){
        numeroExercitos = numeroExercitos - quantidade;
    }
    
    public ConstantesEstados getConstantesEstados(){
        return this.constantes;
    }

}
