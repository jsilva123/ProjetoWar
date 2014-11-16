
package model;

public enum ConstantesEstados {

    // 1 = quadrado
    // 2 = triangulo
    // 3 = circulo
    // 4 = coringa
    
    ACRE(0, "Acre",2,new int[] {3,21}), 
    ALAGOAS(1, "Alagoas",1,new int[] {4,16,25}),
    AMAPA(2, "Amapá",3,new int[] {13}),
    AMAZONAS(3, "Amazonas",3,new int[] {0,13,21,22}),
    BAHIA(4, "Bahia",1,new int[] {1,7,8,12,16,17,25,26}),
    CEARA(5, "Ceará",1,new int[] {14,16,17,19}),
    DISTRITOFEDERAL(6, "Distrito Federal",1,new int[] {8,12}),
    ESPIRITOSANTO(7, "Espírito Santo",1,new int[] {4,12,18}),
    GOIAS(8, "Goiás",3,new int[] {4,6,10,11,12,26}),
    MARANHAO(9, "Maranhão",2,new int[] {13,17,26}),
    MATOGROSSO(10, "Mato Grosso",2,new int[] {11,8,26,13,3,21}),
    MATOGROSSODOSUL(11,"",2,new int[] {10,8,12,24,13}),
    MINASGERAIS(12, "Minas Gerais",3,new int[] {7,18,24,11,8,6,4}),
    PARA(13, "Pará",1,new int[] {2,9,26,10,3,22}),
    PARAIBA(14, "Paraíba",2,new int[] {16,5,19}),
    PARANA(15, "Paraná",3,new int[] {11,24,23}),
    PERNAMBUCO(16, "Pernambuco",3,new int[] {1,4,17,5,14}),
    PIAUI(17, "Piauí",3,new int[] {4,26,9,5,16}),
    RIODEJANEIRO(18, "Rio de Janeiro",2,new int[] {7,12,24}), 
    RIOGRANDEDONORTE(19, "Rio Grande do Norte",3,new int[] {5,14}),
    RIOGRANDEDOSUL(20, "Rio Grande do Sul",2,new int[] {23}),
    RONDONIA(21, "Rondônia",1,new int[] {10,3,0}),
    RORAIMA(22, "Roraima",1,new int[] {3,13}),
    SANTACATARINA(23, "Santa Catarina",1,new int[] {20,15}),
    SAOPAULO(24, "São Paulo",2,new int[] {15,11,18}),
    SERGIPE(25, "Sergipe",2,new int[] {4,1}),
    
    TOCANTINS(26, "Tocantins",3,new int[] {8,10,13,9,17,4}),
    CURINGA(27,"Curinga",4,new int []{});

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
