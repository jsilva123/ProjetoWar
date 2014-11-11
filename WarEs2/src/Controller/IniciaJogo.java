
package Controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import model.CartaObjetivo;
import model.ConstantesEstados;
import model.Estado;
import model.Jogador;


public class IniciaJogo {
    
    
    public int[] embaralhaCartas(int numCartas){
        Random gerador = new Random();
        int[] idsCartas = new int[numCartas];
        for (int i = 0; i< numCartas; i++){
            idsCartas[i] = i;
        }
        for (int i = 0; i < numCartas; i++){
            int randomico = gerador.nextInt(numCartas);
            int aux2 = idsCartas[i];
            idsCartas[i] = idsCartas[randomico];
            idsCartas[randomico] = aux2;
        }
        return idsCartas;
    }
    
    public ArrayList<Jogador> iniciaJogadores( String[] nomes,Color[] cores){
        ArrayList<Jogador> jogadores = new ArrayList<>();
        for (int i = 0;i < nomes.length; i++){
            jogadores.add(i, new Jogador(nomes[i],cores[i]));
        }
        
        return jogadores;
    }
   
    
    public void distribuiObjetivo(ArrayList<Jogador> jogadores, int numObjetivos){
        CartaObjetivo objetivo ;
        int[] idsObjetivosEmbaralhados = embaralhaCartas(numObjetivos);
        
        for (int i = 0 ; i < jogadores.size() ; i++){
            objetivo = new CartaObjetivo(idsObjetivosEmbaralhados[i]);
            jogadores.get(i).setCartaObjetivo(objetivo);
        }
    } 
    
    
    
    public void distribuiTerritorios(ArrayList<Jogador> jogadores, int numTerritorios){
        int[] idsEstadosEmbaralhados;
        idsEstadosEmbaralhados = embaralhaCartas(numTerritorios);
        
        int corrente = 0;
        int ultimoJogador = 0;
        
        for (int i = 0 ; i < numTerritorios ; i++){
            jogadores.get(corrente).getEstados().add(new Estado(ConstantesEstados.getConstantesPorId(idsEstadosEmbaralhados[i])));
            ultimoJogador = corrente;
            corrente++;
            
            if (corrente == jogadores.size()){
                corrente = 0;
            }
        }
        jogadores.get(ultimoJogador).setUltimoJogador(true);
    }
    
}
