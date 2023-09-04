// 1- Solicite ao usuário seu nome e imprima 
//uma mensagem de boas-vindas na tela.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite seu nome");
        String nome;
        nome = in.nextLine();
        System.out.println( "Seja bem Vindes! " + nome);

    }
}

// 2-Peça ao usuário que digite sua idade em texto 
//(por exemplo, "18") e converta-a em um número inteiro.
import java.util.Scanner;
public class index{


    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite sua idade");
        int idade;
        idade = in.nextInt();
        System.out.println( "Sua idade é! " + idade + " anos");

    }
}

//3. Receba um número inteiro do usuário e converta-o
// em um número decimal (float)..

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite um numero inteiro");
        int n;
        n = in.nextInt();
        float num = n;
        System.out.println( "Sua numero é! " + num );

    }
}

// 4. Peça ao usuário para digitar dois números 
//inteiros e exiba a soma deles.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite dois numero inteiro");
        int x, y, soma;
        x = in.nextInt();
        y = in.nextInt();
        soma = x + y; 

        System.out.println( "A soma X + Y é:  " + soma );

    }
}


// 5. Receba um número decimal do usuário e calcule
//o seu quadrado.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite um numero decimal");
        double x, quadrado;
        x = in.nextDouble();
        quadrado = x*x;

        System.out.println( " O quadrado  X é:  " + quadrado );
    }
}

// 6. Peça ao usuário que insira o seu ano de 
//nascimento e, em seguida, exiba a sua idade.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        int anoNasc, anoAtual, idade;

        System.out.println( "Digite o seu ano de nascimento");
        anoNasc = in.nextInt();

        System.out.println( "Digite o  ano de atual");
        anoAtual = in.nextInt();
        idade = anoAtual - anoNasc;

        System.out.println( " A sua idade é:  " + idade + " anos");

    }
}


// 7. Peça ao usuário que digite seu primeiro nome
//e seu sobrenome separadamente. Em seguida,
//concatene-os em uma única string e exiba o nome completo.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String nome, sobrenome;

        System.out.println( "Digite o seu nome");
        nome = in.nextLine();

        System.out.println( "Digite seu sobrenome");
        sobrenome = in.nextLine();
        

        System.out.println( " O seu nome completo é :  " + nome + " " + sobrenome);

    }
}

// 8. Solicite ao usuário uma sequência de números 
//separados por espaço e exiba quantos números foram digitados.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite uma sequência de numeros separados por espaço");
        String numeros;
        numeros = in.nextLine();
        int num = numeros.replace(" ","") .length();
        System.out.println("Quantidade de números digitados: " + num);

    }
}

// 9. Receba o nome de um animal digitado pelo usuário e exiba uma 
// mensagem informando qual animal foi digitado.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite o nome do seu animal preferido");
        String nomeAnimal;
        nomeAnimal = in.nextLine();
        System.out.println("O nome do seu animal preferido é : " + nomeAnimal);

    }
}


// 10. Peça ao usuário que digite o seu nome e o seu sobrenome.
 //Em seguida, exiba o nome completo invertido (sobrenome, nome).
 import java.util.Scanner;
 public class index{
 
     public static void main( String [] args){
         Scanner in = new Scanner(System.in);
         System.out.println( "Digite seu nome e sobrenome");
         String invertnomeSobrenome, nomeSobrenome;
         nomeSobrenome = in.nextLine();
 
         int tam = nomeSobrenome.length();
         char []nome = new char [tam];
         int i, cont;
         cont=0;
         for (i = tam - 1; i >= 0; i--) {
         nome [cont] = nomeSobrenome.charAt(i);
             cont++;
     }
         invertnomeSobrenome = new String(nome);
 
 
         System.out.println("O nome do seu animal preferido é : " + invertnomeSobrenome);
 
     }
 }

 // 11. Receba uma string digitada pelo usuário e imprima o seu 
//tamanho (número de caracteres).
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite uma palavra");
        String palavra;
        palavra = in.nextLine();
        int numPalavra = palavra.length();
        System.out.println("Quantidade de caracteres da palvra digitada é : " + numPalavra);

    }
}


