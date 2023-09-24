public class Livro {
    
    private String titulo;
    private String autor;
    private boolean disponivel;


    
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;

        
    }


    public String getTitulo() {
        return titulo;
    }


    public boolean isDisponivel() {
        return disponivel;
    }


    public String getAutor() {
        return autor;
    }


    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public String verificarDisponibilidade(){

       // for (LivroAcervo livro : titulo) {
            //boolean disponivel = true;


            if (disponivel){
            
                return "O livro '" + titulo + "' de " + autor + " está disponível para empréstimo.";
            } else {
                return "O livro '" + titulo + "' de " + autor + " não está disponível para empréstimo.";
            }
        }
    }