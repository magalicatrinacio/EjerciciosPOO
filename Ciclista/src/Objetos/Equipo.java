package Objetos;


public class Equipo {
    private String nombre;
    private Ciclista[] lista;
    private int numeroCiclistas;

    // Constante que define el número máximo de ciclistas - variable de clase
    public static final int MAX_CICLISTAS = 10; // Aplicar uso de final

    // Constructor con un número máximo de ciclistas
    public Equipo(String nombre, int maxCiclistas) {
        this.nombre = nombre;
        // this.ciclistas = new Ciclista[MAX_CICLISTAS];
        this.lista = new Ciclista[maxCiclistas]; // Arreglo de ciclistas con tamaño fijo
        this.numeroCiclistas = 0; // Inicialmente no hay ciclistas
    }


    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCiclista(Ciclista ciclista) {
        if (numeroCiclistas < lista.length){
            lista[numeroCiclistas] = ciclista;
            numeroCiclistas++;
        }
    }

    // Imprimir los datos del equipo y sus ciclistas
    public void imprimirDatosEquipo() {
        System.out.println("Equipo: " + nombre);
        for (int i = 0; i < numeroCiclistas; i++) {
            System.out.println(lista[i].imprimirTipo());
            System.out.println(lista[i].imprimirDatos());
            System.out.println();
        }
    }

    // calcular el total de tiempo de los ciclistas
    public int calcularTiempoTotal(){
        int tiempoTotal = 0;
        for (int i = 0; i < numeroCiclistas; i++) {
            tiempoTotal += lista[i].getTiempoAcumulado();
        }
        return tiempoTotal;
    }

    // Listar los nombres de los ciclista
    public void listarCiclistas() {
        System.out.println("Ciclistas del equipo "+ nombre + ":");
        for (int i = 0; i < numeroCiclistas; i++) {
            System.out.println(lista[i].getNombre());
        }
    }

    // Buscar ciclista por id
    public void buscarCiclista(int id){
        for (int i = 0; i < numeroCiclistas; i++) {
            if (lista[i].getId() == id) {
                System.out.println("Datos del ciclista con ID " + id + ":");
                System.out.println(lista[i].imprimirTipo());
                System.out.println(lista[i].imprimirDatos());
                return;
            }
            System.out.println("Datos del ciclista con ID "+ id + ":no encontrados");
        }
    }

}







