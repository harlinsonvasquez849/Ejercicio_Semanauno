import java.util.Scanner;
import java.util.InputMismatchException;

public class MainProductos{
    private static ProductoStock[] productos;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int  opcion = 0;
       do{
           System.out.println("1. Añadir producto");
           System.out.println("2. Mostrar productos");
           System.out.println("3. eliminar producto");
           System.out.println("4. agregar stock de un producto");
           System.out.println("5. eliminar stock de un producto");
           System.out.println("6. Salir");
           System.out.println("Ingrese una opción");
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion){
                    case 1:
                        System.out.print("cuantos productos desea ingresar: ");
                        int numProducts = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character

                        productos = new ProductoStock[numProducts];

                        for (int i = 0; i < numProducts; i++) {
                            System.out.println("ingresa los detalles del producto  " + (i + 1) + ":");
                            int id;
                            while (true) {
                                try {
                                    System.out.print("ID: ");
                                    id = scanner.nextInt();
                                    break; // Salir del bucle si la entrada es válida
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Ingrese un número válido.");
                                    scanner.nextLine(); // Limpiar el buffer
                                }
                            } // Consume the newline character
                            scanner.nextLine(); // Consume the newline character

                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();

                            System.out.print("Descripcion: ");
                            String descripcion = scanner.nextLine();

                            System.out.print("Precio: ");
                            double precio = scanner.nextDouble();
                            scanner.nextLine(); // Consume the newline character

                            System.out.print("Stock: ");
                            int stock = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character

                            productos[i] = new ProductoStock(id, nombre, descripcion, precio, stock);
                        }
                        break;
                    case 2:
                        // Verificar si el array es null antes de intentar acceder a su longitud
                        if (productos != null) {
                            // Resto del código que utiliza el array productos
                            System.out.println("lista de productos:");
                            for (ProductoStock producto : productos) {
                                System.out.println(producto);
                            }
                        } else {
                            System.out.println("no hay productos para mostrar.");
                        }

                        break;
                    case 3:
                        System.out.println("Ingrese el nombre del producto a eliminar");
                        String nombre = scanner.nextLine();
                        boolean productoEncontrado = false;

                        try {
                            if (productos != null && productos.length > 0) {
                                for (int i = 0; i < productos.length; i++) {
                                    if (productos[i] != null && productos[i].getNombre().equals(nombre)) {
                                        productos[i] = null; // Set the product at index i to null
                                        System.out.println("Producto eliminado.");
                                        productoEncontrado = true;
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("El array de productos está vacío.");
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Error: El array de productos es nulo.");
                            break; // Salir del switch statement en caso de excepción
                        }

                        if (!productoEncontrado) {
                            System.out.println("Producto no encontrado en bodega.");
                        }
                        break;

                    case 4:
                        System.out.println("Ingrese el nombre del producto para agregar stock");
                        nombre = scanner.nextLine();
                        productoEncontrado = false;

                        try {
                            for (int i = 0; i < productos.length; i++) {
                                if (productos[i] != null && productos[i].getNombre().equals(nombre)) {
                                    System.out.println("Ingrese la cantidad de stock a agregar");
                                    int stock = scanner.nextInt();
                                    scanner.nextLine(); // Consumir el carácter de nueva línea después de nextInt()
                                    productos[i].añadirStock(stock);
                                    productoEncontrado = true;
                                    System.out.println("Stock agregado exitosamente.");
                                    break;
                                }
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Error: El array de productos es nulo.");
                            break; // Salir del switch statement en caso de excepción
                        }

                        if (!productoEncontrado) {
                            System.out.println("Producto no encontrado en el bodega.");
                        }
                        break;

                    case 5:
                        System.out.println("Ingrese el nombre del producto para eliminar stock");
                        nombre = scanner.nextLine();
                        productoEncontrado = false;

                        try {
                            if (productos != null && productos.length > 0) {
                                for (int i = 0; i < productos.length; i++) {
                                    if (productos[i] != null && productos[i].getNombre().equals(nombre)) {
                                        System.out.println("Ingrese la cantidad de stock a eliminar");
                                        int stock = scanner.nextInt();
                                        scanner.nextLine(); // Consumir el carácter de nueva línea después de nextInt()
                                        productos[i].retirarStock(stock);
                                        productoEncontrado = true;
                                        System.out.println("Stock eliminado exitosamente.");
                                        break;
                                    }
                                }

                                if (!productoEncontrado) {
                                    System.out.println("Producto no encontrado en bodega.");
                                }
                            } else {
                                System.out.println("El array de productos está vacío.");
                            }
                        } catch (NullPointerException e) {
                            System.out.println("Error: El array de productos es nulo.");
                            break; // Salir del switch statement en caso de excepción
                        }

                        break;

                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;

                }

       }

         while(opcion!=6);

    }
}