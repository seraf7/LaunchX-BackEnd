package ejemploLOL;

import imonsh.Colors;
import imonsh.Screen;

public class Game {
    public static void main(String[] args) throws InterruptedException{
        TestAmumu();
    }

    public static void TestAmumu(){
        Screen s = new Screen();
        s.setVisible(true);

        // Crea nueva instancia de Amumu
        Amumu amumu = new Amumu(01, "Amumu", "Tank", "Low",
                "Legend claims that Amumu is a lonely and melancholy soul from ancient Shurima, roaming the world in search of a friend.");

        // Instancia de objeto Runnable
        Runnable attack = new Runnable() {
            @Override
            public void run() {
                try{
                    // Se invocan los ataques cada 3s
                    amumu.cursedTouch(s);
                    Thread.sleep(3000);
                    amumu.bandageToss(s);
                    Thread.sleep(3000);
                    amumu.despair(s);
                    Thread.sleep(3000);
                    amumu.tantrum(s);
                    Thread.sleep(3000);
                    amumu.curseSadMummy(s);
                }
                catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        // Se crea un nuevo hilo con definición de ataques
        Thread amumuAtack = new Thread(attack);
        amumuAtack.start();

    }
}
