    package model;

public class CartaEstado {
 
    // 1 = quadrado
    // 2 = triangulo
    // 3 = circulo
    // 4 = coringa
    
    private final ConstantesEstados estado;
    
    public CartaEstado(ConstantesEstados estado){
        this.estado = estado;
    }
    
    public int getSimbolo() {
        return estado.getSimbolo();
    }
    
    public int getIdCartaEstado(){
        return estado.getIdEstado();
    }

    public ConstantesEstados getEstado() {
        return estado;
    }
    
}
