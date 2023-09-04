// 21. Crie um programa que leia um valor em metros e o converta para centímetros, milímetros e
//quilômetros. Utilize o bloco try/catch para tratar possíveis exceções durante os cálculos.
 import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         double valorMetros = 0, centimetros = 0, milimetros = 0, quilometros = 0;

        try {
            System.out.println("Digite o valor em metros: ");
        valorMetros = in.nextDouble();
             
        } catch (Exception e) {
            System.out.println("Valor inválido. Digite um número válido.");
        }

        try {
            centimetros = valorMetros * 100;
            milimetros = valorMetros * 1000;
            quilometros = valorMetros/ 1000;

            System.out.println(" O Valor " + valorMetros + " metros é igual a:  " + centimetros + " centímetros  /  " + milimetros + " milímetros  /  " + quilometros + " quilômetros");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante os cálculos.");
        }
    }
}




