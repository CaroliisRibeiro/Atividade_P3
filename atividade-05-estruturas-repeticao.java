//1-Crie um programa que leia 5 notas de alunos e exiba quantos deles 
//foram aprovados (nota maior ou igual a 7).
import java.util.Scanner;

public class index {

 public static void main(String[] args) {
     int totalAlunos = 5, aprovados = 0;
     double nota;
     Scanner in = new Scanner(System.in);

     for (int i = 1; i <= totalAlunos; i++) {
         System.out.println(" digite a nota  do  " + (i) + " º aluno");
         nota = in. nextDouble();

     if (nota >= 7.0) {
         aprovados++;

         }

     }
     System.out.println( " O numero de aprovados é : " + aprovados );

 }
}


//2. Faça um programa que exiba a soma dos dígitos de um número 
//inteiro fornecido pelo usuário.
import java.util.Scanner;

public class index {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("Digite um número inteiro: ");
     int num = in.nextInt();

     int somaDig= 0, numOrigi = num, dig;

     while (num != 0) {
         dig= num % 10; // Obtém o último dígito
         somaDig += dig; // Adiciona o dígito à soma
         num /= 10; // Remove o último dígito
     }

     System.out.println("A soma dos dígitos de " + numOrigi + " é: " + somaDig);

 }
}


//3. Elabore um programa que leia um número inteiro e exiba todos os seus divisores.
import java.util.Scanner;

public class index {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num;

     System.out.println("Digite um número inteiro: ");
      num = in.nextInt();

     System.out.println("Divisores de " + num + " são: ");

     for (int i = 1; i <= num; i++) {
         if (num % i == 0) {
             System.out.println(i);
         }
     }

 }
}


//4. Desenvolva um programa que calcule a média de altura de 5 pessoas.
import java.util.Scanner;

public class index {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     double altura, soma = 0, media = 0;
     int tam = 5;

     for (int i = 1; i <= tam; i++) {
         System.out.println("Digite a atura da pessoa  de " + i   + " º :  ");
         altura = in.nextDouble();
         soma = soma + altura;
         media = soma /tam;
         
         }
         System.out.println("a média das alturas é" + media );


     }

 }



 //5. Faça um programa que exiba os números de 1 a 100, substituindo os múltiplos de 3 
//pela palavra "Fizz" e os múltiplos de 5 pela palavra "Buzz". Para os números que 
//são múltiplos de ambos, utilize a palavra "FizzBuzz".
import java.util.Scanner;

public class index {
public static void main(String[] args) {
 int tam = 100;

     for (int i = 1; i <= tam; i++) {

         if (i % 3 == 0 && i % 5 == 0) {
             System.out.println(" FizzBuzz ");
         } else if(i % 5 == 0) {
             System.out.println(" Buzz ");
         } else if (i % 3 == 0)  {
             System.out.println(" Fizz ");
         } else {
             System.out.println(i);
         }
     }
 }
}


//6. Elabore um programa que leia um número inteiro e exiba a soma dos dígitos pares desse número.
import java.util.Scanner;

public class index {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num, dig, somaDigPar = 0;

     System.out.println("Digite um número inteiro: ");
     num = in.nextInt();


     while (num > 0) {
         dig = num% 10; // Obtém o último dígito
         if (dig % 2 == 0) {
             somaDigPar = somaDigPar +  dig; // Adiciona o dígito par à soma
         }
         num = num / 10; // Remove o último dígito
     }

     System.out.println("A soma dos dígitos pares é: " + somaDigPar);

 }
}



//7. Faça um programa que leia um número inteiro e exiba o número invertido. 
//Por exemplo, se o número lido for 123, o programa deve exibir 321.
import java.util.Scanner;

public class index {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num, numInvertido = 0, dig;

     System.out.println("Digite um número inteiro: ");
     num = in.nextInt();


     for( int i = 0; i <= num; i++){
         dig = num % 10; // Obtém o último dígito
         numInvertido = numInvertido * 10 + dig; // Adiciona o dígito ao número invertido
         num = num/10; 


     }
     System.out.println("Número invertido: " + numInvertido);


     }

 }


 //8. Elabore um programa que calcule a soma dos números de 1 a 100 utilizando o while.
import java.util.Scanner;

public class index {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num = 0, somaNum = 0, tam = 100;

     
     while( num < tam){
         num++;
         somaNum = somaNum + num;


     }
     System.out.println("a soma dos num de 1 a 100 é : " + somaNum);


     }

 }


//9. Faça um programa que calcule o produto dos números de 1 a 5 utilizando o while.

public class index {
public static void main(String[] args) {
     int num = 1, prodNum = 1, tam = 5;

     
     while( num < tam){
         num++;           
         prodNum = prodNum * num;

     }
     System.out.println("O produas entre os num 1 até 5 é : " + prodNum);


     }

 }




 //10. Crie um programa que exiba a tabuada do 9 utilizando o while.

   public class index {
  public static void main(String[] args) {
        int num = 9, mult = 1, tam = 10, result = 0;

        
        while( mult <= tam){
            result =  num * mult;
            
            System.out.println(num + " x " + mult + " = " + result);
            mult++; // Incrementa o multiplicador

        }
        
    }
}




