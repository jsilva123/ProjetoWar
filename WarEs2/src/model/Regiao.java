package model;

public class Regiao {

    private final ConstantesRegioes constantes; 
    private final int bonusExercito;

    public Regiao(int bonusExercito, ConstantesRegioes constantes) {
        this.constantes = constantes;
        this.bonusExercito = bonusExercito;
    }
    
    public int getBonusExercito(){
        return bonusExercito;
    }
    
    public String getNome(){
        return constantes.getNome();
    }
    
    public Estado[] getEstados(){
        return constantes.getEstados();
    }
    
}
