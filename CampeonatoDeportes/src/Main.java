import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear jugadores
        Jugador jugador1 = new Jugador("Juan", "Delantero");
        Jugador jugador2 = new Jugador("Pedro", "Defensa");

        // Crear equipos
        Equipo equipo1 = new Equipo("Equipo A");
        Equipo equipo2 = new Equipo("Equipo B");
        equipo1.agregarJugador(jugador1);
        equipo2.agregarJugador(jugador2);

        // Crear fechas para el calendario del campeonato
        Date fechaInicio = new Date();  // Fecha de inicio actual
        Date fechaFin = new Date(fechaInicio.getTime() + 1000 * 60 * 60 * 24 * 30);  // Fecha de fin 30 días después

        // Crear campeonato
        Campeonato campeonato = new Campeonato("Liga 2024", TipoCampeonato.LIGA, fechaInicio, fechaFin);
        campeonato.agregarEquipo(equipo1);
        campeonato.agregarEquipo(equipo2);

        // Crear partido
        Partido partido = new Partido(new Date(), equipo1, equipo2);
        partido.actualizarResultado("2-2");
        campeonato.agregarPartido(partido);

        // Registrar empate
        campeonato.registrarEmpate(equipo1, equipo2, 2, 2);

        // Calcular estadísticas del campeonato
        campeonato.calcularEstadisticas();

        // Crear árbitro
        Arbitro arbitro = new Arbitro("Carlos", 5);
        arbitro.asignarPartido(partido);

        // Crear estadio
        Estadio estadio = new Estadio("Estadio Nacional", "Ciudad", 50000);
        estadio.actualizarInformacion("Nueva Ciudad", 60000);

        // Crear inscripción
        Inscripcion inscripcion = new Inscripcion(equipo1, campeonato);

        // Crear calendario
        Calendario calendario = new Calendario(fechaInicio, fechaFin);

        // Salida a consola
        System.out.println("Jugadores del " + equipo1.getNombreEquipo() + ":");
        for (Jugador j : equipo1.getJugadores()) {
            System.out.println("Nombre: " + j.getNombre() + ", Posición: " + j.getPosicion());
        }

        System.out.println("\nPartidos del campeonato " + campeonato.getNombre() + ":");
        for (Partido p : campeonato.getPartidos()) {
            System.out.println("Fecha: " + p.getFecha() + ", Local: " + p.getEquipoLocal().getNombreEquipo() +
                    ", Visitante: " + p.getEquipoVisitante().getNombreEquipo() + ", Resultado: " + p.getResultado());
        }

        System.out.println("\nÁrbitro asignado: " + arbitro.getNombre() + ", Experiencia: " + arbitro.getExperiencia() + " años");

        System.out.println("\nEstadio: " + estadio.getNombre() + ", Ubicación: " + estadio.getUbicacion() + ", Capacidad: " + estadio.getCapacidad());
    }
}
