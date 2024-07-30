import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private List<Jugador> jugadores;
    private EstadisticaEquipo estadisticas;

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = new ArrayList<>();
        this.estadisticas = new EstadisticaEquipo();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }


    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }


    public void actualizarEstadisticasEmpate() {
        estadisticas.actualizarEstadisticasEmpate();
    }

    // Getters y Setters
}
