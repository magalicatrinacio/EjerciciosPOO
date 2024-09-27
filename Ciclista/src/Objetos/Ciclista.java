package Objetos;

public abstract class Ciclista {
    private int id;
    private String nombre;
    private int tiempoAcumulado;


    // Generamos el constructor vacio
    public Ciclista() {
    }


    // Generamos el constructor con parametros
    public Ciclista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        // inicializamos el valor en 0
        this.tiempoAcumulado = 0;
    }

    // Generamos los getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    // Generamos el metodo abstracto
    public abstract String imprimirTipo(); //{return "Es un: " + this.getClass().getSimpleName();}

    // Metodo para imprimir los datos comunes de un ciclista
    public String imprimirDatos(){
        return "Id: " + id + ", Nombre: " + nombre + ", tiempo acumulado: " + tiempoAcumulado + " minutos";
    }
}

