package practicaMona;

public class Yogitocat extends Mona{

    String aura;

    Yogitocat(int id, boolean ropa, boolean cabello, String nombre, String aura) {
        super(id, ropa, cabello, nombre);
        this.aura = aura;
    }

    public void meditar(){
        System.out.println("Estoy meditando...");
    }

    public String getDetalles(){
        return super.getDetalles() + " Aura: " + aura;
    }
}
