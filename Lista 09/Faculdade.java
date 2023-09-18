import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    
    public static void main( String [] args){

        List<Aluno> media = new ArrayList<>(); 
       // double[] notasAluno1 = { 8.5, 9.0, 7.5 };

        NotasAluno [] mediaAluno1 = { new NotasAluno("Aluno 1", 5.6, 10, 4)};
        Aluno media1 = new Aluno(1234, mediaAluno1);

        media.add(media1);


        NotasAluno [] mediaAluno2 = { new NotasAluno("Aluno 1", 6, 3, 4)};
        Aluno media2 = new Aluno(4321, mediaAluno2);
        media.add(media2);

         for (Aluno aluno : media) {
            double mediaAluno = aluno.calcularMedia();

            if (mediaAluno >= 7) {
                System.out.println("Aluno(s) Aprovado(s):");
                System.out.println("Aluno: " + aluno.getMatricula() + ",Media aluno: " + mediaAluno);
            }
            else if (mediaAluno < 7) {
                System.out.println("Aluno(s) Reprovado(s):");
                System.out.println("Aluno: " + aluno.getMatricula() + ",Media aluno: " + mediaAluno);
                }
            }
        }   
}