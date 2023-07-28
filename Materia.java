public class Materia {
    private int cod_mat;
    private String nombre;

    public Materia(int cod_mat, String nombre) {
        this.cod_mat = cod_mat;
        this.nombre = nombre;
    }

    public void imprimirMat() {
        System.out.println(cod_mat + "-" + nombre);
    }

    public int getCod_mat() {
        return cod_mat;
    }

    public void setCod_mat(int cod_mat) {
        this.cod_mat = cod_mat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
