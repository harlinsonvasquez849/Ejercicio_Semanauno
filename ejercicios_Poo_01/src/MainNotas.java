import java.util.Scanner;

public class MainNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de Calificaciones de Estudiantes");
        System.out.println("ingrese la cantidad de estudiantes a evaluar");
        int cantidadEstudiantes = sc.nextInt();
        sc.nextLine();
        SistemaNotas[] estudiantes = new SistemaNotas[cantidadEstudiantes];
for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("ingrese el nombre del estudiante " + (i + 1));
            String nombre = sc.nextLine();
            System.out.println("ingrese la cantidad de calificaciones a evaluar");
            int cantidadCalificaciones = sc.nextInt();
            sc.nextLine();
            double[] calificaciones = new double[cantidadCalificaciones];
            for (int j = 0; j < cantidadCalificaciones; j++) {
                System.out.println("ingrese la calificacion " + (j + 1));
                calificaciones[j] = sc.nextDouble();
                sc.nextLine();
            }
            estudiantes[i] = new SistemaNotas(nombre, calificaciones);
        }
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("El promedio de " + estudiantes[i].getNombre() + " es: " + estudiantes[i].calcularPromedio());
        }

    }
}
