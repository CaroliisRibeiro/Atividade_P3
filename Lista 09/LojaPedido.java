import java.util.ArrayList;
import java.util.List;

public class LojaPedido {

    public static void main(String[] args) {

    
    List<Pedido> pedidos = new ArrayList<>(); 

    PedidoItem [] itensPedido1 = { new PedidoItem("Produto 1", 560)};
        Pedido pedido1 = new Pedido(1, itensPedido1);

         pedidos.add(pedido1);


    PedidoItem[] itensPedido2 = { new PedidoItem("Produto 2", 200), new PedidoItem("Produto 3", 250) };
         Pedido pedido2 = new Pedido(2, itensPedido2);
         pedidos.add(pedido2);


     PedidoItem [] itensPedido3 = { new PedidoItem("Produto 4", 400), new PedidoItem("Produto 5", 250) };
         Pedido pedido3 = new Pedido(3, itensPedido3);
         pedidos.add(pedido3);


        for (Pedido pedido : pedidos) {
            double totalPedido = pedido.calcularTotal();


            if (totalPedido > 500) {
                System.out.println("Pedidos com valor total superior a R$ 500:");
                System.out.println("Número do Pedido: " + pedido.getNumero() + ", Total: R$" + totalPedido);
                
                }
            
            }
        }
    }




 