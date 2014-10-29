
package model;

public enum NomesEstados {

    ACRE(1, "Acre"), ALAGOAS(2, "Alagoas"), AMAPA(3, "Amapá"), AMAZONAS(4, "Amazonas"),
    BAHIA(5, "Bahia"), CEARA(6, "Ceará"), DISTRITOFEDERAL(7, "Distrito Federal"),
    ESPIRITOSANTO(8, "Espírito Santo"), GOIAS(9, "Goiás"), MARANHAO(10, "Maranhão"),
    MATOGROSSO(11, "Mato Grosso"), MINASGERAIS(12, "Minas Gerais"), PARA(13, "Pará"),
    PARAIBA(14, "Paraíba"), PARANA(15, "Paraná"), PERNAMBUCO(16, "Pernambuco"),
    PIAUI(17, "Piauí"), RIODEJANEIRO(18, "Rio de Janeiro"), RIOGRANDEDONORTE(19, "Rio Grande do Norte"),
    RIOGRANDEDOSUL(20, "Rio Grande do Sul"), RONDONIA(21, "Rondônia"), RORAIMA(22, "Roraima"),
    SANTACATARINA(23, "Santa Catarina"), SAOPAULO(24, "São Paulo"), SERGIPE(25, "Sergipe"),
    TOCANTINS(26, "Tocantins");

    private final int idEstado;
    private final String nome;

    private NomesEstados(int id, String nome) {
        this.idEstado = id;
        this.nome = nome;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public String getNome() {
        return nome;
    }

}
