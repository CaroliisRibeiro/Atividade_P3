public class Funcionario{
    
    private String nome; 
    private int idade; 
    private double salarioPorAno; 
    

    public  Funcionario(String nome, int idade, double salarioPorAno){
        this.nome = nome; 
        this.idade = idade; 
        this.salarioPorAno = salarioPorAno; 

        
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double getSalario() {
        return salarioPorAno;
    }


    public void setSalario(double salarioPorAno) {
        this.salarioPorAno = salarioPorAno;
    }
    
    





}