// 12. Solicite ao usuário um número inteiro e exiba se ele é par ou ímpar.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite um numero qualquer");
        int num;
        num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("O numero " + num +  " é par");
            
        }
        else{            
            System.out.println("O numero " + num +  " é impar");
    }

 }
}

 // 13. Receba um número inteiro digitado pelo usuário e verifique se ele
 //é positivo ou negativo.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite um numero qualquer");
        int num;
        num = in.nextInt();
        if(num > 0){
            System.out.println("O numero " + num +  " é positivo");
            
        }
        else{            
            System.out.println("O numero " + num +  " é negativo1");
    }

 }
}



// 14. Peça ao usuário que insira dois números e exiba o maior deles.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite dois numeros quaisquer");
        int x, y;
        x = in.nextInt();
        y = in.nextInt();

           if(x > y ){
            System.out.println("O número " + x +  " é maior");

            } 
            else {            
            System.out.println("O número " + y  +  " é maior" );
                
        }
    }
}


        // 15. Receba a altura e o peso de uma pessoa digitados pelo usuário. 
//Em seguida, calcule o seu índice de massa corporal (IMC) utilizando a 
//fórmula: IMC = peso / (altura * altura) e exiba o resultado.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double peso, altura, imc;
        System.out.println( "Digite seu peso em kilos ");
        peso = in.nextDouble();

        System.out.println( "Digite sua altura em centimentros");
        altura = in.nextInt();

        imc = peso /(altura * altura);
           
            System.out.println("O IMC calculado é:  " + imc );
 
    
    }

 }


 // 16. Peça ao usuário que digite o seu nome e verifique se ele 
//contém mais de 5 caracteres.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String nome;
        System.out.println( "Digite seu nome ");
        nome = in.nextLine();
        int numCaract = nome.length();

        if ( numCaract > 5){
        System.out.println("Quantidade de caracteres do nome digitada tem mais de 5 caracteres ");

     } 
     else if( numCaract < 5) {
        System.out.println("Quantidade do caracteres da nome digitada é menor  que 5 ");

     }
     else {
        System.out.println("Quantidade do caracteres da nome digitada é igual  a 5 ");

     }
    
    }

 }


 // 17. Solicite ao usuário que insira o seu estado civil e exiba uma
// mensagem apropriada (por exemplo:"Você é casado(a)", "Você é solteiro(a)", etc.).

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String estadoCivil;
        System.out.println( "Digite seu Estado Civil ");
        estadoCivil = in.nextLine();
    
        System.out.println("Vccê é " + estadoCivil);

     
    
    }

 }



 // 18. Receba a base e a altura de um retângulo digitados pelo usuário.
// Em seguida, calcule a sua área e exiba o resultado.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double base, altura;
        System.out.println( "Digite a base do retangulo.");
        base = in.nextDouble();
    
        System.out.println("Digite a altura do retangulo. ");
        altura = in.nextDouble();

        double area = base * altura;

                System.out.println("A area do retangulo é :" + area);
    
    }

 }


 // 19. Peça ao usuário que digite a sua cidade e verifique 
//se ela começa com a letra "S" (ou outra letra de sua escolha).

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String cidade; 

        char letra = 'R';
        
        System.out.println( "Digite o nome da cidade de sua preferencia");

        cidade = in.nextLine();
        
        
        
            if (cidade.length() > 0 && (cidade.charAt(0) == letra || cidade.charAt(0) == Character.toLowerCase(letra))){

            
            
                System.out.println("A cidade começa com a letra '" + letra +"'.");
            } 
            else {
                System.out.println("A cidade não começa com a letra '" + letra + "'.");
            }
            }
    }



    // 20. Solicite ao usuário que insira dois números decimais e calcule 
// o resto da divisão entre eles.
import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double num1, num2; 
  
        
        System.out.println( "Digite um numero decimal");
        num1 = in.nextInt();

        System.out.println( "Digite outro numero decimal");
        num2 = in.nextInt();

        double divResto = num1 % num2;
        
           System.out.println( "O resto da divisão entre os numeros é:  " + divResto);
         }
        
    }
    

    // 21. Solicite ao usuário um número decimal e converta-o em um número inteiro.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double num1; 
  
        
        System.out.println( "Digite um numero decimal");
        num1 = in.nextDouble();
        int valorInt = (int)num1;

        
           System.out.println( "O numero " + num1 + " ( decimal) ,  agora o numero é  " + valorInt + (" inteiro "));
         }
        }
    

    // 22. Receba uma string contendo um número inteiro e some 10 a esse número, 
