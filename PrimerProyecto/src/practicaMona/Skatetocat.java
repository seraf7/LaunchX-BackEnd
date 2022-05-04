package practicaMona;

public class Skatetocat extends Mona{
    String truco;

    Skatetocat(int id, boolean ropa, boolean cabello, String nombre, String truco) {
        super(id, ropa, cabello, nombre);
        this.truco = truco;
    }

    public void patinar(){
        System.out.println("Estoy patinando...");
    }

    public String getDetalles(){
        return super.getDetalles() + " Truco: " + truco;
    }
}
