package semana2.Hilos;

class HilosR implements Runnable {
    public static void main(String[] args) {
        // Se crea nueva instancia de HilosR
        HilosR h1 = new HilosR();

        // Se crea un nuevo hilo, usando referencia del comportamiento
        // definido con Runnable
        Thread t1 = new Thread(h1);
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("El hilo de Runnable está corriendo");
    }
}
