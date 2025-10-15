package application;

import domain.Cliente;
import domain.Pedido;
import domain.Produto;
import infrastructure.PedidoRepository;

public class PedidoService {


    private final PedidoRepository pedidoRepository;


    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    public Pedido criarPedido(Cliente cliente) {
        return new Pedido(cliente);
    }


    public void adicionarProduto(String pedidoId, Produto produto) {
        this.pedidoRepository.buscarPorId(pedidoId).adicionarProduto(produto);
    }


    public void pagarPedido(String pedidoId) {
        this.pedidoRepository.buscarPorId(pedidoId).pagar();
    }


    public void cancelarPedido(String pedidoId) {
        this.pedidoRepository.buscarPorId(pedidoId).cancelar();
    }
}