import java.util.ArrayList;
import java.util.List;

public class MainEmpresa {


    public static void main( String [] args){
                
        // Criar uma lista de funcionários

        List<Trabalhador> funcionarios = new ArrayList<>(); 
        
        // Criar uma instância da Empres

        Empresa Comadre = new Empresa(); // intanciada a empresa sem funcionário


        // Adicionar funcionários à lista

        funcionarios.add(new Trabalhador("Alice", 44,10,44, true));
        funcionarios.add(new Trabalhador("Carol", 43, 10,36,true));
        funcionarios.add(new Trabalhador("Suri", 20, 10, 24, false));

        // Contratar os funcionários na empresa


        for (Trabalhador trabalhador : funcionarios) {
            Comadre.contratar(trabalhador);


        }

        Comadre.trabalhar();

            
                // Obter a lista de trabalhadores contratados
            List<Trabalhador> contratados = Comadre.getTrabalhadoresContratados();
            
                // Exibir os detalhes dos funcionários contratados
            System.out.println("Funcionários contratados:");
                for (Trabalhador funcionario : contratados) {
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Horas de trabalho: " + funcionario.getHorasDeTrabalho());
                    System.out.println("Horas de trabalho: " + funcionario.getValorDahora());
                    // Calcular o pagamento total da empresa
                    double pagamentoTotalTrabalhador = Comadre.calcularPagamentoTrabalhador(funcionario.getValorDahora(), funcionario.getHorasDeTrabalho());

                    // Exibir o pagamento total
                    System.out.println("Total a ser desembolsado pela empresa: R$" + pagamentoTotalTrabalhador );


                    // Adicione mais informações conforme necessário
                    System.out.println();
                }

                // Calcular o pagamento total da empresa
                    double pagamentoTotal = Comadre.calcularPagamento();

                    // Exibir o pagamento total
                    System.out.println("Total a ser desembolsado pela empresa: R$" + pagamentoTotal );

            }
  
            
        }