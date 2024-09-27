package Objetos;

public class Escalador extends Ciclista{
    private float aceleracionPromedio;
    private float gradoRampa;

    public Escalador(int id, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Es un Escalador";
    }

    @Override
    public String imprimirDatos(){
        return super.imprimirDatos() + "\nAceleracion promedio en subida: " + aceleracionPromedio + "m/s2" +
                "\nGrado de rampa soportada: " + gradoRampa + "grados";
    }
}
