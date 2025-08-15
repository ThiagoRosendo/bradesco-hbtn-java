public class ArmazemDeComida extends Armazem{

        public void adicionarAoInventario(String nome, Comida comida) {
            super.adicionarAoInventario(nome, comida);
    }

    public Comida obterDoInventario(String nome) {
        Object item = super.obterDoInventario(nome);
        if (item instanceof Comida) {
            return (Comida) item;
        }
        return null;
    }
    
}