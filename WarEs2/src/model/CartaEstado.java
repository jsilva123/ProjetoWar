    package model;

public class CartaEstado {
 
    // 1 = quadrado
    // 2 = triangulo
    // 3 = circulo
    // 4 = coringa
    
    private final Estado estado;
    
    public CartaEstado(ConstantesEstados estado){
        this.estado = new Estado(estado);
    }
    
    public int getSimbolo() {
        return estado.getConstantesEstados().getSimbolo();
    }
    
    public int getIdCartaEstado(){
        return estado.getIdEstado();
    }

    public Estado getEstado() {
        return estado;
    }
    
}
