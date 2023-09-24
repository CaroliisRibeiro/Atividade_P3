public class ContaBancaria{
    private String nomeTitular;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, String numConta){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = 0;


    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}