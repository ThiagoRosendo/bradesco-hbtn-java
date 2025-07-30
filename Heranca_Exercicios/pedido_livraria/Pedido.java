package pedido_livraria;
public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido (double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido itemPedido : itens) {
            total += itemPedido.getQuandidade() * itemPedido.getProduto().obterPrecoLiquido();
        }

        return total * (1 - (percentualDesconto/100));
    }
    
}
