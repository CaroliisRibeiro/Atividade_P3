import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }


    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0  ){
        this.anoPublicacao = anoPublicacao;
    } else {
        System.out.println("Ano de publicação inválido. O ano deve ser maior que zero.");
    }
}


    
    
}
