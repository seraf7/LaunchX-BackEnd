package semana2;

// En una clase abstracta se puede definir de manera opcional la implementación
// de lo métodos que posee (¿Cómo lo hace?)
abstract class Hola {
    void saludar(){
        System.out.println("Hola!! K hace?");
    }

    abstract void saludo();
}

// Las interfaces sólo definen ¿qué hace?, se da por hecho que los métodos
// son abstractos
interface Mostrar {
    void show();

    abstract void despide();
}

public class SaludosCordiales implements Mostrar {
    public static void main(String[] args) {
        // Se crean instancias de SaludosCordiales
        SaludosCordiales s1 = new SaludosCordiales();
        s1.show();
    }

    // Se implementan los método definidos en la intefaz
    public void show(){
        System.out.println("Hola ¿cómo estas?, espero no del todo mal...");
    }

    public void despide(){
        System.out.println("Adiosito");
    }
}
