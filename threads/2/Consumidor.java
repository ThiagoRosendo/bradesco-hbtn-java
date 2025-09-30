public class Consumidor extends Thread {
    private Fila fila;
    private int id;
    private volatile boolean running = true;

    public Consumidor(Fila fila, int id) {
        this.fila = fila;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (running) {

                int item = fila.retirar();
                System.out.println("Consumidor " + id + " consumiu: " + item);
                
                Thread.sleep(500);
                
                System.out.println("Consumidor " + id + " processou: " + item);
            }
        } catch (InterruptedException e) {
            System.out.println("Consumidor " + id + " foi interrompido");
        }
    }

    public void parar() {
        running = false;
        interrupt();
    }
}