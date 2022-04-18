package semana1.Viernes;

// Clase padre
class Animal{
    // Caso 1: acceso a tributos de clase padre
    String color = "Blanco";

    // Caso 2: acceso a métodos de la clase padre
    void comer(){
        System.out.println("Comiendo...");
    }

    // Caso 3:
    Animal(){
        System.out.println("Se creó un animal");
    }
}

// Hereda de la clase Animal
class Gato extends Animal{
    // Se sobreescribe la variable de instancia
    String color = "Café";

    // Caso 1
    void printColor(){
        System.out.println("El color de la clase gato es: " + color);
        System.out.println("El color de la clase animal es: " + super.color);
    }

    // Caso 2
    void comer(){
        System.out.println("Comiendo atún...");
    }

    void dormir(){
        System.out.println("Ya se durmió el michi...");
    }

    void llamar(){
        super.comer();
        dormir();
    }

    // Caso 3
    Gato(){
        super();
        System.out.println("Se ha creado un gato");
    }
}

public class SuperTest {
    public static void main(String[] args) {
        // Caso 1
        // Se crea un objeto anónimo
        new Gato().printColor();

        // Caso 2
        new Gato().llamar();

        // Caso 3
        new Gato();
    }
}
