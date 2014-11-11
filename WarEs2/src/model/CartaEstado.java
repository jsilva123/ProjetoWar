    package model;

public class CartaEstado implements Carta{
 
    // 1 = quadrado
    // 2 = triangulo
    // 3 = circulo
    // 4 = coringa
    
    private final int idCartaEstado;
    private int simbolo;
    private ConstantesEstados estado;
    
    public CartaEstado(ConstantesEstados estado,int simbolo, int idCartaEstado){
        this.estado = estado;
        this.simbolo = simbolo;
        this.idCartaEstado = idCartaEstado;
    }
    /**
     * construtor para carta CORINGA
     * @param simbolo
     * @param idCartaEstado 
     */
    public CartaEstado(int simbolo, int idCartaEstado){
        this.simbolo = simbolo;
        this.idCartaEstado = idCartaEstado;
    }

    public int getSimbolo() {
        return simbolo;
    }
    
    public int getIdCartaEstado(){
        return idCartaEstado;
    }

    public void setSimbolo(int simbolo) {
        this.simbolo = simbolo;
    }

    public ConstantesEstados getEstado() {
        return estado;
    }

    public void setTerritorio(ConstantesEstados estado) {
        this.estado = estado;
    }

    @Override
    public int getIdCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDescricao(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
