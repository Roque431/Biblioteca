import java.util.ArrayList;

public class Profesor {
    private int ID;
    private String nombre;
    private ArrayList<Materia> materias;

    public Profesor(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
        this.materias = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }
}
