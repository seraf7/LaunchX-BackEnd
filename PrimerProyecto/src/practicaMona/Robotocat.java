package practicaMona;

public class Robotocat extends Mona{
    String version;
    String material;

    Robotocat(int id, boolean ropa, boolean cabello, String nombre, String version, String material) {
        super(id, ropa, cabello, nombre);
        this.version = version;
        this.material = material;
    }

    public void actualizar(){
        System.out.println("Me estoy actualizando, espera un momento...");
    }

    public String getDetalles(){
        return super.getDetalles() + " Versión: " + version
                + " Material: " + material;
    }
}
