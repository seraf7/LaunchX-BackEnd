package semana1.Viernes;

// Hereda de la clase persona, es una herencia simple
public class Emp extends Persona{
    double salario;

    // Constructor
    Emp(int id, String nombre, double salario){
        // Llama al constructor del padre
        super(id, nombre);
        this.salario = salario;
    }

    // Método para mostrar atributos
    void display(){
        System.out.println(id + " " + nombre + " " + salario);
    }
}
