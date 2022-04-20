package semana2.Hilos;

public class TestS extends Thread{
    public static void main(String[] args) {
        TestS s1 = new TestS();
        s1.start();

        HilosS s2 = new HilosS();
        Thread h1 = new Thread(s2);
        h1.start();
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            // Se pausa la ejecución 0.5s,
            // requiere de bloque para cachar excepciones
            try {
                Thread.sleep(500);
                System.out.println("Hilo 1: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class HilosS implements Runnable {

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hilo 2: " + i);
        }
    }
}
