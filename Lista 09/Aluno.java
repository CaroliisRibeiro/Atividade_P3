public class Aluno {
    private int matricula;
    private NotasAluno [] notas;



    public Aluno(int matricula, NotasAluno [] notas) {
        this.matricula = matricula;
        this.notas = notas;
    
}

    public int getMatricula() {
        return matricula;
    }



    public NotasAluno[] getNotas() {
        return notas;
    }

    public double calcularMedia(){
        double media = 0;

        for (NotasAluno nota : notas) {

            media = nota.getNota1() + nota.getNota2() + nota.getNota3();
        }
        return media/(notas.length * 3);
    }
}
