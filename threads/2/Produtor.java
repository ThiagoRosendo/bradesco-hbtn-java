import java.util.Random;

public class Produtor extends Thread {
    private Fila fila;
    private int id;
    private Random random = new Random();
    private volatile boolean running = true;

    public Produtor(Fila fila, int id) {
        this.fila = fila;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (running) {
                int numero = random.nextInt(100) + 1;

                fila.adicionar(numero);
                System.out.println("Produtor " + id + " produziu: " + numero);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Produtor " + id + " foi interrompido");
        }
    }

    public void parar() {
        running = false;
        interrupt();
    }
}