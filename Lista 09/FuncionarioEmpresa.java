import java.util.ArrayList;
import java.util.List;

public class FuncionarioEmpresa {
    
    public static void main (String [] args){ 
        List<Funcionario> funcionarios = new ArrayList<>(); 
        funcionarios.add(new Funcionario("Alice", 24, 55000));
        funcionarios.add(new Funcionario("Carol", 43, 100000));
        funcionarios.add(new Funcionario("Suri", 20, 60000));
        funcionarios.add(new Funcionario("Fabio", 42, 42000));



        System.out.println("Funcionários que ganham mais de R$50.000 por ano e têm menos de 30 anos de idade:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdade() < 30 && funcionario.getSalario() > 50000) {

        System.out.println("Nome: " + funcionario.getNome() + ", Idade: " + funcionario.getIdade() + ", Salário: " + funcionario.getSalario());
            }
        }
    }
}
        