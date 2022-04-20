package semana2;

// Definición de un clase abstracta, no puede ser implementada sólo heredada
abstract class Sombra {
    // Método abtracto, solo se define el nombre;
    // la implementación se define después
    abstract void dibujarSombra();
}

class Arma extends Sombra {
    // Se realiza la implementación del método abstracto de Sombra
    @Override
    void dibujarSombra(){
        System.out.println("Dibujando sombra en el arma color verde...");
    }
}

class Personaje extends Arma {
    @Override
    void dibujarSombra(){
        System.out.println("Dibujando sombra blanca del personaje...");
    }
}

public class Abstraccion {
    public static void main(String[] args) {
        // Nueva instancia de Sombra con un tipo Arma
        Sombra espada = new Arma();
        Sombra megaman = new Personaje();

        // Se invocan los métodos
        espada.dibujarSombra();
        megaman.dibujarSombra();
    }
}
