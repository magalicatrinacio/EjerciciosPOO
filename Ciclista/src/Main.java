import Objetos.Contrarrelojista;
import Objetos.Equipo;
import Objetos.Escalador;
import Objetos.Velocista;

public class Main {
    public static void main(String[] args) {
        // Crear equipo
        Equipo equipo = new Equipo("Team Cyclists", 3);

        // Crear ciclistas de diferentes tipos
        Velocista velocista = new Velocista(1, "Pedro", 400, 55);
        Escalador escalador = new Escalador(2, "Juan", 1.2f, 15);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Ana", 60);

        // Añadir ciclistas al equipo
        equipo.agregarCiclista(velocista);
        equipo.agregarCiclista(escalador);
        equipo.agregarCiclista(contrarrelojista);

        // Imprimir datos del equipo y sus ciclistas
        equipo.imprimirDatosEquipo();

        // Calcular el tiempo total de los ciclistas
        System.out.println("Tiempo total acumulado del equipo: " + equipo.calcularTiempoTotal() + " minutos");

        // Listar ciclistas del equipo
        equipo.listarCiclistas();

        // Buscar un ciclista por ID
        equipo.buscarCiclista(2);
    }
}