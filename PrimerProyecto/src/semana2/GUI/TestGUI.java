package semana2.GUI;

import imonsh.Colors;
import imonsh.Dialog;
import imonsh.Screen;

public class TestGUI {
    public static void main(String[] args) {
        // Se crea una nueva ventana
        Screen sc = new Screen();
        // Crea cuadro de dialogo
        Dialog dg = new Dialog();

        String str;
        String ruta = "D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\PrimerProyecto\\src\\semana2\\GUI\\";

        // Imprime mensaje en la ventana
        sc.out("Estamos usando el Framework de la MC Fer!!! °U°\n",
                "Helvetica", 28, Colors.Grisaille);
        sc.setVisible(true);

        // Lee cadena de un cuadro de dialogo
        str = dg.readString("¿Quieres que te enseñe? S/N");

        if(str.charAt(0) == 'S' || str.charAt(0) == 's'){
            // Despliega imagen en la ventana
            sc.showImage(ruta + "logoZim.png");
            sc.out("\nVamos a aprender!!!");
        }else{
            sc.out("Bueno...ya será despues",
                    "Century Schoolbook L", 20,
                    Colors.GloomyPurple);
        }
    }
}