//11. Crie um programa que leia uma sequência de números inteiros do usuário
 //e exiba o maior e o menor valor digitado. O programa deve parar de ler 
 //quando o usuário digitar o número 0 utilizando o while.

import java.util.Scanner;

public class index {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, maior, menor;

        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        System.out.println("Insira uma sequência de números inteiros (digite 0 para parar):");

        while (true) {
            System.out.print("Digite um número: ");
            num1 = in.nextInt();

            if (num1 == 0) {
                break;
            }

            System.out.print("Digite outro número: ");
            num2 = in.nextInt();

            if (num2 == 0) {
                break;
            }

            if (num1 > maior) {
                maior = num1;
            }

            if (num1 < menor) {
                menor = num1;
            }

            if (num2 > maior) {
                maior = num2;
            }

            if (num2 < menor) {
                menor = num2;
            }
        }

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior número digitado: " + maior);
            System.out.println("Menor número digitado: " + menor);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
    }
}


//12. Crie um programa que leia uma sequência de números inteiros do 
//usuário e exiba a média dos números digitados. O programa deve parar de
 //ler quando o usuário digitar o número -1 utilizandoo while.
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, cont = 0; 
        double media = 0, soma = 0;


        System.out.println("Insira uma sequência de números inteiros :");
        System.out.println( " Digite -1 para parar");
        

        while (true) {
            num =  in.nextInt();

            if (num == -1) {
                break;
            }
            soma = soma + num;
            cont++;

            
        }
        media = soma/cont;

        
        System.out.println(" A quantidade de numeros digitado foram : " + cont  + " - " + " A soma entre eles é : " + soma + " - "+"  e a média é " +  media);
           
}
}



//13. Faça um programa que leia um número inteiro e exiba a soma dos seus 
//dígitos elevados ao cubo utilizando o while.
import java.util.Scanner;

public class index {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.println("Digite um número inteiro: ");
     int num = in.nextInt();

     int somaDig= 0, numOrigi = num, dig;
     double aoCubo = 0;

     while (num != 0) {
         dig = num % 10; // Obtém o último dígito
         somaDig = somaDig + dig; // Adiciona o dígito à soma
         num = num / 10; // Remove o último dígito
         aoCubo = Math.pow(somaDig,3);
     }

     System.out.println(" O Cubo dos dígitos de " + numOrigi + " é: " + (int)aoCubo);

 }
}







//14.Faça um programa que exiba os números ímpares de 1 a 100 utilizando o while.
import java.util.Scanner;

public class atividade-05-estruturas-repeticao{

 public static void main(String[] args) {
     int tam = 100, num = 1;
     

     while (num <= tam) {
 
          if ( num % 2 == 1){
     
         System.out.print(  num + " " );


          } 
          num++;
       
      }
    
        
    
     }



     //15. Desenvolva um programa que exiba todos os múltiplos de 3 no intervalo 
// de 1 a 50 utilizando o while.
import java.util.Scanner;

public class index {
  public static void main(String [] args) {
     Scanner in = new Scanner(System.in);

     //System.out.println("Digite um número inteiro: ");
     //int num = in.nextInt();

     int tam = 50,num = 1;
    
     while (num <= tam ) {
       if( num % 3 == 0){
        System.out.println(num + " ");
       }
        num++;

    }
  }




  //16. Crie um programa que leia 5 notas de alunos e exiba quantos deles foram aprovados
 //(nota maior ou igual a 7) utilizando o while.
import java.util.Scanner;

public class index {
  public static void main(String [] args) {
     Scanner in = new Scanner(System.in);

     int tam = 5, aluno = 0; 
     double nota;

    System.out.println("Digite a nota do aluno ");

     while (tam > 0) {
     nota = in.nextDouble();
     
       if( nota >= 7){
        aluno++;
        System.out.println("o aluno " + (aluno ) + " foi aprovado" );
       }
        tam--;

       }
        System.out.println((aluno) + " alunos foram Aprovados");


            }
      }


//17. Elabore um programa que leia uma sequência de números inteiros do usuário e
//determine quantos números pares foram digitados antes do primeiro número ímpar. 
//O programa deve pararde ler quando o usuário digitar o número 0 utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, quantPares = 0, quantImpares = 0;
      boolean achouImpar = true;

      System.out.println("Digite uma sequência de números inteiros:");
System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }
         
      if (achouImpar) {
         if (num % 2 == 0) {
             quantPares++;
         } else {
            achouImpar = false;
            }
         }
      }
   

      if (quantPares > 0) {
         System.out.println("Quantidade de números pares antes do primeiro ímpar: " + quantPares);
      } else {
         System.out.println("Nenhum número par foi digitado antes do primeiro ímpar.");
      }
   }
}



