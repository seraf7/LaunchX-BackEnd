package semana2.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException{
        // Define la ruta de escritura del archivo
        String ruta = "D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\magia.txt";

        // Creación de flujo y buffer de entrada
        FileInputStream fis = new FileInputStream(ruta);
        BufferedInputStream bin = new BufferedInputStream(fis);

        int i = 0;
        // Ciclo de lectura del buffer
        while ((i = bin.read()) != -1){
            System.out.print((char) i);
        }

        // Cierre de recursos
        bin.close();
        fis.close();

    }
}
