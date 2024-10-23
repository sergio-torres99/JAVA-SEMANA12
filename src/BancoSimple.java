import java.util.Scanner;

public class BancoSimple {

    public static void mostrarMenu() {
        System.out.println("");
        System.out.println("----- Menú -----");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Salir");
        System.out.println("----------------");
    }

    public static int seleccionarCuenta(String[] nombres) {
        for(int i = 0; i < nombres.length; i++){
            System.out.println(i + ". " + nombres[i]);
        }
        System.out.println("");
        
        boolean condicion = false;
        int opcionCuenta = -1;

            while (!condicion) {
                System.out.print("Ingrese el indice de la cuenta que desea utilizar: ");
                Scanner datos = new Scanner(System.in);
                opcionCuenta = datos.nextInt();

                if (opcionCuenta >= 0 && opcionCuenta < nombres.length) {
                    condicion = true;
                }else{
                    System.out.println("");
                    System.out.println("Ingrese una opcion valida... ");
                    System.out.println("");
                }
            }

            return opcionCuenta;
    }

    public static void depositar(int opcionCuenta, double[] saldos){
        System.out.println("");
        System.out.print("Cuanto desea depositar?: ");
        Scanner datos2 = new Scanner(System.in);
        float deposito = datos2.nextFloat();

        saldos[opcionCuenta] += deposito;
        System.out.println("");
        System.out.println("Deposito exitoso, su saldo actual es: " + saldos[opcionCuenta]);
    }

    public static void retirar(int opcionCuenta, double[] saldos){
        System.out.println("");
        System.out.print("Ingrese cantidad a retirar: ");
        Scanner datos3 = new Scanner(System.in);
        float retirar = datos3.nextFloat();

        if (retirar < saldos[opcionCuenta]) {
            saldos[opcionCuenta] -= retirar;
            System.out.println("");
            System.out.println("Retiro exitoso, su saldo actual es: " + saldos[opcionCuenta]);

            
        }else{
            System.out.println("");
            System.out.println("Su saldo es insuficiente, su saldo actual es: " + saldos[opcionCuenta]);
        }
    }

    public static void consultarSaldo(int opcionCuenta, double[] saldos){
        System.out.println("");
        System.out.println("Su saldo actual es: " + saldos[opcionCuenta]);
    }
    public static void main(String[] args) throws Exception {

        String[] nombres = {"Daniel", "Bryan", "Victor"};
        double[] saldos = {1500.00, 800.00, 2000.00};

        System.out.println("");
        System.out.println("Bienvenido al Banco simple...");
        System.out.println("");

        int opcionCuenta = seleccionarCuenta(nombres);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            System.out.println("");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: 
                    depositar(opcionCuenta, saldos);
                    break;
                case 2:
                    retirar(opcionCuenta, saldos);
                    break;
                case 3: 
                    consultarSaldo(opcionCuenta, saldos);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Gracias por usar el Banco Simple...");
                    continuar = false;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción inválida, intente de nuevo...");
            }
        }
    }
}
