import java.util.Scanner;

public class BancoSimple {

    public static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Salir");
        System.out.println("----------------");
    }

    public static void seleccionarcuenta(String[] nombres) {
        for(int i = 0; i < nombres.length; i++){
            System.out.println(i + ". " + nombres[i]);
        }

        boolean condition = false;

            while (!condition) {
                System.out.println("Ingrese el indice de la cuenta que desea utilizar: ");
                Scanner datos = new Scanner(System.in);
                int opcionCuenta = datos.nextInt();

                if (opcionCuenta >= 0 && opcionCuenta < nombres.length - 1) {
                    condition = true;
                }else{
                    System.out.println("Ingrese una opcion valida: ");
                    opcionCuenta = datos.nextInt();
                }
            }
    }

    public static void Depositar( int opcionCuenta, double saldos){

        System.out.println("Cuanto desea depositar? ");
        Scanner datos2 = new Scanner(System.in);
        float deposito = datos2.nextFloat();

    }
    public static void main(String[] args) throws Exception {

        String[] nombres = {"Daniel", "Bryan", "Victor"};
        double[] saldos = {1500.00, 800.00, 2000.00};

        System.out.println(nombres.length + saldos.length);

        mostrarMenu();
        seleccionarcuenta(nombres);
    }
}
