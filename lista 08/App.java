import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinhoX = new CarrinhoDeCompras();
        Produto banana = new Produto(1, 5.30, "Banana");
        Produto manga = new Produto(2, 2.10, "Manga");
        Produto pera = new Produto(3, 2.30, "Pêra");

        carrinhoX.adicionar(banana);
        carrinhoX.adicionar(manga);
        carrinhoX.adicionar(pera);
        carrinhoX.listar();

        System.out.println("");
        carrinhoX.remover(0);
        carrinhoX.listar();

    }
}
