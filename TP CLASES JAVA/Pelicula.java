public class Pelicula {
    private String Titulo;
    private String Director;
    private Integer Duracion_min;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion_min) {
        Titulo = titulo;
        Director = director;
        Duracion_min = duracion_min;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public Integer getDuracion_min() {
        return Duracion_min;
    }

    public void setDuracion_min(Integer duracion_min) {
        Duracion_min = duracion_min;
    }

    public static void InformacionPelicula(String titulo, String director, int duracion_min){
        System.out.println("El titulo de la pelicula es: " + titulo + " la directora es: " + director + " y dura " + duracion_min + " minutos");

    }
}