//convertendo-o novamente para uma string antes de exibi-lo.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String num1; 
  
        
        System.out.println( "Digite um numero ");
        num1 = in.nextLine();
        Scanner sc = new Scanner(num1);
        int valorInt = sc.nextInt();
         int soma = valorInt + 10; 
           System.out.println( "O numero " + num1 + " é uma String, mas foi transformado em inteiro. Sua soma " + valorInt + " + 10 = " + soma);
         }
    
}


// 23. Solicite ao usuário que digite uma data no formato 
//"dd/mm/aaaa" e extraia o dia, o mês e o ano separadamente, 
//convertendo-os em números inteiros.


import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String data; 
        
        System.out.println( "Digite a data de hoje (formato dd/mm/aaaa) ");
        data = in.nextLine();
        
        int dia, mes, ano;
        String[] diaMesAno = new String[3];
         diaMesAno = data.split ("/");

        if (diaMesAno.length == 3) {
            dia = Integer.parseInt(diaMesAno[0]);
            mes = Integer.parseInt(diaMesAno[1]);
            ano = Integer.parseInt(diaMesAno[2]);

            System.out.println( "Dia: " + dia );
            System.out.println( "Mês: "  + mes );
            System.out.println( "Ano: " + ano);
        }
    }
}
 
         

// 24. Receba o nome de uma cidade do usuário e concatene-o com o nome do
 //estado para formar uma
mensagem completa, como "Você mora em [cidade], [estado].".

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String cidade, estado; 
        
        System.out.println( "Digite a cidade ");
        cidade = in.nextLine();

        System.out.println( "Digite o estado ");
        estado = in.nextLine();
        
        
        System.out.println( "Você mora em " +  cidade.toUpperCase()+ " . " + estado.substring(0,2).toUpperCase() );
            
        }
       
    }


    // 25. Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de
//boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!".

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String anoNas; 
        
        System.out.println( "Digite a data de nascimento ");
        anoNas = in.nextLine();

        System.out.println( "Bem-vindo ao nosso programa, nascido em " + anoNas);
       
        }
    }


    // 26. Receba um número inteiro e uma string do usuário. Em seguida, 
//concatene-os em uma única string, separando-os com um espaço.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        int num; 
        String palavra;
        
        System.out.println( "Digite um número inteiro ");
        num = in.nextInt();
        in.nextLine();

        System.out.println("Digite uma palvra" );
        palavra = in.nextLine();

        System.out.println( "Numero e palavra concatenado: "  + num + " - " + palavra);
       
        }
    }


    // 27. Receba o nome de um produto digitado pelo usuário e concatene-o com 
//o preço do produto, adicionando o símbolo de moeda da sua escolha.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double preco; 
        String produto;
        
        System.out.println("Digite o produto" );
        produto = in.nextLine();

        System.out.println( "Digite opreço do produto ");
        preco = in.nextDouble();

        

        System.out.println( "Nome do produto:  "  + produto + " - preço  R$  " + preco);
       
        }
    }



    // 28. Receba um número inteiro do usuário e concatene-o com uma mensagem, 
//informando o dobro desse número.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        int num; 
        
        System.out.println("Digite um numero inteiro" );
        num = in.nextInt();

        int dobro = 2*(num);
      

        

        System.out.println( "O dobro do numero "   + num + "  é  igual a  " + dobro);
       
        }
    }


    // 29. Receba uma string contendo um endereço de e-mail e concatene-a 
//com uma mensagem de agradecimento personalizada.

import java.util.Scanner;
public class index{

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        String email; 
        
        System.out.println("Digite um endereço de email válido" );
        email = in.nextLine();

    
        System.out.println( email + " -  Seja muito  bem vinde!! gratidão por inserir seu email.   Até mais!  ") ;
       
        }
    }



    
// 30. Receba dois números inteiros do usuário e exiba a soma, a diferença, 
//o produto e o quociente (divisão inteira) entre eles.
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        int num1, num2; 

        
        System.out.println("Digite um número inteiro" );
        num1 = in.nextInt();

        System.out.println("Digite outro numero inteiro" );
        num2 = in.nextInt();

        int soma = num1 + num2;
        int diferença = num1 - num2;
        int produto = num1 * num2;
         int quociente = num1 / num2;

        System.out.println(  "As quatro opeções com os númesros - " + num1 + " e " + num2 );
        System.out.println( "soma = " + soma );
        System.out.println( "subtração = " + diferença);
        System.out.println( "multiplicação = " + produto);
        System.out.println( "divisão = " + quociente);       
        }
}



