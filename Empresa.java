import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
=======

public class Empresa {
    
    private String nome;
    private String cnpj;
    private ArrayList<Trabalhador> trabalhadores;
    private String end;
    private int numFuncionarios;
    private String ceo;
>>>>>>> 8d7e709ac1a9966567171179b3ee3a7e8dc61538


public class Empresa{

<<<<<<< HEAD
private  String nome;
private  String  cnpj;
private ArrayList<Trabalhador> trabalhadores; // Usar ArrayList em vez de array
private  String endereco;
private  int numFuncionarios;
private  String ceo;
int tam = 20;
=======
    public Empresa( String nome, String cnpj, String end, String ceo){
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new ArrayList<>();
        this.ceo = ceo;
>>>>>>> 8d7e709ac1a9966567171179b3ee3a7e8dc61538


public Empresa() {
    this.trabalhadores = new ArrayList<Trabalhador>();

<<<<<<< HEAD
}

public Empresa(String nome, String cnpj, String endereco, String ceo) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.endereco = endereco;
    this.ceo = ceo;
}

public void contratar( Trabalhador novoTrabalhador){
    this.numFuncionarios++;
    this.trabalhadores.add(novoTrabalhador);
}


public void trabalhar(){
    int horas = 8;
    for (Trabalhador trabalhador : trabalhadores) {
        if (!trabalhador.isFerias()) {
         trabalhador.setHorasDeTrabalho(trabalhador.getHorasDeTrabalho() + horas);


        }

    }

}

public double calcularPagamento() {
    double totalPagamento = 0;
    
    for (Trabalhador trabalhador : trabalhadores) {
        // Verifica se o trabalhador não está de férias
        //if (!trabalhador.isFerias()) {
            double valorHora = trabalhador.getValorDahora();
            int horasTrabalhadas = trabalhador.getHorasDeTrabalho();
            
            double pagamentoTrabalhador = valorHora * horasTrabalhadas;
            totalPagamento += pagamentoTrabalhador;
        }
            return totalPagamento;

    }

    public double calcularPagamentoTrabalhador(double valorHora, int horasTrabalhadas) {
            return valorHora * horasTrabalhadas;
        }
    

public List<Trabalhador> getTrabalhadoresContratados() {
    List<Trabalhador> contratados = new ArrayList<>();
    for (Trabalhador trabalhador : trabalhadores) {
            contratados.add(trabalhador);
        }
            return contratados;
    }
}

=======
      
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
>>>>>>> 8d7e709ac1a9966567171179b3ee3a7e8dc61538
