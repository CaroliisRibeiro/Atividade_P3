import java.util.ArrayList;

public class MainEmpresa{


    public static void main( String [] args){

         ArrayList<Trabalhador> trabalhadores = new ArrayList<>();
         Trabalhador trabalhador1 = new Trabalhador("João",29,60,44,true);
         Trabalhador trabalhador2 = new Trabalhador("Maria", 25, 25,44,false);


        trabalhadores.add(trabalhador1);
        trabalhadores.add(trabalhador2);

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
        trabalhador1.ferias();

        // Fazendo funcionários trabalharem novamente
        minhaEmpresa.trabalhar();

        // Calculando pagamento novamente
        minhaEmpresa.calcularPagamento();
    }
}
       
        