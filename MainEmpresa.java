import java.util.ArrayList;

public class MainEmpresa {


    public static void main( String [] args){

         ArrayList<Trabalhador> trabalhador = new ArrayList<>();

        Trabalhador [] trabalhador1 = { new Trabalhador( " Carol", 23, 80, 44, false)};
        Empresa trbahador1 = new Empresa("comadre", "123", trabalhador1, "rua 2", 1, "Carol");
        
        Trabalhador [] trabalhador2= { new Trabalhador( " Fabio", 33, 60, 44, true)};
        Empresa trbahador2 = new Empresa("comadre", "123", trabalhador1, "rua 2", 1, "Carol");

        Trabalhador [] trabalhador3= { new Trabalhador( " Suri", 18, 90, 36, false)};
        Empresa trbahador3 = new Empresa("comadre", "123", trabalhador1, "rua 2", 1, "Carol");
        

        trabalhador.get(0).contratar();
        


        trabalhador.get(0).ferias();
        trabalhador.get(1).ferias();
        trabalhador.get(2).ferias();


        trabalhador1.calcularPagamento();



    }

}