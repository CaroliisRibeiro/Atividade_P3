

    public  class Pedido {
    private int numero;
    private PedidoItem[] itens;

    public Pedido(int numero, PedidoItem[] itens) {
        this.numero = numero;
        this.itens = itens;

        
    }

    public int getNumero() {
        return numero;
    }

    
    public PedidoItem[] getItens() {
        return itens;
    }

    

    public double calcularTotal() {
        double total = 0;
        for (PedidoItem item : itens) {
            total += item.getPreco();
        }
        return total;

  }
    
}
