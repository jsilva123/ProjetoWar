
package model;

import java.util.ArrayList;


public class War {
 
    private boolean fimDeJogo;
    private int numeroDaTroca;
    private int numeroJogadores;
    private int numeroTerritorios;
    private ArrayList<Jogador> jogadores;
    
    public War(int numeroJodagores){
        this.fimDeJogo = false;
        this.numeroJogadores = numeroJodagores;
        this.numeroTerritorios = 27;
    }
    
    
    public void gameLoop(){
        
        
        while(!fimDeJogo){
            
            
            
            
            
   
        }
        
        
        
    }
    
    
    
    
    
    
    
    public void primeiraRodada(){
        
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).isUltimoJogador()){
                
                
                
            }
            
        }
         
    }
    
    public int nExercitosReceber (Jogador jogador){
        
        return (jogador.getEstados().size()/2);
        
    }
    
    
}
