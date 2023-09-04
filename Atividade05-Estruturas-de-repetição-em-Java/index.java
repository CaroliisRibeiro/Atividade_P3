
//224. Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números são pares e quantos números são ímpares entre o primeiro e o último número digitado.
//O programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, impar = 0, par = 0, primeiroNum = 0 , ultimoNum = 0;
      
     
      System.out.println("Digite uma sequência de números inteiros:");
      System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }
         
         if (primeiroNum == 0) {
            primeiroNum = num;
        }

        ultimoNum = num;

         if ( num % 2 == 1 ){
            impar++;

         }
         
         
         if(num % 2 == 0) {
            par++;
        }
    }
         

    if (primeiroNum != 0 && ultimoNum != 0) {
          System.out.println(" a quentidade de numeros impares é  " + impar);
          System.out.println(" a quentidade de numeros pares é  " + par);
   } else {
            System.out.println("Nenhum número foi digitado.");
        }

         
      }
      
   }
   

