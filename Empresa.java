import java.util.ArrayList;

public class Empresa {
    
    private String nome;
    private String cnpj;
    private ArrayList<Trabalhador> trabalhadores;
    private String end;
    private int numFuncionarios;
    private String ceo;



    public Empresa( String nome, String cnpj, String end, String ceo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new ArrayList<>();
        this.ceo = ceo;


       }

      
       public void contratar(Trabalhador novoFuncionario) {
        if (novoFuncionario != null) { // Verifique se o funcionário não é null
            trabalhadores.add(novoFuncionario);
            numFuncionarios++;
        }
    }

    public void trabalhar() {
        for (int i = 0; i < trabalhadores.size(); i++) {
            Trabalhador trabalhador = trabalhadores.get(i);
            if (trabalhador != null && !trabalhador.isFerias()) { // Verifique se o trabalhador não é null
                trabalhador.trabalharPorHora(8);
            }
        }
    }

    public void calcularPagamento() {
        double totalPagamento = 0;
        for (int i = 0; i < trabalhadores.size(); i++) {
            Trabalhador trabalhador = trabalhadores.get(i);
            if (trabalhador != null) { // Verifique se o trabalhador não é null
                totalPagamento += trabalhador.getHorasTrabalhadas() * trabalhador.getValorDaHora();
            }
        }
        System.out.println("Total de pagamento a ser efetuado pela empresa: R$" + totalPagamento);
    }
}