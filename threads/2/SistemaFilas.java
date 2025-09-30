public class SistemaFilas {
    public static void main(String[] args) {

        Fila fila = new Fila(10);

        Produtor produtor1 = new Produtor(fila, 1);
        Produtor produtor2 = new Produtor(fila, 2);

        Consumidor consumidor1 = new Consumidor(fila, 1);
        Consumidor consumidor2 = new Consumidor(fila, 2);

        produtor1.start();
        produtor2.start();
        consumidor1.start();
        consumidor2.start();

        try {
            Thread.sleep(20000);
            
            produtor1.parar();
            produtor2.parar();
            consumidor1.parar();
            consumidor2.parar();
            
            produtor1.join();
            produtor2.join();
            consumidor1.join();
            consumidor2.join();
            
        } catch (InterruptedException e) {
            System.out.println("Thread principal foi interrompida");
        }

        System.out.println("Sistema de filas encerrado");
        System.exit(0);
    }
}