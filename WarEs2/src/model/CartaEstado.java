package model;

public class CartaEstado extends Carta{
 
    private int idCartaEstado;
    private String simbolo;
    private ConstantesEstados territorio;
    
    public CartaEstado(ConstantesEstados t,String simbolo, int idCartaEstado){
        territorio = ConstantesEstados.ACRE;
        this.simbolo = simbolo;
        this.idCartaEstado = idCartaEstado;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
    public int getIdCartaEstado(){
        return idCartaEstado;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public ConstantesEstados getTerritorio() {
        return territorio;
    }

    public void setTerritorio(ConstantesEstados territorio) {
        this.territorio = territorio;
    }
    
    
}