//31. Peça ao usuário para digitar a base e a altura de um triângulo. 
//Em seguida, calcule e exiba a área do triângulo.
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double base, altura; 

        
        System.out.println("Digite a base do triângulo" );
        base = in.nextDouble();

        System.out.println("Digite a altura do triângulo" );
        altura = in.nextDouble();

        double areaTriangulo = (base*altura)/2;

        
        System.out.println( "A area do triângulo é = " + areaTriangulo);       
        }
}



//32. Receba o raio de uma circunferência digitado pelo usuário e 
//calcule o seu perímetro (2 * π * raio).
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double raio; 
    
        System.out.println("Digite o raio da circunferência ");
        raio = in.nextDouble();
        
        double perimetro = (2 * Math.PI * raio);

        
        System.out.println( "O perimetro é = " + perimetro);       
        }
}



//  33. Receba a base e a altura de um retângulo digitados pelo usuário. 
//Em seguida, calcule e exiba o perímetro do retângulo.
import java.util.Scanner;

public class index {


    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double base, altura;

    }
        System.out.println("Digite base do retângulo");
        base = in.nextDouble();

        System.out.println("Digite altura do retângulo");
        altura = in.nextDouble();
        
        double perimetro= 2*(base+altura);
        
        System.out.println( "O PERIMETRO DO RETâNGULO É = " + perimetro );
        }
}




// 34. Solicite ao usuário que insira três números decimais. 
//Em seguida, calcule e exiba a média aritmética desses números.
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double num1, num2, num3; 

    
        System.out.println("Digite o 1º número");
        num1 = in.nextDouble();

        System.out.println("Digite o 2º número");
        num2 = in.nextDouble();

        System.out.println("Digite o 3º número");
        num3 = in.nextDouble();
        
        double media = (num1 + num2 + num3)/3;

        
        System.out.println( "A média aritmetica é = " + media);       
        }
}


// 35. Peça ao usuário para digitar a sua idade e, em seguida, 
//informe quantos meses e quantos dias ele já viveu (considerando um ano com 365 dias)..
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        int idade; 

    
        System.out.println("Digite sua idade");
        idade = in.nextInt();

        int meses = 12 * idade;
        int dias = 365 * idade;


        
        System.out.println( "Você já viveu " + meses + " meses e " + dias + " dias.");       
        }
}



//  36. Receba um valor em reais e a cotação do dólar digitados pelo usuário. 
//Em seguida, converta o valor para dólares e exiba o resultado.
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double valor, dolar; 

    
        System.out.println("Digite o valor em Reais");
        valor = in.nextDouble();

        System.out.println("Digite a cotação do dolar" );
        dolar = in.nextDouble();

        double conversao = valor / dolar;


        
        System.out.println( "O valor de R$ " + valor + " convertido para a cotação do dolar do dia é $ " + conversao );       
        }
}



//  37. Solicite ao usuário para digitar um número decimal e arredonde-o
// para o inteiro mais próximo..
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double num; 

    
        System.out.println("Digite o numero decimal");
        num = in.nextDouble();

        int arredondarNum = (int) Math.round(num);
        
        System.out.println( "O valor de " + num + " arredondado é " + arredondarNum );       
        }
}


//  38. Receba três números inteiros digitados pelo usuário e exiba o
// resultado da operação (n1 + n2) * n3.
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        int n1, n2, n3;

    
        System.out.println("Digite 1º numero inteiro ");
        n1 = in.nextInt();

        System.out.println("Digite 2º numero inteiro ");
        n2 = in.nextInt();

        System.out.println("Digite 3º numero inteiro ");
        n3 = in.nextInt();

        int operacao = (n1 + n2)*n3;
        
        System.out.println( "O resultado da operação ((n1 + n2) * n3) entre os numeros:  " + n1 + " , " + n2 + " , "  + n3 + " é = " + operacao);
        }
}


//  39. Peça ao usuário que digite uma temperatura em graus Celsius e a 
//converta para Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32.
import java.util.Scanner;

public class index {

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        double temperatura;

    
        System.out.println("Digite temperatura em graus Celsius");
        temperatura = in.nextDouble();

        
        double converFahrenheit = (temperatura* 9/5) + 32;
        
        System.out.println( "A temperatura " + temperatura + "°C, convertida para Fahrenheit é de " + converFahrenheit + "°F");
        }
}

