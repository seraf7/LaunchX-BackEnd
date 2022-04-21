package semana2.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        // Define la ruta de escritura del archivo
        String ruta = "D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\magic.txt";

        try {
            // Se crea un nuevo flujo de salida
            FileOutputStream fos = new FileOutputStream(ruta);
            // Se crea un buffer de salida, almacena datos
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            // Mensaje a escribir
            String m = "Estamos jugando... \n Con los archivos ;)";
            byte b[] = m.getBytes();

            // Se escribe mensaje en el buffer y se limpia
            bout.write(b);
            bout.flush();

            // Cierra flujo y buffer
            bout.close();
            fos.close();

            System.out.println("Listo!!!");
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
