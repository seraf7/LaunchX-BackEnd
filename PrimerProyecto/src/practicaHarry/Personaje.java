package practicaHarry;

public class Personaje {
    // Principales características
    String casa;
    char genero;
    String nombre;
    String boggart;
    String patronus;

    // Constructor sin parámetros
    Personaje(){}

    // Constructor parametrizado
    Personaje(String casa, char genero, String nombre, String boggart, String patronus){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    // Definición de getters
    public String getCasa(){ return casa; }

    public char getGenero(){ return genero; }

    public String getNombre(){ return nombre; }

    public String getBoggart(){ return boggart; }

    public String getPatronus(){ return patronus; }

    // Definición de setters
    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setGenero(char genero){
        if(genero == 'M' || genero == 'F'){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    // Método para mostrar detalles como cadena
    public String showInfo(){
        return nombre +
                " Genero: " + genero +
                " Casa: " + casa +
                " Boggart: " + boggart +
                " Patronus: " + patronus;
    }
}
