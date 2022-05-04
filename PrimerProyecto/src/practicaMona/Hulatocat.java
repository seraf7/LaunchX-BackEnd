package practicaMona;

public class Hulatocat extends Mona{

    String cancion;

    Hulatocat(int id, boolean ropa, boolean cabello, String nombre, String cancion) {
        super(id, ropa, cabello, nombre);
        this.cancion = cancion;
    }

    public void bailar(){
        System.out.println("Estoy bailando al ritmo de..." + cancion);
    }

    public String getDetalles(){
        return super.getDetalles() + " Canción: " + cancion;
    }
}
