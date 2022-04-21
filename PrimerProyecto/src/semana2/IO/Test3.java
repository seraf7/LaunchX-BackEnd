package semana2.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        // Define la ruta de escritura del archivo
        String ruta = "D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\magia.txt";

        try {
            // Se crea un nuevo flujo de entrada
            FileInputStream fis = new FileInputStream(ruta);

            int i = 0;
            // Ciclo de lectura del archivo
            while ((i = fis.read()) != -1){
                // Impresión del caracter leído
                System.out.print((char) i);
            }

            // Cierra el flujo
            fis.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
