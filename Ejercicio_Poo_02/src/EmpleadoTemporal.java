public class EmpleadoTemporal extends Empleado{
    private String tipoEmpleado;
    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double sueldo, String tipoEmpleado){
        super(nombre, edad, idEmpleado, sueldo);
        this.tipoEmpleado = tipoEmpleado;
    }
    //Getters y Setters

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
       public String toString() {
            return super.toString() +
                    "tipoEmpleado='" + tipoEmpleado + '\'' +
                    '}';
        }

}
