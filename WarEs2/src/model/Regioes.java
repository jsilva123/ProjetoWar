    package model;

public enum Regioes {

    NORTE(1, "Norte", 4, new ConstantesEstados[]{
        ConstantesEstados.ACRE,
        ConstantesEstados.RONDONIA,
        ConstantesEstados.AMAZONAS,
        ConstantesEstados.RORAIMA,
        ConstantesEstados.AMAPA,
        ConstantesEstados.PARA,
        ConstantesEstados.TOCANTINS}),
    NORDESTE(2, "Nordeste", 5, new ConstantesEstados[]{
        ConstantesEstados.MARANHAO,
        ConstantesEstados.PIAUI,
        ConstantesEstados.BAHIA,
        ConstantesEstados.SERGIPE,
        ConstantesEstados.ALAGOAS,
        ConstantesEstados.PERNAMBUCO,
        ConstantesEstados.RIOGRANDEDONORTE,
        ConstantesEstados.CEARA,
        ConstantesEstados.PARAIBA}),
    CENTROOESTE(3, "Centro Oeste", 4, new ConstantesEstados[]{
        ConstantesEstados.MATOGROSSO,
        ConstantesEstados.MATOGROSSODOSUL,
        ConstantesEstados.GOIAS,
        ConstantesEstados.DISTRITOFEDERAL}),
    SUDESTE(4, "Sudeste", 3, new ConstantesEstados[]{
        ConstantesEstados.RIODEJANEIRO,
        ConstantesEstados.SAOPAULO,
        ConstantesEstados.MINASGERAIS,
        ConstantesEstados.ESPIRITOSANTO}),
    SUL(5, "Sul", 2, new ConstantesEstados[]{
        ConstantesEstados.SANTACATARINA,
        ConstantesEstados.RIOGRANDEDOSUL,
        ConstantesEstados.PARANA});

    private final int idRegiao;
    private final String nome;
    private final ConstantesEstados[] estados;
    private final int bonusExercito;

    private Regioes(int id, String nome, int bonusExercito, ConstantesEstados[] estados) {
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

    public ConstantesEstados[] getEstados() {
        return estados;
    }

    public int getBonusExercito() {
        return bonusExercito;
    }

}
