public class EmpleadoPermanente extends Empleado{
    private String tipoEmpleado;
    private  int antiguedad;
    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double sueldo, String tipoEmpleado, int antiguedad){
        super(nombre, edad, idEmpleado, sueldo);
        this.tipoEmpleado = tipoEmpleado;
        this.antiguedad = antiguedad;
    }
    //Getters y Setters

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
   public String toString() {
            return super.toString() +
                    "tipoEmpleado='" + tipoEmpleado + '\'' +
                    ", antiguedad=" + antiguedad +
                    '}';
        }
}
