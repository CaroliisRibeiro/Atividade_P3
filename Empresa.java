public class Empresa {
    
    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores;
    private String end;
    private int numFuncionarioas;
    private String ceo;



    public Empresa( String nome, String cnpj, String end, String ceo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new Trabalhador[20];
        this.end = end;
        this.numFuncionarioas = 0;
        this.ceo = ceo;


       }

      
       public void contratar(Trabalhador novoFuncionario) {
        int numFuncionarios = 0;
        if (numFuncionarios < trabalhadores.length) {
            trabalhadores[numFuncionarios] = novoFuncionario;
            numFuncionarios++;
        } else {
            System.out.println("A empresa atingiu o limite de funcionários.");
        }
    }


    public void trabalhar() {
        for (Trabalhador trabalhador : trabalhadores) {
            if (!trabalhador.isFerias()) {
                trabalhador.trabalharPorHora(8);
            }
        }
    }

    public void calcularPagamento() {
        double totalPagamento = 0;
        for (Trabalhador trabalhador : trabalhadores) {
            totalPagamento += trabalhador.getHorasTrabalhadas() * trabalhador.getValorDaHora();
        }
        System.out.println("Total de pagamento a ser efetuado pela empresa: R$" + totalPagamento);
    }

    
}
