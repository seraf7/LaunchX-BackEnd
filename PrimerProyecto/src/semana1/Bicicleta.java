package semana1;

public class Bicicleta {
    // Definición de los atributos
    // Uso de public para usarlos fuera del paquete
    public int pins, rodada;
    public double velocidad;
    public String color;

    // Constructores
    Bicicleta(){}

    Bicicleta(String color){
        this.color = color;
    }

    // Defición de getters, recuperan atributos
    public int getPins(){ return pins; }
    public int getRodada(){ return rodada; }
    public double getVelocidad(){ return velocidad; }
    public String getColor(){ return color; }

    // Definición de setters, asignación de atributos
    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        }
        else
            return false;
    }

    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        }
        else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }
        else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }
        else
            return false;
    }

    // Método para imprimir estado del objeto
    public String printEstado(){
        return "Pins: " + this.pins + "\n" +
                "Rodada: " + this.rodada + "\n" +
                "Velocidad: " + this.velocidad + "\n";
    }
}
