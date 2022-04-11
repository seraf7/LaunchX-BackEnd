package semana1;

public class PruebaBicicleta {
    public static void main(String[] args) {
        // Se ejecuta método de prueba
        definicion();
    }

    public static void definicion(){
        // Se crea una nueva instancia
        Bicicleta biciMountain = new Bicicleta();
        Bicicleta biciCarreras = new Bicicleta("blanco");

        // Se asignan atributos
        biciMountain.setColor("Azul");
        biciMountain.setRodada(15);
        biciMountain.setPins(6);
        biciMountain.setVelocidad(21.7);

        // Mensaje con datos
        String msj = "Soy una bici de montaña con estas características:";
        msj += "\nColor: " + biciMountain.getColor();
        msj += "\nRodada: " + biciMountain.getRodada();
        msj += "\nPins: " + biciMountain.getPins();
        msj += "\nVelocidad: " + biciMountain.getVelocidad();

        // Se imprime mensaje
        System.out.print(msj);
    }

}
