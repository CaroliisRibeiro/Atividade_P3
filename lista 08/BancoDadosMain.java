
public class BancoDadosMain{


    public static void main( String [] args){


        BancoDedados BancoNovo = new BancoDedados("Usuario", "Senha");
        BancoNovo.autenticar( "Usuario", "Senha");
        BancoNovo.adicionar("Usuario 01");
        BancoNovo.adicionar("Usuario 02");
        BancoNovo.adicionar("Usuario 03" );
        BancoNovo.listarRegistros();
        BancoNovo.atualizar(0, "Usuario 04");
        BancoNovo.atualizar(1, "Usuario 05");
        BancoNovo.atualizar(2, "Usuario 06");
        BancoNovo.listarRegistros();
        BancoNovo.excluir(0);
        BancoNovo.excluir(1);
        BancoNovo.listarRegistros();

    }
}