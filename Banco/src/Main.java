public class Main {
    public static void main(String[] args) {
        // Crear dos cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", "Pérez", 123456789, "Ahorros");
        CuentaBancaria cuenta2 = new CuentaBancaria("María", "Gómez", 987654321, "Corriente");

        // Establecer interés mensual para cuenta1
        cuenta1.ingresarInteres(15); // 15% mensual
        cuenta1.consignarSaldo(1000); // Consignar 1000 en cuenta1
        System.out.println(cuenta1.consultarSaldo());
        cuenta1.aplicarInteres(); // Aplicar interés
        System.out.println(cuenta1.consultarSaldo());

        // Imprimir detalles de la cuenta1
        cuenta1.imprimirDatos();


        // Realizar un retiro en cuenta1
        cuenta1.retirarSaldo(500); // Retirar 500
        System.out.println(cuenta1.consultarSaldo());

        // Imprimir detalles de la cuenta2
        cuenta2.imprimirDatos();

        // Transferir dinero de cuenta1 a cuenta2
        cuenta1.transferirDinero(cuenta2, 200); // Transferir 200 a cuenta2
        System.out.println(cuenta1.consultarSaldo());
        System.out.println(cuenta2.consultarSaldo());

        // Comparamos cuentas
        System.out.println(cuenta1.CompararCuenta(cuenta2));

    }
}