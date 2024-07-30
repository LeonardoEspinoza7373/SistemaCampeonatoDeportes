public class EstadisticaJugador {
    private int goles;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int partidosJugados;
    private float posesionDeBalon;

    public void actualizarEstadisticas(int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas, float posesionDeBalon) {
        this.goles += goles;
        this.asistencias += asistencias;
        this.tarjetasAmarillas += tarjetasAmarillas;
        this.tarjetasRojas += tarjetasRojas;
        this.posesionDeBalon = (this.posesionDeBalon * partidosJugados + posesionDeBalon) / (partidosJugados + 1);
        this.partidosJugados++;
    }

    // Getters y Setters
}
