package model;

public class CartaTerritorio extends Carta{
 
    private String simbolo;
    private ConstantesEstados territorio;
    
    public CartaTerritorio(ConstantesEstados t){
        territorio = ConstantesEstados.ACRE;
        
    }

    public String getSimbolo() {
        return simbolo;
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
