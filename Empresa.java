import java.util.ArrayList;
import java.util.List;


public class Empresa{

private  String nome;
private  String  cnpj;
private ArrayList<Trabalhador> trabalhadores; // Usar ArrayList em vez de array
private  String endereco;
private  int numFuncionarios;
private  String ceo;
int tam = 20;


public Empresa() {
    this.trabalhadores = new ArrayList<Trabalhador>();

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

