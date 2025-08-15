import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numero){

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(numero)) {
                return i;
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> lista, int numero){
        if (buscarPosicaoNumero(lista, numero) == -1) {
            lista.add(numero);
        } else {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> lista, int numero){
        int index = buscarPosicaoNumero(lista, numero);
        if (index != -1) {
            lista.remove(index);
        } else {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto){
        int index = buscarPosicaoNumero(lista, numeroSubstituir);
        if (buscarPosicaoNumero(lista, numeroSubstituir) == -1) {
            lista.add(numeroSubstituto);
        } else {
            lista.set(index, numeroSubstituto);
        }
    }
}