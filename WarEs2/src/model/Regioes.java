package model;

public enum Regioes {

    NORTE(1, "Norte", 4, new Estado[]{
        new Estado(ConstantesEstados.ACRE),
        new Estado(ConstantesEstados.RONDONIA),
        new Estado(ConstantesEstados.AMAZONAS),
        new Estado(ConstantesEstados.RORAIMA),
        new Estado(ConstantesEstados.AMAPA),
        new Estado(ConstantesEstados.PARA),
        new Estado(ConstantesEstados.TOCANTINS)}),
    NORDESTE(2, "Nordeste", 5, new Estado[]{
        new Estado(ConstantesEstados.MARANHAO),
        new Estado(ConstantesEstados.PIAUI),
        new Estado(ConstantesEstados.BAHIA),
        new Estado(ConstantesEstados.SERGIPE),
        new Estado(ConstantesEstados.ALAGOAS),
        new Estado(ConstantesEstados.PERNAMBUCO),
        new Estado(ConstantesEstados.RIOGRANDEDONORTE),
        new Estado(ConstantesEstados.CEARA),
        new Estado(ConstantesEstados.PARAIBA)}),
    CENTROOESTE(3, "Centro Oeste", 4, new Estado[]{
        new Estado(ConstantesEstados.MATOGROSSO),
        new Estado(ConstantesEstados.MATOGROSSODOSUL),
        new Estado(ConstantesEstados.GOIAS),
        new Estado(ConstantesEstados.DISTRITOFEDERAL)}),
    SUDESTE(4, "Sudeste", 3, new Estado[]{
        new Estado(ConstantesEstados.RIODEJANEIRO),
        new Estado(ConstantesEstados.SAOPAULO),
        new Estado(ConstantesEstados.MINASGERAIS),
        new Estado(ConstantesEstados.ESPIRITOSANTO)}),
    SUL(5, "Sul", 2, new Estado[]{
        new Estado(ConstantesEstados.SANTACATARINA),
        new Estado(ConstantesEstados.RIOGRANDEDOSUL),
        new Estado(ConstantesEstados.PARANA)});

    private final int idRegiao;
    private final String nome;
    private final Estado[] estados;
    private final int bonusExercito;

    private Regioes(int id, String nome, int bonusExercito, Estado[] estados) {
        this.idRegiao = id;
        this.nome = nome;
        this.bonusExercito = bonusExercito;
        this.estados = estados;
    }

    public int getIdRegiao() {
        return idRegiao;
    }

    public String getNome() {
        return nome;
    }

    public Estado[] getEstados() {
        return estados;
    }

    public int getBonusExercito() {
        return bonusExercito;
    }

}
