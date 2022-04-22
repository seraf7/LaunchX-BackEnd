package ejemploLOL;

import imonsh.Colors;
import imonsh.Screen;

// Se hereda de la clase Champion y se implementa la
// interfaz AmumuActionCallbacks
public class Amumu extends Champion implements AmumuActionCallbacks{

    // Constructor con estructura de la clase padre
    Amumu(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    // Se implementan los métodos de la interfaz, cómo lo hace
    @Override
    public void cursedTouch(Screen s) {
        // Se limpia ventana y carga nueva información
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 25, Colors.ReptileGreen);
        s.showImage("D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\PrimerProyecto\\cursedTouch.gif");
        s.setBounds(100, 50, 1100, 900);
    }

    @Override
    public void bandageToss(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 25, Colors.ReptileGreen);
        s.showImage("D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\PrimerProyecto\\bandageToss.gif");
        s.setBounds(100, 50, 1100, 900);
    }

    @Override
    public void despair(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 25, Colors.ReptileGreen);
        s.showImage("D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\PrimerProyecto\\despair.gif");
        s.setBounds(100, 50, 1100, 900);
    }

    @Override
    public void tantrum(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 25, Colors.ReptileGreen);
        s.showImage("D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\PrimerProyecto\\tantrum.gif");
        s.setBounds(100, 50, 1100, 900);
    }

    @Override
    public void curseSadMummy(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 25, Colors.ReptileGreen);
        s.showImage("D:\\Documents\\Launch-X\\Mision-3\\LaunchX-BackEnd\\PrimerProyecto\\sadMummy.gif");
        s.setBounds(100, 50, 1100, 900);
    }
}
