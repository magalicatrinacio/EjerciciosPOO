package Objetos;

public class Contrarrelojista extends Ciclista{
    private double velocidadMaxima;

    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Contrarrelojista";
    }
    @Override
    public String imprimirDatos() {
        return super.imprimirDatos() + "\nVelocidadMaxima: " + velocidadMaxima + "Km/h";
    }

}
