public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;

    Empleado(String nombre, int edad, int idEmpleado, double sueldo){
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }
    //Getters y Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }

}
