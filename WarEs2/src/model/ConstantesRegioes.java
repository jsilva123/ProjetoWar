
package model;

public enum ConstantesRegioes {

    NORTE(1,"Norte",new Estado[] {
    new Estado(ConstantesEstados.ACRE),
    new Estado(ConstantesEstados.ACRE)}),
    
    NORDESTE(2,"Nordeste",new Estado[] {}),
    CENTROOESTE(3,"Centro Oeste",new Estado[] {}),
    SUDESTE(4,"Sudeste",new Estado[] {}),
    SUL(5,"Sul",new Estado[] {});
    
    private final int idRegiao;
    private final String nome;
    private final Estado[] estados;
    
    private ConstantesRegioes(int id, String nome, Estado[] estados){
        this.idRegiao = id;
        this.nome = nome;
        this.estados = estados;
    }
    
    public int getIdRegiao(){
        return idRegiao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Estado[] getEstados(){
        return estados;
    }
    
}
