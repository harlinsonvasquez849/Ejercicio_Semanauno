public class Empleado {
    private String nombre;
    private String posicion;
    private double salario;
    private int id;

    //constructor
    public Empleado(String nombre, String posicion, double salario, int id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }


//metodos
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPosicion() {
        return this.posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //metodo para aumentar el salario
    public void aumentarSalario(double porcentaje){
        this.salario+=this.salario*porcentaje/100;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }
}
