public class ArmazemDeEletronico extends Armazem<Eletronico>{
    
    public void adicionarAoInventario(String nome, Eletronico eletronico){
        super.adicionarAoInventario(nome, eletronico);
    }

    public Eletronico obterDoInventario(String nome) {
        Object item = super.obterDoInventario(nome);
        if (item instanceof Eletronico) {
            return (Eletronico) item;
        }
        return null;
    }
}
