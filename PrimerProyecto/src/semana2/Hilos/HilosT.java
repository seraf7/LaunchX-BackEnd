package semana2.Hilos;

public class HilosT extends Thread{
    public static void main(String[] args) {
        // Inicia el ciclo de vida del hilo, se crea
        HilosT h1 = new HilosT();

        // Etapa de inicialización del hilo, posteriormente se ejecuta
        h1.start();
    }

    // Se sobreescribe el método run, qué hace durante ejecución
    @Override
    public void run(){
        System.out.println("El hilo se está ejecutando");
    }

    /*@Override
    public void start(){
        // Inicia la ejecución del hilo
        // Provoca que la JVM llame al método run()
    }*/

    // sleep, detiene temporalmente la ejecución del hilo

    // join, espera que el hilo se muera

    // getPriority, devuelve prioridad del hilo
    // setPriority, establece la prioridad del hilo

    // getName, devuelve nombre del hilo

    // currentThread, referencia al hilo en ejecución

    // getState, indica el estado del hilo

    // isAlive, indica si el hilo está vivo
}
