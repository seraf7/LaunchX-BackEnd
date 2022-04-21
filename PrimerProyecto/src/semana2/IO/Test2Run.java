package semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run {
    public static void main(String[] args) {
        // Define la ruta de escritura del archivo
        String ruta = "D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\magiaRN.txt";

        // Se crea una nueva instancia de Runnable
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                try{
                    // Se crea un nuevo flujo al archivo
                    FileOutputStream fos = new FileOutputStream(ruta);

                    // Define cadena y se obtiene su contenido como arreglo de bytes
                    String s = "Magia con Runnable!!!";
                    byte b[] = s.getBytes();

                    // Se ecribe el archivo
                    fos.write(b);

                    // Se cierra el flujo
                    fos.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };

        // Se crea nuevo hilo con comportambiento de Runnable
        Thread m = new Thread(rn);
        m.start();

        System.out.println("Magia de hilos!!");
    }
}
