package practicaMona;

public class Dinotocat extends Mona{
    String color;

    Dinotocat(int id, boolean ropa, boolean cabello, String nombre, String color) {
        super(id, ropa, cabello, nombre);
        this.color = color;
    }

    public void comer(){
        System.out.println("Estoy comiendo...");
    }

    public String getDetalles(){
        return super.getDetalles() + " Color: " + color;
    }
}
