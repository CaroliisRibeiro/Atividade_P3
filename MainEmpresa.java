import java.util.ArrayList;
import java.util.List;


public class MainEmpresa{


    public static void main( String [] args){
        ArrayList<Trabalhador> trabalhadores = new ArrayList<>();

        Trabalhador funcionario1 = new Trabalhador("João", 30, 60,44,true);
        Trabalhador funcionario2 = new Trabalhador("Maria", 25, 70,36, true);
        
        trabalhadores.add(funcionario1);
        trabalhadores.add(funcionario2);

        

        Empresa minhaEmpresa = new Empresa("Minha Empresa", "123456789", "Rua da Empresa", "CEO");


          // Contratando funcionários da lista
          for (Trabalhador trabalhador : trabalhadores) {
            minhaEmpresa.contratar(trabalhador);
        }

        // Fazendo funcionários trabalharem
        minhaEmpresa.trabalhar();

        // Calculando pagamento
        minhaEmpresa.calcularPagamento();

        // Colocando um funcionário de férias
        funcionario1.ferias();

        // Fazendo funcionários trabalharem novamente
        minhaEmpresa.trabalhar();

        // Calculando pagamento novamente
        minhaEmpresa.calcularPagamento();
    }
}
       
        