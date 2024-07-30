public class Arbitro {
    private String nombre;
    private int experiencia;


    public Arbitro(String nombre, int experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
    }


    public void asignarPartido(Partido partido) {
        // Lógica para asignar el árbitro a un partido
    }

    public String getNombre() {
        return nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    // Getters y Setters
}
