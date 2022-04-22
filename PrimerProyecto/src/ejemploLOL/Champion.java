package ejemploLOL;
// Se define a la clase Campeon, base de todos los personajes
public class Champion {
    // Atributos encapsulados
    private int id;
    private String name;
    private String role;
    private String difficulty;
    private String description;

    // Constructor parametrizado
    Champion(int id, String name, String role, String difficulty, String description){
        this.id = id;
        this.name = name;
        this.role = role;
        this.difficulty = difficulty;
        this.description = description;
    }

    // Definición de getters
    public int getId() {  return id;  }

    public String getName() {  return name;  }

    public String getRole() {  return role;  }

    public String getDifficulty() {  return difficulty;  }

    public String getDescription() {  return description;  }

    // Definición de setters
    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        } else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setRole(String role){
        if(!role.isEmpty()){
            this.role = role;
            return true;
        } else
            return false;
    }

    public boolean setDifficulty(String difficulty){
        if(!difficulty.isEmpty()){
            this.difficulty = difficulty;
            return true;
        } else
            return false;
    }

    public boolean setDescription(String description){
        if(!description.isEmpty()){
            this.description = description;
            return true;
        } else
            return false;
    }

    // Método para visualizar objeto como cadena
    public String showMessage(){
        return "ID: " + id +
                " Name: " + name +
                " Role: " + role +
                " Difficulty: " + difficulty +
                "\nDescription: " + description + "\n";
    }
}
