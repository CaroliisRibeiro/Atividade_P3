import java.util.ArrayList;

public class BancoDedados {
    private String nome;
    private String senha;
    private ArrayList<String> registros;
    private boolean usuarioAutenticado;

    public BancoDedados(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
        this.registros = new ArrayList<>();
        this.usuarioAutenticado = false;


}
    public void autenticar( String usuario, String senha){

        if (usuario.equals(this.nome) && senha.equals(this.senha)){
            usuarioAutenticado = true;
            System.out.println("Bem vindes ao Novo Banco - Autenticação bem-sucedida!");


        }else{
            usuarioAutenticado = false;
            System.out.println("Falha na autenticação. Acesso negado.");


        }
    }

        public void adicionar(String novoUsuario){
        if (usuarioAutenticado) {
            registros.add(novoUsuario);

            System.out.println("Usuário adicionado com sucesso.");
            } else {
                System.out.println("Acesso negado. Faça login primeiro.");    
            }
        }


    public void atualizar(int indice, String usuarioAtualizado){
    System.out.println("Usuário atualizado" );

         System.out.println( indice );

        if(usuarioAutenticado){

            if (indice >= 0 && indice < registros.size()) {
               registros.set(indice, usuarioAtualizado);

            }else {
                    System.out.println("Numero de Usuário inválido.");
                }
            } else {
                System.out.println("Acesso negado. Faça login primeiro.");
            }

    }

    
    public void excluir(int indice){
        if(usuarioAutenticado){
            if (indice >= 0 && indice < registros.size()) {
            registros.remove(indice);
            System.out.println("Usuário excluído com sucesso.");
        } else {
            System.out.println("Numero de Usuário inválido.");
        }
    } else {
        System.out.println("Acesso negado. Faça login primeiro.");
    }
}

public void listarRegistros() {
    if (usuarioAutenticado) {
    System.out.println("\n lista de usuráios");
        for (int i = 0; i < registros.size(); i++) {
            System.out.println("Usuario " + i + " : " + registros.get(i));
        }
    } else {
        System.out.println("Acesso negado. Faça login primeiro.");
    }
}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isUsuarioAutenticado() {
        return usuarioAutenticado;
    }
    public void setUsuarioAutenticado(boolean usuarioAutenticado) {
        this.usuarioAutenticado = usuarioAutenticado;
    }
    public ArrayList<String> getRegistros() {
        return registros;
    }
    public void setRegistros(ArrayList<String> registros) {
        this.registros = registros;
    }

    
    }
