public class Livraria {
    public static void main( String [] args){

    Livro livro = new Livro( "carol","carol",2023);
    Livro livro1 = new Livro( "A mumia","Tom cruise",2013);


        System.out.println( "Lista Livros");
        System.out.println( "Titlo " + livro.getTitulo() + " / Autor  " + livro.getAutor() + " / Ano " + livro.getAnoPublicacao());
        System.out.println( "Titlo " + livro1.getTitulo() + " / Autor " + livro1.getAutor() + " / Ano  " + livro1.getAnoPublicacao());
        livro.setTitulo("fabio");
        livro1.setTitulo("suri");
        System.out.println( "Livros atualizados");
        System.out.println( "Titlo " + livro.getTitulo() + " / Autor  " + livro.getAutor() + " / Ano " + livro.getAnoPublicacao());
        System.out.println( "Titlo " + livro1.getTitulo() + " / Autor " + livro1.getAutor() + " / Ano  " + livro1.getAnoPublicacao());


    
        }
    }
