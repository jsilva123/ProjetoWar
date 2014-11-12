
package model;

public enum ConstantesEstados {

    // 1 = quadrado
    // 2 = triangulo
    // 3 = circulo
    // 4 = coringa
    
    ACRE(1, "Acre",2,new int[] {4,22}), 
    ALAGOAS(2, "Alagoas",1,new int[] {5,17,26}),
    AMAPA(3, "Amapá",3,new int[] {14}),
    AMAZONAS(4, "Amazonas",3,new int[] {1,14,22,23}),
    BAHIA(5, "Bahia",1,new int[] {2,8,9,13,17,18,26,27}),
    CEARA(6, "Ceará",1,new int[] {15,17,18,20}),
    DISTRITOFEDERAL(7, "Distrito Federal",1,new int[] {9,13}),
    ESPIRITOSANTO(8, "Espírito Santo",1,new int[] {5,13,19}),
    GOIAS(9, "Goiás",3,new int[] {5,7,11,12,13,27}),
    MARANHAO(10, "Maranhão",2,new int[] {14,18,27}),
    MATOGROSSO(11, "Mato Grosso",2,new int[] {12,9,27,14,4,22}),
    MATOGROSSODOSUL(12,"",2,new int[] {11,9,13,25,14}),
    MINASGERAIS(13, "Minas Gerais",3,new int[] {8,19,25,12,9,7,5}),
    PARA(14, "Pará",1,new int[] {3,10,27,11,4,23}),
    PARAIBA(15, "Paraíba",2,new int[] {17,6,20}),
    PARANA(16, "Paraná",3,new int[] {12,25,24}),
    PERNAMBUCO(17, "Pernambuco",3,new int[] {2,5,18,6,15}),
    PIAUI(18, "Piauí",3,new int[] {5,27,10,6,17}),
    RIODEJANEIRO(19, "Rio de Janeiro",2,new int[] {8,13,25}), 
    RIOGRANDEDONORTE(20, "Rio Grande do Norte",3,new int[] {6,15}),
    RIOGRANDEDOSUL(21, "Rio Grande do Sul",2,new int[] {24}),
    RONDONIA(22, "Rondônia",1,new int[] {11,4,1}),
    RORAIMA(23, "Roraima",1,new int[] {4,14}),
    SANTACATARINA(24, "Santa Catarina",1,new int[] {21,16}),
    SAOPAULO(25, "São Paulo",2,new int[] {16,12,19}),
    SERGIPE(26, "Sergipe",2,new int[] {5,2}),
    TOCANTINS(27, "Tocantins",3,new int[] {9,11,14,10,18,5}),
    CURINGA(28,"Curinga",4,new int []{});

    private final int idEstado;
    private final int simbolo;
    private final String nome;
    private final int[] vizinhos;

    private ConstantesEstados(int id, String nome,int simbolo,int[] vizinhos) {
        this.idEstado = id;
        this.nome = nome;
        this.simbolo = simbolo;
        this.vizinhos = vizinhos;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public String getNome() {
        return nome;
    }
    
    public int getSimbolo(){
        return simbolo;
    }
    
    public int[] getVizinhos(){
        return vizinhos;
    }
    
    public static ConstantesEstados getConstantesPorId(int idEstado){
        for(ConstantesEstados c : ConstantesEstados.values()){
            if (c.getIdEstado() == idEstado)
                return c;
        }
        return ConstantesEstados.ACRE;
    }
    
}
