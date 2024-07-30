public class Jugador {
    private String nombre;
    private String posicion;
    private EstadisticaJugador estadisticas;

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.estadisticas = new EstadisticaJugador();
    }



    public void actualizarEstadisticas(int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas, float posesionDeBalon) {
        estadisticas.actualizarEstadisticas(goles, asistencias, tarjetasAmarillas, tarjetasRojas, posesionDeBalon);
    }
    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }
    // Getters y Setters
}
