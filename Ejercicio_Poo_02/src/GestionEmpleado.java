import java.util.ArrayList;

public class GestionEmpleado {
    private ArrayList<Empleado> listaEmpleados;

    public GestionEmpleado(){
        this.listaEmpleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        this.listaEmpleados.add(empleado);
    }
    public boolean eliminarEmpleado(int id){
        return  this.listaEmpleados.removeIf(empleado -> empleado.getIdEmpleado() == id);
    }
    public void listarEmpleados(){
        for (Empleado iterador : this.listaEmpleados){
            System.out.println(iterador.toString());
        }
    }
}
