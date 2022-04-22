package practicaHarry;

public class TestPersonaje {
    public static void main(String[] args) {
        // Creación de objetos inicializados
        Personaje harry = new Personaje("Gryffindor", 'M', "Harry James Potter",
                "Dementor", "Stag");
        Personaje malfoy = new Personaje("Slytherin", 'M', "Draco Lucius Malfoy",
                "Lord Voldemort", "Ninguno");
        Personaje ginny = new Personaje("Gryffindor",'F', "Ginevra Molly Potter",
                "Lord Voldemort", "Horse");
        Personaje hermione = new Personaje("Gryffindor", 'F', "Hermione Jean Granger",
                "Failure", "Otter");

        // Creación de objeto vacio y posterior inicialzación
        Personaje luna = new Personaje();

        luna.setGenero('F');
        luna.setNombre("Luna Scamander");
        luna.setPatronus("Hare");
        luna.setCasa("Ravenclaw");
        luna.setBoggart("Ninguno");

        // Impresión de detalles
        System.out.println(harry.showInfo());
        System.out.println(malfoy.showInfo());
        System.out.println(ginny.showInfo());
        System.out.println(hermione.showInfo());
        System.out.println(luna.showInfo());
    }
}