//18. Crie um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números pares e quantos números ímpares foram digitados. O programa deve parar de ler quando
//o usuário digitar o número 0 utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, quantPares = 0, quantImpares = 0;
      //boolean achouImpar = true;

      System.out.println("Digite uma sequência de números inteiros:");
System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }

      
         if (num % 2 == 0) {
             quantPares++;
         } else {
            quantImpares++;
         
            }
      }
   
         System.out.println("Quantidade de números pares : " + quantPares);
     
         System.out.println("Quantidade de numeros impares: " + quantImpares);
      }
   }



   
//18. 19. Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números são divisíveis por 2, quantos são divisíveis por 3 e quantos são divisíveis por 5. O
//programa deve parar de ler quando o usuário digitar o número 0 utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, quantDivPorDois = 0, quantDivPortres = 0 , quantDivPorCinco = 0, quantDivPorTodos = 0;
   

      System.out.println("Digite uma sequência de números inteiros:");
      System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }


           if( num % 2 == 0){
            quantDivPorDois++;
         
         } else if ( num % 3 == 0) {
            quantDivPortres++;
         
         } else if ( num % 5 == 0){
            quantDivPorCinco++;

         } 
            if (num% 2 == 0 && num % 3 == 0 && num % 5 == 0) {
            quantDivPorTodos++;

         }
      }
      
         System.out.println("Quantidade de números divisiveis por 2 : " + quantDivPorDois);
     
         System.out.println("Quantidade de numeros divisiveis por 3: " + quantDivPortres);

         System.out.println("Quantidade de numeros divisiveis por 5: " + quantDivPorCinco);

         System.out.println("Quantidade de numeros divisiveis por 2,3 e 5: " + quantDivPorTodos);
      }
   
   }



   
//20. Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
//dos números divisíveis por 3. O programa deve parar de ler quando o usuário digitar o número 0
//utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, somaDiv = 0, quantDivPortres = 0 ;
      double media = 0;
   

      System.out.println("Digite uma sequência de números inteiros:");
      System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }

           if( num % 3 == 0){
            somaDiv = somaDiv + num;
            quantDivPortres++;

         }
        
      }
      
        
         media = (double)somaDiv/ quantDivPortres;
         System.out.println("Quantidade de numeros divisiveis por 3: " + quantDivPortres);
         System.out.println("a soma  dos numeros divisiveis por 3 é  " +  somaDiv);
         System.out.println("a mesia  dos numeros divisiveis por 3 é  " + (double) media);
        
      }
   
   }



   
//21. Faça um programa que leia uma sequência de números inteiros do usuário e exiba quantos
//números possuem mais de três dígitos. O programa deve parar de ler quando o usuário digitar o
//número 0 utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, cont = 0, tam;
      String numString;
     
      System.out.println("Digite uma sequência de números inteiros:");
      System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }
         numString = Integer.toString(Math.abs(num));
         tam = numString.length();
      
  

          if (tam > 3) {
            cont++;

         }
        
      }
      
         System.out.println("Quantidade de numeros com mais de 3 digitos: " + cont);
         
        
      }
   
   }



   
//22. Desenvolva um programa que leia uma sequência de números inteiros do usuário e exiba a média
//dos números que estão entre 50 e 100. O programa deve parar de ler quando o usuário digitar o
//número 0 utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, cont = 0, somaNum = 0;
      double media = 0;
     
      System.out.println("Digite uma sequência de números inteiros:");
      System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }
        
         if( num >= 50 && num <= 100){
            somaNum = somaNum + num;
           cont++;

         }
        
         }
    
          media = (double)somaNum/cont;
          System.out.println("a soma dos numeros entre 50 e 100 é: " + somaNum);
          System.out.println("a média da soma dos numeros entre 50 e 100 é: " + media);
         
      }
      
   }
   



   //23. Elabore um programa que leia uma sequência de números inteiros do usuário e exiba o menor
//valor digitado que seja positivo e ímpar. O programa deve parar de ler quando o usuário digitar o
//número 0 utilizando o while.
import java.util.Scanner;

public class index {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num, menorPosiImpar;
      menorPosiImpar = Integer.MAX_VALUE;
      
     
      System.out.println("Digite uma sequência de números inteiros:");
      System.out.println( " Digite 0 para parar");
      while (true) {
         num = in.nextInt();

         if (num == 0) {
            break;
         }
        
         if (num > 0 && num % 2 == 1 && num < menorPosiImpar) {
            menorPosiImpar = num;
        }
    }

    if (menorPosiImpar != Integer.MAX_VALUE) {
        
         }
    
          System.out.println("o menor valor digitado que seja positivo e impar: " + menorPosiImpar);
          //System.out.println("a média da soma dos numeros entre 50 e 100 é: " + media);
         
      }
      
   }
   

