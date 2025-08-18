import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    private String arquivoCSV;

    public Estoque(String arquivo){
        this.arquivoCSV = arquivo;
        this.produtos = new ArrayList<Produto>();
        carregarDoCSV();
    }

    public void adicionarProduto(String nome, int quantidade, double preco){
        Produto produto = new Produto(produtos.get(produtos.size() -1).getId() + 1, nome, quantidade, preco);
        for (Produto item : produtos) {
            if (item.getId() == produto.getId()) {
                throw new IllegalArgumentException("Já existe um produto com este ID.");
            }
        }
        produtos.add(produto);
        salvarNoCSV();
    }

    public void atualizarQuantidade(int id, int quantidade){
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(quantidade);
                salvarNoCSV();
                return;
            }
        }
        System.out.println("Produto não encontrado para atualização.");
    }

    public void excluirProduto(int id) {
        boolean removido = produtos.removeIf(p -> p.getId() == id);

        if (removido) {
            salvarNoCSV();
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void exibirEstoque(){
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    private void carregarDoCSV() {
        File arquivo = new File(arquivoCSV);
        if (!arquivo.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                int quantidade = Integer.parseInt(dados[2]);
                double preco = Double.parseDouble(dados[3]);
                produtos.add(new Produto(id, nome, quantidade, preco));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar estoque: " + e.getMessage());
        }
    }

    private void salvarNoCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCSV))){
            for (Produto produto : produtos) {
                bw.write(produto.getId() + "," + produto.getNome() + "," + produto.getQuantidade() + "," + produto.getPreco());
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar estoque: " + e.getMessage());
        }
    }
}
