public class CuentaBancaria {
    private String nombreTitular;
    private String apellidoTitular;
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    private double porcInteresMensual;
    private boolean cuentaActiva;

    public CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuenta, String tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0; // Se inicializa en 0
        this.porcInteresMensual = 0; // Se inicializa en 0
        this.cuentaActiva = false;
    }


    // PARTE A
    public void imprimirDatos(){
        System.out.println("Nombre del titular: " + nombreTitular + "\nApellido del titular: "+ apellidoTitular + "\nNumero de cuenta: "
                + numeroCuenta + "\nTipo de cuenta: " + tipoCuenta);
    }
    public double consultarSaldo() {
        return saldo;
    }
    public void consignarSaldo(double saldo) {
        this.saldo += saldo;
        if (saldo > 0){
            cuentaActiva = true;
        }
        System.out.println("Consignacion exitosa");
    }
    public void retirarSaldo(double saldoRetirado) {
        if (saldoRetirado > saldo) {
            System.out.println("No hay dinero suficiente en la cuenta");
        } else {
            this.saldo -= saldoRetirado;
            if (saldo == 0) {
                cuentaActiva = false;
                System.out.println("La cuenta quedo inactiva");
            } else {
                System.out.println("Saldo retirado exitosamente");
            }
        }
    }

    // PARTE B
    public void ingresarInteres(double interes){
        this.porcInteresMensual += interes;
    }

    public void aplicarInteres(){
        if (cuentaActiva){
            double interesMensual = saldo * (porcInteresMensual / 100);
            this.saldo += interesMensual;
            System.out.println("Se aplico correctamente el interes");
        } else {
            System.out.println("No se puede aplicar interés porque la cuenta esta inactiva");
        }
    }

    public boolean CompararCuenta(CuentaBancaria otraCuenta){
        if (saldo >= otraCuenta.saldo){
            return true;
        } else {
            return false;
        }
    }

    public void transferirDinero(CuentaBancaria cuentaDestino, double valorTransferido){
        if (saldo >= cuentaDestino.saldo){
            this.retirarSaldo(valorTransferido);
            cuentaDestino.consignarSaldo(valorTransferido);
            System.out.println("Transferencia exitosa");
        } else{
            System.out.println("Transferencia fallida. Saldo insuficiente");
        }
    }


}
