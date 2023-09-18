public class NotasAluno {
    private String nome;
    private double nota1, nota2, nota3;




public  NotasAluno(String nome, double nota1, double nota2, double nota3){
        //this.numero = numero; 
        this.nome = nome; 
        this.nota1 = nota1; 
        this.nota2 = nota2;
        this.nota3 = nota3;

    
}


public String getNome() {
    return nome;
}


public double getNota1() {
    return nota1;
}


public double getNota2() {
    return nota2;
}


public double getNota3() {
    return nota3;
}


}