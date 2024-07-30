import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String resultado;

    public Partido(Date fecha, Equipo equipoLocal, Equipo equipoVisitante) {
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultado = "";
    }
    public Date getFecha() {
        return fecha;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public String getResultado() {
        return resultado;
    }


    public void actualizarResultado(String resultado) {
        this.resultado = resultado;
        // Lógica adicional para actualizar estadísticas de equipos y jugadores
    }

    // Getters y Setters
}
