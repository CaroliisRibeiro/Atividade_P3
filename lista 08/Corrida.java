import java.util.Scanner;


public class Corrida {


    public static void main( String [] args){
        Scanner in = new Scanner( System.in);
    Carro carro1 = new Carro ( " Hyunday", " Hb20 ", 2023 );
    System.out.println( " Dados do Carro 1 ");
    System.out.println(carro1.getMarca() +  carro1.getModelo()  + carro1.getAno()) ;

    System.out.println("Aceleração - digite a velocidade inicial");
    carro1.setVelocidade( 20);
    System.out.println( "velocidade inicial " + carro1.getVelocidade());
    double aceleracao = 40.0;
    System.out.println(" aceleração desejada " + aceleracao);
    carro1.acelerar(aceleracao);
    System.out.println("velocidade atual " + carro1.getVelocidade());

    System.out.println( " Desaceleração");

    carro1.setVelocidade(120);
    System.out.println("velocidade inicial " + carro1.getVelocidade());
    double desaceleracao = 30.0;

    System.out.println("desaceleração desejada " + desaceleracao );
    carro1.desacelerar(desaceleracao);
    System.out.println("velocidade atual " + carro1.getVelocidade());



    }
    
}
