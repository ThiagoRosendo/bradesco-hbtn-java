import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<PedidoCookie> cookies;
    
    public Pedido(){
        this.cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int totalCaixas = 0;

        for (PedidoCookie pedidoCookie : cookies) {
            totalCaixas += pedidoCookie.getQuantidadeCaixas();
        }

        return totalCaixas;
    }

    public int removerSabor(String sabor){
        int quantidadeRemovidos = 0;
        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getSabor() == sabor) {
                quantidadeRemovidos += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }
        }
        return quantidadeRemovidos;
    }
}
