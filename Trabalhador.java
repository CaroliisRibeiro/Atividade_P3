public class Trabalhador {

private String nome;
private int idade;
private double valorDaHora;
private int horasTrabalhadas;
private boolean ferias;




public Trabalhador(String nome, int idade, double valorDaHora, int horasTrabalhadas, boolean ferias ){

    this.nome= nome;
    this.idade = idade;
    this.valorDaHora = valorDaHora;
    this.horasTrabalhadas = horasTrabalhadas;
    this.ferias = ferias;
    

}

public String getNome() {
    return nome;
}


public int getIdade() {
    return idade;
}




public double getValorDaHora() {
    return valorDaHora;
}




public int getHorasTrabalhadas() {
    return horasTrabalhadas;
}




public boolean isFerias() {
    return ferias;
}



public void ferias(){

}






}
