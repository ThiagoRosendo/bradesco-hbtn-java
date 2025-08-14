public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    
    public String getNomePorId(int id) throws IndexOutOfBoundsException {
        return nomes[id];
    }

    public void pesquisaTempoConstante(int id) throws Exception{
        try {
            System.out.printf("Nome pesquisado é %s que está na posição %d\n", getNomePorId(id), id);
        } catch (IndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(String.format("O array de nomes possui :%d nomes", getNomes().length));
        }

    }
}