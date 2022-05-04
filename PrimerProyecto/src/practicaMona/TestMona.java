package practicaMona;

public class TestMona {
    public static void main(String[] args) {
        // Creación de objetos
        Mona yogi = new Yogitocat(152, false, false, "yogitocat", "azul");
        Mona hula = new Hulatocat(137, true, false, "hulatocat", "Aloha");
        Mona dino = new Dinotocat(128, false, true, "dinotocat", "Verde");
        Mona skate = new Skatetocat(124, false, true, "skatetocat", "Kickflip");
        Mona steroid = new Steroidtocat(106, true, false, "steroidtocat", 123.2, "Junior");
        Mona bot = new Robotocat(92, false, false, "robotocat", "3.5", "Acero");

        // Impresión de detalles
        System.out.println(yogi.getDetalles());
        System.out.println(hula.getDetalles());
        System.out.println(dino.getDetalles());
        System.out.println(skate.getDetalles());
        System.out.println(steroid.getDetalles());
        System.out.println(bot.getDetalles());
    }
}
