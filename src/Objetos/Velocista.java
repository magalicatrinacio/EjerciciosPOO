package Objetos;

public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;


    public Velocista(int id, String nombre, double potenciaPromedio, double velocidadPromedio) {
        super(id, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Velocista";
    }

    @Override
    public String imprimirDatos() {
        return super.imprimirDatos() + "\nPotencia promedio: "+ potenciaPromedio + "vatios" +
                "\nVelocidad promedio: "+ velocidadPromedio + "Km/h";
    }

}
