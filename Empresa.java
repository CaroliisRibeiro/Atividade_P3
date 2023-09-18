public class Empresa {
    
    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores = new Trabalhador[20];
    private String end;
    private int numFuncionarioas;
    private String ceo;



    public Empresa( String nome, String cnpj, Trabalhador[] trabalhadores, String end, int numFuncionarioas, String ceo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = trabalhadores;
        this.end = end;
        this.numFuncionarioas = numFuncionarioas;
        this.ceo = ceo;


       }

       public void contratar(){

        int cont = 0;
        
        for (Trabalhador trabalhador : trabalhadores) {

            trabalhador.getNome();
            cont++;
        }

       }
       public void trabalhar(){

        int somaHoras = 8 ;
         for (Trabalhador trabalhador : trabalhadores) {

            if( trabalhador.isFerias())

        somaHoras += trabalhador.getHorasTrabalhadas();

       }
    }
       public int calcularPagamento(){

       double totalPagamento = 0;
        
       for (Trabalhador trabalhador : trabalhadores) {
        totalPagamento += trabalhador.getValorDaHora()*trabalhador.getValorDaHora();

       return totalPagamento;

       }
       }
    }