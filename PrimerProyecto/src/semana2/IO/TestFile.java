package semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestFile {
    public static void main(String[] args) {
        // Define la ruta de escritura del archivo
        String ruta = "D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\magia.txt";

        try{
            // Se crea un nuevo flujo al archivo
            FileOutputStream fos = new FileOutputStream(ruta);

            // Define cadena y se obtiene su contenido como arreglo de bytes
            String s = "Magia!!!";
            byte b[] = s.getBytes();

            // Se ecribe el archivo
            fos.write(b);

            // Se cierra el flujo
            fos.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
