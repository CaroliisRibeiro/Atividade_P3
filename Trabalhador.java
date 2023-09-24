public class Trabalhador {
    private String nome;
    private int idade;
    private double valorDahora;
    private int horasDeTrabalho;
    private boolean ferias;


    public Trabalhador(String nome, int idade, double valorDahora, int horasDeTrabalho, boolean ferias) {
        this.nome = nome;
        this.idade = idade;
        this.valorDahora = valorDahora;
        this.horasDeTrabalho = horasDeTrabalho;
        this.ferias = ferias;
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


    public double getValorDahora() {
        return valorDahora;
    }


    public void setValorDahora(double valorDahora) {
        this.valorDahora = valorDahora;
    }


    public int getHorasDeTrabalho() {
        return horasDeTrabalho;
    }


    public void setHorasDeTrabalho(int horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }


    public boolean isFerias() {
        return ferias;
    }


    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }


    public void ferias(){
        if (ferias) {
            System.out.println(nome + " está retornando ao trabalho.");
            ferias = false;
        } else {
            System.out.println(nome + " está de férias.");
            ferias = true;
        }
    }


    public double calcularPagamento(double valorDahora2, int horasDeTrabalho2) {
        return 0;
    }

    

    }