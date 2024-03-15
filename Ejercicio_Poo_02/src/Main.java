import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestionEmpleado gestionEmpleado = new GestionEmpleado();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("""
                    1.Agregar empleado
                    2.Eliminar empleado
                    3.Listar empleados
                    4.Salir
                    """);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    int opcion2=0;
                    System.out.println("""
                            Ingrese el tipo de empleado a agregar
                            1.Empleado Temporal
                            2 .Empleado Permanente
                            """);
                    opcion2 = scanner.nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("Ingrese el nombre del empleado");
                            String nombre = scanner.next();
                            System.out.println("Ingrese la edad del empleado");
                            int edad = scanner.nextInt();
                            System.out.println("Ingrese el id del empleado");
                            int id = scanner.nextInt();
                            System.out.println("Ingrese el sueldo del empleado");
                            double sueldo = scanner.nextDouble();

                            String tipoEmpleado = "Temporal";
                            EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(nombre, edad, id, sueldo, tipoEmpleado);
                            gestionEmpleado.agregarEmpleado(empleadoTemporal);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del empleado");
                            String nombre2 = scanner.next();
                            System.out.println("Ingrese la edad del empleado");
                            int edad2 = scanner.nextInt();
                            System.out.println("Ingrese el id del empleado");
                            int id2 = scanner.nextInt();
                            System.out.println("Ingrese el sueldo del empleado");
                            double sueldo2 = scanner.nextDouble();

                            String tipoEmpleado2 = "permanente";
                            System.out.println("Ingrese la antiguedad del empleado");
                            int antiguedad = scanner.nextInt();
                            EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente(nombre2, edad2, id2, sueldo2, tipoEmpleado2, antiguedad);
                            gestionEmpleado.agregarEmpleado(empleadoPermanente);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el id del empleado a eliminar");
                    int id = scanner.nextInt();
                    if (gestionEmpleado.eliminarEmpleado(id)){
                        System.out.println("Empleado eliminado");
                    }else{
                        System.out.println("Empleado no encontrado");
                    }
                    break;
                case 3:
                    gestionEmpleado.listarEmpleados();
                    System.out.println("Fin de la lista");
                    break;

            }
        }while (opcion != 4);
        System.out.println("Saliendo del programa");//prueba

    }
}