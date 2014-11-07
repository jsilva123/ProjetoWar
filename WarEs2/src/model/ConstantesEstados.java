
package model;

public enum ConstantesEstados {

    ACRE(1, "Acre",new int[] {4,22}), 
    ALAGOAS(2, "Alagoas",new int[] {5,17,26}),
    AMAPA(3, "Amapá",new int[] {14}),
    AMAZONAS(4, "Amazonas",new int[] {1,14,22,23}),
    BAHIA(5, "Bahia",new int[] {2,8,9,13,17,18,26,27}),
    CEARA(6, "Ceará",new int[] {15,17,18,20}),
    DISTRITOFEDERAL(7, "Distrito Federal",new int[] {9,13}),
    ESPIRITOSANTO(8, "Espírito Santo",new int[] {5,13,19}),
    GOIAS(9, "Goiás",new int[] {5,7,11,12,13,27}),
    MARANHAO(10, "Maranhão",new int[] {14,18,27}),
    MATOGROSSO(11, "Mato Grosso",new int[] {12,9,27,14,4,22}),
    MATOGROSSODOSUL(12,"",new int[] {11,9,13,25,14}),
    MINASGERAIS(13, "Minas Gerais",new int[] {8,19,25,12,9,7,5}),
    PARA(14, "Pará",new int[] {3,10,27,11,4,23}),
    PARAIBA(15, "Paraíba",new int[] {17,6,20}),
    PARANA(16, "Paraná",new int[] {12,25,24}),
    PERNAMBUCO(17, "Pernambuco",new int[] {2,5,18,6,15}),
    PIAUI(18, "Piauí",new int[] {5,27,10,6,17}),
    RIODEJANEIRO(19, "Rio de Janeiro",new int[] {8,13,25}), 
    RIOGRANDEDONORTE(20, "Rio Grande do Norte",new int[] {6,15}),
    RIOGRANDEDOSUL(21, "Rio Grande do Sul",new int[] {24}),
    RONDONIA(22, "Rondônia",new int[] {11,4,1}),
    RORAIMA(23, "Roraima",new int[] {4,14}),
    SANTACATARINA(24, "Santa Catarina",new int[] {21,16}),
    SAOPAULO(25, "São Paulo",new int[] {16,12,19}),
    SERGIPE(26, "Sergipe",new int[] {5,2}),
    TOCANTINS(27, "Tocantins",new int[] {9,11,14,10,18,5});

    private final int idEstado;
    private final String nome;
    private final int[] vizinhos;

    private ConstantesEstados(int id, String nome,int[] vizinhos) {
        this.idEstado = id;
        this.nome = nome;
        this.vizinhos = vizinhos;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public String getNome() {
        return nome;
    }
    
    public int[] getVizinhos(){
        return vizinhos;
    }
    
}
