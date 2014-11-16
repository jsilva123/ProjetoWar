package model;

import java.awt.Color;
import java.util.ArrayList;

public class Jogador {

    private String nome;
    private Color cor;
    private ArrayList<Estado> estados;
    private boolean ultimoJogador;
    private CartaObjetivo Cartaobjetivo;
    private ArrayList<CartaEstado> cartasTerritorio;
    private int nExercitosGanhos;
    private int idUltimoDestinoDeslocamento;
    private boolean ativo;
    private Color assassino;
    private boolean conquistouTerritorio;


    public Jogador(String nome, Color cor) {
        this.ultimoJogador = false;
        this.nExercitosGanhos = 0;
        this.nome = nome;
        this.cor = cor;
        this.estados = new ArrayList<>();
        this.cartasTerritorio = new ArrayList<>();
        this.idUltimoDestinoDeslocamento = -1;
        
        this.ativo = true;
    }

    public Estado getUltimoDestinoDeslocamento() {
        return getEstadoPorId(idUltimoDestinoDeslocamento);
    }

    public void setIdUltimoDestinoDeslocamento(int idUltimoDestinoDeslocamento) {
        this.idUltimoDestinoDeslocamento = idUltimoDestinoDeslocamento;
    }

    public int getnExercitosGanhos() {
        return nExercitosGanhos;
    }

    public void setnExercitosGanhos(int nExercitosGanhos) {
        this.nExercitosGanhos = nExercitosGanhos;
    }

    public boolean isUltimoJogador() {
        return ultimoJogador;
    }

    public void setUltimoJogador(boolean ultimoJogador) {
        this.ultimoJogador = ultimoJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public CartaObjetivo getCartaObjetivo() {
        return Cartaobjetivo;
    }

    public void setCartaObjetivo(CartaObjetivo Cartaobjetivo) {
        this.Cartaobjetivo = Cartaobjetivo;
    }

    public ArrayList<CartaEstado> getCartasTerritorio() {
        return cartasTerritorio;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void ganhaExercitos(int idEstado, int quantidade) {
        estados.stream().filter((estado) -> (estado.getIdEstado() == idEstado)).forEach((estado) -> {
            estado.ganhaExercitos(quantidade);
        });
    }

    public void perdeExercitos(int idEstado, int quantidade) {
        estados.stream().filter((estado) -> (estado.getIdEstado() == idEstado)).forEach((estado) -> {
            estado.perdeExercitos(quantidade);
        });
    }

    public int getTotalDeExercitos() {
        int total = 0;
        total = estados.stream().map((estado) -> estado.getNumeroExercitos()).reduce(total, Integer::sum);
        return total;
    }

    public int getNumExercitoNoEstado(int idEstado) {
        int numeroExercito = 0;
        for (Estado estado : estados) {
            if (estado.getIdEstado() == idEstado) {
                numeroExercito = estado.getNumeroExercitos();
            }
        }
        return numeroExercito;
    }

    public String nomeDaCor() {
        if (getCor() == Color.RED) {
            return "Vermelho";
        } else if (getCor() == Color.BLACK) {
            return "Preto";
        } else if (getCor() == Color.LIGHT_GRAY) {
            return "Cinza";
        } else if (getCor() == Color.GREEN) {
            return "Verde";
        } else if (getCor() == Color.YELLOW) {
            return "Amarelo";
        } else {
            return "Azul";
        }
    }

    
    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Color getAssassino() {
        return assassino;
    }

    public void setAssassino(Color assassino) {
        this.assassino = assassino;
    }

    public CartaObjetivo getCartaobjetivo() {
        return Cartaobjetivo;
    }

    public void setCartaobjetivo(CartaObjetivo Cartaobjetivo) {
        this.Cartaobjetivo = Cartaobjetivo;
    }

    public boolean isConquistouTerritorio() {
        return conquistouTerritorio;
    }

    public void setConquistouTerritorio(boolean conquistouTerritorio) {
        this.conquistouTerritorio = conquistouTerritorio;
    }
    
    public Estado getEstadoPorId(int idEstado){
        for (Estado estado : estados) {
            if(estado.getIdEstado() == idEstado){
                return estado;
            }
        }
        return null;
    }
    public int[] getIdsEstados(){// todos os ids de estado de um jogador
        int[] ids = new int[estados.size()];
        for (int i = 0; i < estados.size(); i++) {
              ids[i] = estados.get(i).getIdEstado();
        }
        return ids;
    }
    
    /**
     * Desloca exercitos do estado origem para o estado destino
     *
     * @author Pessanha e Martelo
     * @param origem Local atual do exercito
     * @param destino Local para onde o exercito sera alocado
     * @param qtdDeslocamento quantidade de exercito a ser deslocada
     */
    public void desloca(int origem, int destino, int qtdDeslocamento) {
        getEstadoPorId(origem).perdeExercitos(qtdDeslocamento);
        getEstadoPorId(destino).ganhaExercitos(qtdDeslocamento);
        idUltimoDestinoDeslocamento = getEstadoPorId(destino).getIdEstado();
    }
    
    public boolean distribuiExercito( int idEstado, int qtd) {
        if (qtd <= nExercitosGanhos) {
            ganhaExercitos(idEstado, qtd);
            nExercitosGanhos = nExercitosGanhos - qtd;
            return true;
        } else {
            return false;
        }

    }
    
    public boolean possuitalEstado(int idEstado){
        if (estados.stream().anyMatch((estado) -> (estado.getIdEstado() == idEstado))) {
            return true;
        }
        return false;
    }
    
    public int[] vizinhosDoEstadoQueNaoSaoDoJogador(int idEstadoAtacante){
        int[] idsDosvizinhos;
        idsDosvizinhos = getEstadoPorId(idEstadoAtacante).getVizinhos();
        
        ArrayList<Integer> idsCorretos = new ArrayList<>();
        
        for (int i = 0; i < idsDosvizinhos.length; i++) {
           if(!possuitalEstado(idsDosvizinhos[i])){
               idsCorretos.add(idsDosvizinhos[i]);
           }
        }
        int[] idsRetorno = new int[idsCorretos.size()];
        for (int i = 0; i < idsRetorno.length; i++) {
           idsRetorno[i] = idsCorretos.get(i);
            
        }
        return idsRetorno;
    }

}
