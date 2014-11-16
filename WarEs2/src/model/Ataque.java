package model;

import Controller.Regras;

public class Ataque {


    private Jogador jogadorAtacante;
    private Jogador JogadorDefensor;
    private int[] valorDadosAtaque;
    private int[] valorDadosDefesa;
    private int idEstadoAtacante;
    private int idEstadoDefesa;
    private Dado dados;

    private Regras regras;

    public Ataque() {
        this.regras = new Regras();
        this.dados = new Dado();
        this.idEstadoAtacante = -1;
        this.idEstadoDefesa = -1;
    }
    
    public int[] getValorDadosAtaque() {
        return valorDadosAtaque;
    }

    public void setValorDadosAtaque(int[] valorDadosAtaque) {
        this.valorDadosAtaque = valorDadosAtaque;
    }

    public int[] getValorDadosDefesa() {
        return valorDadosDefesa;
    }

    public void setValorDadosDefesa(int[] valorDadosDefesa) {
        this.valorDadosDefesa = valorDadosDefesa;
    }
    
    public Jogador getJogadorAtacante() {
        return jogadorAtacante;
    }

    public void setJogadorAtacante(Jogador jogadorAtacante) {
        this.jogadorAtacante = jogadorAtacante;
    }

    public Jogador getJogadorDefensor() {
        return JogadorDefensor;
    }

    public void setJogadorDefensor(Jogador JogadorDefensor) {
        this.JogadorDefensor = JogadorDefensor;
    }

    public int getIdEstadoAtacante() {
        return idEstadoAtacante;
    }

    public void setIdEstadoAtacante(int idEstadoAtacante) {
        this.idEstadoAtacante = idEstadoAtacante;
    }

    public int getIdEstadoDefesa() {
        return idEstadoDefesa;
    }

    public void setIdEstadoDefesa(int idEstadoDefesa) {
        this.idEstadoDefesa = idEstadoDefesa;
    }

    public boolean setOrigemAtaque(int idEstadoAtacante) {
        if (jogadorAtacante.getEstadoPorId(idEstadoAtacante).getNumeroExercitos() > 1) {
            this.idEstadoAtacante = idEstadoAtacante;
            return true;
        }
        return false;
    }

    public boolean setDestinoAtaque(int idEstadoDefensor) {
        this.idEstadoDefesa = idEstadoDefensor;
        return true;
    }

    public void batalha() {

            valorDadosDefesa = geraDadosDefesa();
            valorDadosAtaque = geraDadosAtaque();
            
            int comparacoes;
            //1º indice = numero de exercitos perdidos pelo atacante
            //2ª indice = numero de exercitos perdidos pelo defensor
            int[] perdas = {0, 0};
            if (valorDadosAtaque.length > valorDadosDefesa.length) {
                comparacoes = valorDadosDefesa.length;
            } else {
                comparacoes = valorDadosAtaque.length;
            }

            for (int i = 0; i < comparacoes; i++) {
                if (valorDadosAtaque[i] > valorDadosDefesa[i]) {
                    perdas[1]++;
                } else {
                    perdas[0]++;
                }
            }

            jogadorAtacante.perdeExercitos(idEstadoAtacante, perdas[0]);
            JogadorDefensor.perdeExercitos(idEstadoDefesa, perdas[1]);

            if (conquistaTerritorio()) {
                jogadorAtacante.setConquistouTerritorio(true);
                atualizaAposConquista(valorDadosAtaque.length - perdas[0]);
            }
    }
    
    
    public boolean conquistaTerritorio() {
        return JogadorDefensor.getEstadoPorId(idEstadoDefesa).getNumeroExercitos() == 0;
    }

    public void atualizaAposConquista(int qtdDeslocamento) {
        Estado conquistado = JogadorDefensor.getEstadoPorId(idEstadoDefesa);
        conquistado.setNumeroExercitos( qtdDeslocamento);
        jogadorAtacante.perdeExercitos(idEstadoAtacante, qtdDeslocamento);
        jogadorAtacante.getEstados().add(conquistado);
        JogadorDefensor.getEstados().remove(conquistado);
    }

   public boolean darCartaTerritorio( Baralho baralho) {
        if (jogadorAtacante.isConquistouTerritorio()) {
            jogadorAtacante.setConquistouTerritorio(false);
            jogadorAtacante.getCartasTerritorio().add(baralho.getCartasEstados().get(0));
            baralho.getCartasEstados().remove(0);
            return true;
        }
        return false;
    }
           

    public int[] geraDadosAtaque() {

        switch (jogadorAtacante.getEstadoPorId(idEstadoAtacante).getNumeroExercitos()) {
            case 2:
                return dados.jogarDado(1);
            case 3:
                return dados.jogarDado(2);
            default:
                return dados.jogarDado(3);
        }
    }

    public int[] geraDadosDefesa() {
        switch (JogadorDefensor.getEstadoPorId(idEstadoDefesa).getNumeroExercitos()) {
            case 1:
                return dados.jogarDado(1);
            case 2:
                return dados.jogarDado(2);
            case 3:
                return dados.jogarDado(3);
            default:
                return dados.jogarDado(3);
        }

    }


    public boolean escolheuOrigemDoAtaque() {
        return idEstadoAtacante >= 0;
    }

    public boolean escolheuDestinoAtaque() {
        return idEstadoDefesa >= 0;
    }

    public int[] vizinhosDoEstadoAtacante() {
        return jogadorAtacante.vizinhosDoEstadoQueNaoSaoDoJogador(idEstadoAtacante);
    }
    
    public boolean podeAtacar(){
        return (escolheuDestinoAtaque() && escolheuOrigemDoAtaque() && !jogadorAtacante.isConquistouTerritorio() 
                && (jogadorAtacante.getEstadoPorId(idEstadoAtacante).getNumeroExercitos() > 1) );
    }
    
   
}
