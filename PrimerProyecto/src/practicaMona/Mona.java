package practicaMona;

public class Mona {
    int id;
    boolean ropa;
    boolean cabello;
    String nombre;

    Mona(int id, boolean ropa, boolean cabello, String nombre){
        this.id = id;
        this.ropa = ropa;
        this.cabello = cabello;
        this.nombre = nombre;
    }

    public String getDetalles(){
        return "ID: " + id + " Nombre: " + nombre
                + " Ropa: " + ropa + " Cabello: " + cabello;
    }
}
