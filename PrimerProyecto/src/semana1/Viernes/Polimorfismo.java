package semana1.Viernes;

class Animal2 {
    void comer(){
        System.out.println("Comiendo...");
    }
}

// Se hereda de la clase Animal, em archivo SuperTest
class Perro extends Animal {
    // Redefine el método comer del padre
    void comer(){
        System.out.println("Comiento croquetas...");
    }
}

// Se hereda de la clase Animal, em archivo SuperTest
class Cachorro extends Animal {
    void comer(){
        System.out.println("Tomando agua...");
    }
}

// Mediante el polimorfismo, se puede cambiar el comportamiento del objeto al
// implementar comportamientos distintos instanciando un tipo diferente de
// objeto al de la variable
public class Polimorfismo {
    public static void main(String[] args) {
        // Se crea nueva instancia de Animal
        Animal pooh = new Animal();
        pooh.comer();

        // Usando el mismo tipo de objeto, se crea instancia de Perro
        pooh = new Perro();
        pooh.comer();

        // Ahora se crea una nueva instancia de Cachorro
        pooh = new Cachorro();
        pooh.comer();
    }
}
