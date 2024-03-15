import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria [] cuentas = new CuentaBancaria[3];
        cuentas[0] = new CuentaBancaria("Juan", 0);
        cuentas[1] = new CuentaBancaria("Pedro", 0);
        cuentas[2] = new CuentaBancaria("Maria", 0);

        Scanner obj = new Scanner(System.in);
         int opcion = 0;
         double cantidad = 0;
         int CuentaSeleccionada = 0;

         System.out.println("Seleccione la cuenta sobre la que deseas realizar la operación");
         for (int i=0; i<cuentas.length; i++){
             System.out.println((i+1)+". "+cuentas[i].getTitular());
         }
            CuentaSeleccionada = obj.nextInt();
            obj.nextLine();

         if(CuentaSeleccionada<1 || CuentaSeleccionada> cuentas.length){
             System.out.println("Opción no válida");
             return;
         }
         CuentaBancaria CuentaActual = cuentas[CuentaSeleccionada-1];
         do {
             System.out.println("\n Banco");
             System.out.println("1. Añadir fondos");
             System.out.println("2. retirar fondos");
             System.out.println("3. saliendo de la operación");
             opcion=obj.nextInt();
             obj.nextLine();
             switch (opcion) {
                 case 1:

                     System.out.println("Ingrese la cantidad a añadir");
                     cantidad=obj.nextDouble();
                     CuentaActual.ingresarDinero(cantidad);
                     System.out.println("Fondos añadidos" );
                     break;
                 case 2:
                     System.out.println("Ingrese la cantidad a retirar");
                     cantidad=obj.nextDouble();
                     if (cantidad > CuentaActual.getSaldo()) {
                         System.out.println("Fondos insuficientes");
                         break;
                     }else {
                         CuentaActual.retirarDinero(cantidad);
                         System.out.println("Fondos retirados");
                         break;
                     }

                 case 3:
                     System.out.println("Cancelando operación");
                     break;

             }
         }while (opcion != 3);

        System.out.println("Saldo actual de la cuenta DE : " + CuentaActual.getTitular() + " ES " +  CuentaActual.getSaldo());
    }
}
