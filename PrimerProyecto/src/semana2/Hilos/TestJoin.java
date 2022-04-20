package semana2.Hilos;

public class TestJoin extends Thread{
    public static void main(String[] args) {
        // Se crean instancias de prueba
        TestJoin t1 = new TestJoin(),
                t2 = new TestJoin(),
                t3 = new TestJoin();

        // Se muestran los detales de cada hilo
        detalles(t1, t2, t3);

        // Inicia primer hilo
        t1.start();

        // Se modifican atributos del hilo
        try {
            // se indica que el hilo se ejecutará cada 1.5s
            t1.join(1500);
            t1.setName("SuperHilo");
            t1.setPriority(MAX_PRIORITY);
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }

        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + ": " + i);
        }
    }

    public static void detalles(TestJoin t1, TestJoin t2, TestJoin t3){
        System.out.println("ID: " + t1.getId() +
                " Nombre: " + t1.getName() +
                " Prioridad: " + t1.getPriority() +
                " Estado: " + t1.getState());

        System.out.println("ID: " + t2.getId() +
                " Nombre: " + t2.getName() +
                " Prioridad: " + t2.getPriority() +
                " Estado: " + t2.getState());

        System.out.println("ID: " + t3.getId() +
                " Nombre: " + t3.getName() +
                " Prioridad: " + t3.getPriority() +
                " Estado: " + t3.getState());
    }
}
