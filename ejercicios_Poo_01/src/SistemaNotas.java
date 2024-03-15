public class SistemaNotas {
    //Sistema de Calificaciones de Estudiantes: Diseña una clase Estudiante con
    //atributos para el nombre, una lista de calificaciones y un método para
    //
    //calcular el promedio de dichas calificaciones. Añade un método para añadir
    //nuevas calificaciones a la lista
    private String nombre;
    private double[] calificaciones;


    //constructor
    public SistemaNotas(String nombre, double[] calificaciones){
        this.nombre=nombre;
        this.calificaciones=calificaciones;
    }
    //metodos
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double[] getCalificaciones() {
        return this.calificaciones;
    }
    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    public double calcularPromedio(){
        double suma=0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma+=calificaciones[i];
        }
        return suma/calificaciones.length;
    }



}
