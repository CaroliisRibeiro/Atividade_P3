public class Produto {
  private int id;
  private double preco;
  private String nome;

  public Produto(int id, double preco, String nome) {
    this.id = id;
    this.preco = preco;
    this.nome = nome;
  }

  public int getId() {
    return id;
  }

  public double getPreco() {
    return preco;
  }

  public String getNome() {
    return nome;
  }
}
