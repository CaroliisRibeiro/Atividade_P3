
import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        
        livros.add( new Livro("Aventuras de Sherlock Holmes", "Arthur Conan Doyle"));
        livros.add( new Livro("1984", "George Orwell"));
        livros.add (new Livro("Dom Quixote", "Miguel de Cervantes"));

    
        livros.get(0).setDisponivel(true);
        livros.get(1).setDisponivel(false);
        livros.get(2).setDisponivel(false);


        

        // Verificar a disponibilidade dos livros e exibir mensagens correspondentes
        for (Livro livro : livros) {

        System.out.println(livro.verificarDisponibilidade());
        
        }
    }
}