
package model;

public class Turno {
    
    private int jogadorCorrente;
    private int etapa;
    private final int numMaxEtapa;
    
    private Turno(int numMaxEtapa){
        this.jogadorCorrente = 0;
        this.etapa = 1;
        this.numMaxEtapa = numMaxEtapa;
    }
    
    public int getEtapa(){
     return etapa;
    }
    
    public int getJogadorCorrente(){
        return jogadorCorrente;
    }
    
    public void finalizaTurno(int numJogadores){
        jogadorCorrente++;
        if (jogadorCorrente == numJogadores){
            jogadorCorrente = 0;
        }
              
    }
    
    public void finalizaEtapa(){
        etapa++;
        if(etapa == numMaxEtapa){
            etapa = 1;
        }
    }
    
}
