public class atividadesLista4 {
    //1. Escreva um programa que leia um número inteiro e verifique 
    //se ele é positivo, negativo ou igual a zero.

import java.util.Scanner;

public class index {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
    
            int num;
            System.out.println("Digite um numero inteiro");
            num = in.nextInt();
            if(num > 0 ){
                System.out.println( " O numero:  " + num + " positivo");
    
            }else{
                System.out.println( " O numero: " + num + " negativo");
            }

        }
        
    }


// 2. Crie um programa que receba a idade de uma pessoa e exiba
// se ela é maior de idade ou menor de idade.
import java.util.Scanner;

public class index {

        public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
    
            int idade;
           System.out.println("Digite a sua idade em anos");
            idade = in.nextInt();
            if(idade < 18 ){
                System.out.println( " A pessoa com    " + idade + " anos  é menor de idade");
    
            }else{
                System.out.println( " A pessoa com  " + idade + " anos  é maior de idade");
            }
    
        }
    
    }

// 3. Desenvolva um programa que leia dois números inteiros e mostre
// qual deles é o maior, ou se são iguais.

import java.util.Scanner;

public class index {

        public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
    
            int num1,num2;
           System.out.println("Digite um numero inteiro");
            num1 = in.nextInt();
            System.out.println("Digite outro numero inteiro");
            num2 = in.nextInt();
            if(num1 > num2 ){
                System.out.println( " o nummero " + num1+ " é mior que  " + num2 );
    
            
            }else if(num2 > num1) {
                System.out.println( "o nummero " + num2+ " é mior que  " + num1 );
            }

           else{

            System.out.println( "o nummero " + num1+ " é igual a  " + num2);
           }
        
        }
    
    }

// 4. Faça um programa que verifique se um número é par ou ímpar.

import java.util.Scanner;

public class index {

        public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
    
            int num1;
           System.out.println("Digite um numero inteiro");
            num1 = in.nextInt();
           
            if(num1 % 2 ==0 ){
                System.out.println( " o nummero " + num1 + " é par");

            } else{

            System.out.println( "o nummero " + num1 + " é impar");
           }
        
        }
    
    }

// 5. Elabore um programa que leia três notas de um aluno e calcule
// a média. Em seguida, exiba se o aluno está aprovado
// (média maior ou igual a 7) ou reprovado.
import java.util.Scanner;

public class index {

        public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
    
            double nota1,nota2,nota3,media;
            System.out.println("Digite a primeira nota da aluna ");
            nota1 = in.nextDouble();
            System.out.println("Digite a segunda nota");
            nota2 = in.nextDouble();
            System.out.println("Digite a terceira nota");
            nota3 = in.nextDouble();

            media = (nota1 + nota2 + nota3)/3;

           
            if(media >= 7  ){
                System.out.println( " A aluna obteve " + media + "  de media e está aprovado");

            } else{

            System.out.println( " A aluna obteve " + media + "   de media e está reprovado");
           }
        
        }
    
    }

// 6. Crie um programa que receba o nome de duas pessoas e exiba qual
// delas possui o maior número de caracteres em seu nome.
import java.util.Scanner;

public class index {

        public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
    
            String nome1,nome2;
            System.out.println("Digite o primeiro nome");
            nome1 = in.nextLine();
            System.out.println("Digite o segundo nome");
            nome2 = in.nextLine();

            int n1 = nome1.length();
            int n2 = nome2.length();
          

           
            if(n1 > n2  ){
                System.out.println( nome1 + "  tem " + n1 + " caracteres e é maior que "  + nome2 + " que tem " + n2 + " caracteres" ) ;

            } else{

            System.out.println( nome2 + "  tem " + n2 + " caracteres e é maior que "  + nome1 + " que tem " + n1 + " caracteres" );
           }
        
        }
    
    }

// 7. Desenvolva um programa que leia um caractere e verifique se
// ele é uma vogal ou uma consoante.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char caractere;
        System.out.println("Digite uma letra");
         caractere = in.next().charAt(0);
        


        if (Character.toLowerCase(caractere) == 'a' || Character.toLowerCase(caractere) == 'e' || Character.toLowerCase(caractere) == 'i' || 
        Character.toLowerCase(caractere) == 'o' || Character.toLowerCase(caractere) == 'u') {
            
            System.out.println( caractere + " - é  vogal" );

        } else {

             System.out.println( caractere + " - é consoante" );
        }

    }

}

