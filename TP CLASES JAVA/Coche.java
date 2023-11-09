public class Coche {
    private String modelo;
    private String Marca;
    private Integer ano_de_fabricacion;

    public Coche() {
    }

    public Coche(String modelo, String marca, Integer ano_de_fabricacion) {
        this.modelo = modelo;
        Marca = marca;
        this.ano_de_fabricacion = ano_de_fabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Integer getAno_de_fabricacion() {
        return ano_de_fabricacion;
    }

    public void setAno_de_fabricacion(Integer ano_de_fabricacion) {
        this.ano_de_fabricacion = ano_de_fabricacion;
    }

    public static void Acelerar(){
        System.out.println("Aceleraste");
    }
    public static void Frenar(){
        System.out.println("Frenaste");
    }
}
