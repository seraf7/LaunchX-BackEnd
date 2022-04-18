package semana1.Viernes;

// Clase padre
public class Empleado {
    double salario = 40000;
}

// Herencia simple de la clase Empleado, un programador es un empleado
class Programador extends Empleado{
    int bono = 1000;

    // Redefinición del método main
    public void main(){
        Programador p = new Programador();

        System.out.println("El salario del programador es: " + p.salario);
        System.out.println("El bono del programador es: " + p.bono);
    }

    public void mensaje(){
        System.out.println("Soy programador!!");
        main();
    }
}

// Hereda de la clase Programador, se realiza una herencia multinivel porque
// toma información de Programador y por consecuencia de Empleado
class Web extends Programador{
    public static void main(String[] args) {
        // Crea nueva instancia de Web
        Web w = new Web();
        // Se invoca el método mensaje
        w.mensaje();
    }
}