// 8. Faça um programa que receba três números e os imprima em ordem crescente.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Digite um numero inteiro");
         num1 = in.nextInt();
        System.out.println("Digite um numero inteiro");
         num2 = in.nextInt();
        System.out.println("Digite um numero inteiro");
         num3 = in.nextInt();
        
         int numMenor, numMeio, numMaior;

         if (num1 <= num2 && num1 <= num3) {
             numMenor = num1;
             if (num2 <= num3) {
                 numMeio = num2;
                 numMaior = num3;
             } else {
                 numMeio = num3;
                 numMaior = num2;
             }
         } else if (num2 <= num1 && num2 <= num3) {
             numMenor = num2;
             if (num1 <= num3) {
                 numMeio = num1;
                 numMaior = num3;
             } else {
                 numMeio = num3;
                 numMaior = num1;
             }
         } else {
             numMenor = num3;
             if (num1 <= num2) {
                 numMeio = num1;
                 numMaior = num2;
             } else {
                 numMeio = num2;
                 numMaior = num1;
             }
         }
 
         System.out.println("Números em ordem crescente: " + numMenor + ", " + numMeio + ", " + numMaior);
 
        }
    }

// 9. Elabore um programa que calcule o IMC (Índice de Massa Corporal) de uma
// pessoa, dado o peso e a altura. Em seguida, exiba se a pessoa está abaixo do
// peso, com peso normal, com sobrepeso, obesa ou muito obesa.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double peso, altura, imc;
        System.out.println("Digite seu peso");
         peso = in.nextDouble();
        System.out.println("Digite sua altura");
         altura = in.nextDouble();
        //IMC = Peso ÷ (Altura × Altura)
        
        imc = peso/(altura*altura);

        System.out.println("a pessoa tem  " + imc );
        //if (imc < 17 ) {//Entre 17 e 18,49	muito Abaixo do peso
         //    System.out.println( "Abaixo do peso");

        if (imc >= 17 && imc <= 18.49) {//Entre 17 e 18,49	Abaixo do peso
             System.out.println( "Abaixo do peso");
        }else if (imc >= 18.5 && imc <= 24.99) {  //Entre 18,5 e 24,99	Peso normal
                 System.out.println( "Peso normal");
        }else if (imc >= 25 && imc <= 29.99) {//Entre 25 e 29,99	Acima do peso
                 System.out.println( "sobrepeso");
        }else if (imc >= 30 && imc<= 34.99) {//Entre 30 e 34,99	Obesidade I
                System.out.println( "obesa ");
        }else{
            System.out.println( "muito obesa ");

        } 
          
             }
         }

// 10. Escreva um programa que receba um número de mês (1 a 12)
// e exiba o nome do mês correspondente.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mes;
        System.out.println("Digite o nummero do mês (1 a 12):");
         mes = in.nextInt();
     

        System.out.println("O mês " + mes + " é ");

        
        if (mes == 1 ) {
             System.out.print( "J aneiro");
        }else if (mes == 2) {  
                 System.out.print (" Fevereiro");
        }else if (mes == 3) {
                 System.out.print( "Março");
        }else if (mes == 4) {
                System.out.print( " Abril ");
        }else if (mes == 5) {
                System.out.print( " Maio ");
        }else if (mes == 6) {
                System.out.print( " Junho");    
        }else if (mes == 7) {
                System.out.print( " Julho "); 
        }else if (mes == 8) {
                System.out.print( " Agosto "); 
        }else if (mes == 9) {
                System.out.print( " Setembro ");  
        }else if (mes == 10) {
                System.out.print( " Outubro");    
        }else if (mes == 11) {
                System.out.print( " Novembro ");       
        }else if (mes == 12) {
                System.out.print ( " Dezembro ");                                     
        }else{

            System.out.println( "muito obesa ");

        } 
          
             }
         }

