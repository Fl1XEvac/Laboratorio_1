public class Libro {
    private String titulo;
    private String autor;
    private String año_de_publicacion;

    public Libro(String titulo, String autor, String año_de_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.año_de_publicacion = año_de_publicacion;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño_de_publicacion() {
        return año_de_publicacion;
    }

    public void setAño_de_publicacion(String año_de_publicacion) {
        this.año_de_publicacion = año_de_publicacion;
    }

    public void mostrar_libro(){
        System.out.println("El titulo es: " + titulo +  " Autores: " + titulo + " Y se publico el: " + año_de_publicacion);
    }

}
