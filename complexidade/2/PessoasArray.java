public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes = new String[] { "Amanda", "Beatriz", "Carlos", "Daniela", "Eduardo",
                "Fabio", "Gustavo", "Hingrid", "Isabela", "Joao", "Leise", "Maria",
                "Norberto", "Otavio", "Paulo", "Quirino", "Renata", "Sabata",
                "Tais", "Umberto", "Vanessa", "Xavier" };
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public void buscaBinaria(String nome) {
        boolean encontrado = false;
        int inicio = 0;
        int fim = nomes.length - 1;

        System.out.printf("Procurando o nome: \"%s\"\n", nome);

        while (inicio <= fim && !encontrado) {
            int meio = inicio + (fim - inicio) / 2;
            int comparacao = nomes[meio].compareTo(nome);
            System.out.println("Passando pelo indice: " + meio);

            if (comparacao == 0) {
                encontrado = true;
                System.out.printf("Nome %s encontrado na posição %d\n", nome, meio);
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException(String.format("O nome %s não se encontra no array de nomes", nome));
        }
    }
}
