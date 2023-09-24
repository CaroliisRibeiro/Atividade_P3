public class Banco {
    public static void main(String [] args){

        ContaBancaria conta1 = new ContaBancaria (" Nome Titular", "0000");
         
     System.out.println( "Abertura de conta " + conta1.getNomeTitular() + conta1.getNumConta()+ " \n" );
    System.out.println( "Conta  inicial" + "\n" + conta1.getNomeTitular()+  " --- " + conta1.getNumConta() + "\n");

        conta1.setNomeTitular("Carol");
        conta1.setNumConta("1234");
        conta1.setSaldo(200.34);

        System.out.println("Dados da Conta:\n ");
        System.out.println("Nome Titular: " + conta1.getNomeTitular());
        System.out.println("Numero Conta: " + conta1.getNumConta());
        System.out.println("Saldo: R$ " + conta1.getSaldo());

       
       



    }
    
}