// 11. Desenvolva um programa que leia o salário de um funcionário e calcule o
// valor do seu aumento. Para salários superiores a R$ 1.500,00, o aumento deve
// ser de 10%. Caso contrário, o aumento é de 15%.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double salario, aumento, novoSalario; // aumento2, novoSalario2;
            System.out.println("Digite o seu salario atual:");
             salario = in.nextDouble();
     

        if (salario > 1500 ) {

            aumento = salario * 10/100;

        } else {  

           aumento = salario * 15/100;
        }
            novoSalario = salario + aumento;

            System.out.print( "O novo salario é:  " + salario + " (salario atual)  + " + aumento + " (aumento) = " + novoSalario);

        } 
          
             }

// 12. Receba um número inteiro do usuário e verifique se ele é divisível
// por 3 e por 5 ao mesmo tempo, exibindo uma mensagem apropriada.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
            System.out.println("Digite o seu salario atual:");
             num= in.nextInt();
     
     
        if (num % 3 == 0  && num % 5 == 0) {

            System.out.print( "O numero: " + num + " - é divisivel por 3 e por 5");

        } else {  
            System.out.print( "O numero: " + num + " - não é divisivel por 3 e por 5");
          
        }
           
    }
}

// 13. Peça ao usuário que insira o dia da semana (por extenso) e,
// em seguida, exiba uma mensagem informando se é um dia útil ou um fim de
// semana.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String dia;
            System.out.println("Digite o dia da semana por extenso");
             dia = in.nextLine();
     
     
        if (dia.equalsIgnoreCase( "domingo" ) || dia.equalsIgnoreCase( "sabado")) {

            System.out.print( "O dia da semana : " + dia + " - não é dia útil");

        } else {  
            System.out.print( "O dia da semana: " + dia + " -  é dia útil");
          
        }
           
    }
}

// 14. Elabore um programa que leia um número inteiro de 1 a 5 e exiba a
// mensagem
// "Muito bom","Bom", "Regular", "Insuficiente" ou "Muito insuficiente", de
// acordo
// com o valor lido, utilizando switch/case.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
            System.out.println("Digite uma numero de 1 a 5 ");
             num = in.nextInt();
     
     switch(num){
        case 1:
        System.out.print( "O número escolhido foi: 1  =  Muito bom ");
        break;

        case 2:
        System.out.print( "O número escolhido foi: 2  =  Bom ");
        break;

        case 3:
        System.out.print( "O número escolhido foi: 3  =  Regular ");
        break;

        case 4:
        System.out.print( "O número escolhido foi: 4  =  Insuficiente ");
        break;

        case 5:
        System.out.print( "O número escolhido foi: 5 = Muito Insuficiente ");
        break;

        default:
        System.out.println("O número escolhido é inválido! Digite um número entre 1 a 5.");

        }    
           
    }
}

// 15. Peça ao usuário que digite um número entre 1 e 7 e exiba o dia da semana
// correspondente (1 - Domingo, 2 - Segunda-feira, etc.).
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        System.out.println("Digite um numero de 1 a 7 ");
        num = in.nextInt();

        switch (num) {
            case 1:
                System.out.print("O dia da semana escolhido é:  Domingo ");
                break;

            case 2:
                System.out.print("O dia da semana  escolhido é: Segunda-feira");
                break;

            case 3:
                System.out.print("O dia da semana escolhido é:  Terça-feira");
                break;

            case 4:
                System.out.print("O dia da semana escolhido é:  Quarta-feira ");
                break;

            case 5:
                System.out.print("O dia da semana  escolhido é:  Quinta-feira ");
                break;

            case 6:
                System.out.print("O dia da semana  escolhido é:  Sexta-feira ");
                break;

            case 7:
                System.out.print("O dia da semana  escolhido é: Sábado");
                break;

            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 7.");

        }

    }
}


