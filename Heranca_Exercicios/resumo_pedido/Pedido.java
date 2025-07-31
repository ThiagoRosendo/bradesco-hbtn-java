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

    public void apresentarResumoPedido() {
        
        double totalProdutos = 0;

        System.out.println("------- RESUMO PEDIDO -------");


        for (ItemPedido itemPedido : itens) {
            
            
            String tipo = itemPedido.getProduto().getClass().getSimpleName();
            String titulo = itemPedido.getProduto().getTitulo();
            double preco = itemPedido.getProduto().obterPrecoLiquido();
            int quantidade = itemPedido.getQuandidade();
            double subtotal = itemPedido.getQuandidade() * itemPedido.getProduto().obterPrecoLiquido();
            totalProdutos += subtotal;
            
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n", tipo, titulo, preco, quantidade, subtotal);
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", totalProdutos * (percentualDesconto/100));
        System.out.printf("TOTAL PRODUTOS: %.2f\n", totalProdutos);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
        
    }
    
}
