import java.util.ArrayList;

public class CarrinhoDeCompras {
  ArrayList<Produto> carrinho; // null -> {}

  public CarrinhoDeCompras() {
    this.carrinho = new ArrayList<>();
  }

  public void adicionar(Produto produto) {
    carrinho.add(produto);
  }

  public void remover(int indexProduto) {
    carrinho.remove(indexProduto);
  }

  public void listar() {
    for (Produto produto : carrinho) {
      System.out.println(produto.getNome());
    }
  }
}