package practicaMona;

public class Steroidtocat extends Mona{
    double peso;
    String categoria;

    Steroidtocat(int id, boolean ropa, boolean cabello, String nombre, double peso, String categoria) {
        super(id, ropa, cabello, nombre);
        this.peso = peso;
        this.categoria = categoria;
    }

    public void posar(){
        System.out.println("Flexionando musculos...");
    }

    public String getDetalles(){
        return super.getDetalles() + " Peso: " + peso
                + " Categoria: " + categoria;
    }
}