//16. Receba um número decimal do usuário e arredonde-o para o inteiro mais próximo 
//usando a estrutura de controle try/catch para tratar exceções.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num = 0;

         try{
               
            System.out.println("Digite um numero decimal ");
            num = in.nextDouble();

        }catch( Exception e){
             System.out.println("Numero inválido. Digite um valor inteiro válido.");

        }
             
        System.out.println( " o numero " + num + " arredondado  é " + Math.ceil(num));
     
    
        }    
           
    }
 

    //17. Peça ao usuário que insira a sua idade e verifique se ele é um bebê (0 a 1 ano),
 //criança (1 a 12 anos), adolescente (13 a 18 anos) ou adulto (mais de 18 anos).
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double idade;   
        System.out.println("Digite sua idade ");
        idade = in.nextDouble();

       
        if(idade >= 0 && idade < 1 ){ 
             System.out.println("Sua idade é " + idade +"  meses, e você é um bebê" );
     
        }
        else if(idade >= 1 && idade <= 12 )  {
            System.out.println("Sua idade é " + idade +"  anos,  e você é uma criança" );
            
        }
        else if(idade >= 13 && idade <= 18 ){
            System.out.println("Sua idade é " + idade +"  anos, e você é um adolescente" );
           
        }
        else{
         System.out.println("Sua idade é " + idade +"  anos, e você é um adulto" );

        }
    }
}

// 18. Peça ao usuário que insira o seu estado civil e, usando a estrutura switch/case, 
//exiba uma mensagem informando se é solteiro, casado, divorciado ou viúvo.
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String estadoCivil;
       
            System.out.println("Insira o seu estado civil ");
             estadoCivil = in.nextLine();
           
     
     switch(estadoCivil.toLowerCase()){

        case "solteira": 
        System.out.print( "O estado civil é Solteira ");
        break;

        case "solteiro": 
        System.out.print( "O estado civil é Solteiro ");
        break;

        case "casada":
        System.out.print( "O estado civil é Casada ");
        break;

        case "casado":
        System.out.print( "O estado civil é Casado ");
        break;

        case "divorsiada":
        System.out.print( "O estado civil é Divorsiada ");
        break;

        case "divorsiado":
        System.out.print( "O estado civil é Divorsiado ");
        break;

        case "viuva":
        System.out.print( "O estado civil é Viuva");
        break;

        case "viuvo":
        System.out.print( "O estado civil é Viuvo");
        break;

        default:
        System.out.println("Estado civil é inválido! Digite solteiro, casado, divorsiado ou viuvo.");

        }    
           
    }
}


// 19. Solicite ao usuário dois números inteiros e, usando a estrutura switch/case, exiba o resultado 
//da operação escolhida pelo usuário (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão).
 import java.util.Scanner;

public class index {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int num1, num2, operacao;
       
            System.out.println("Insira o primeiro numero ");
             num1 = in.nextInt();

            System.out.println("Insira o segundo numero ");
             num2 = in.nextInt();

            System.out.println("escolha a operação : 1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão");
             operacao = in.nextInt();
           
     
     switch(operacao){

        case 1: 
        int soma = num1 + num2;
        System.out.print( "A operação escolhida é a soma, e o resultado é " + soma);
        
        break;

        case 2: 
            int sub = num1 - num2;
            System.out.print( "A operação escolhida é a subtração, e o resultado é " + sub);
        break;

        case 3:
            int mult = num1 * num2;
            System.out.print( "A operação escolhida é a multiplicação, e o resultado é " + mult);
        break;

        case 4:
            int div = num1 / num2;
            System.out.print( "A operação escolhida é a divião, e o resultado é " + div);
        break;

    
        default:
        System.out.println("Estado civil é inválido! Digite solteiro, casado, divorsiado ou viuvo.");

        }    
           
    }
}



// 20. Desenvolva um programa que leia o nome e a idade de uma pessoa. Utilize o
//bloco try/catch para garantir que a idade digitada seja um valor inteiro válido.
 import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade = 0;
        String nome;

        System.out.println("Digite seu nome");
            nome = in.nextLine();

         try{
               
            
            System.out.println("Digite sua idade");
            idade = in.nextInt();


        }catch( Exception e){
            System.out.println("Idade inválida. Digite um valor inteiro válido.");

        }
             
        System.out.println( " o seu nome é " + nome + " e sua idade  é " + idade + "anos");
     
    
        }    
           
    }
 

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
