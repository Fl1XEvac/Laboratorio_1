public class Estudiante {
    private String nombre;
    private Integer edad;
    private Integer numero_de_identificacion;

    public Estudiante(String nombre, Integer edad, Integer numero_de_identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero_de_identificacion = numero_de_identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumero_de_identificacion() {
        return numero_de_identificacion;
    }

    public void setNumero_de_identificacion(Integer numero_de_identificacion) {
        this.numero_de_identificacion = numero_de_identificacion;
    }
}
