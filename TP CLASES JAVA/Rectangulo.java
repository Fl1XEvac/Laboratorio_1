public class Rectangulo {
    private Integer ancho;
    private Integer altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer ancho, Integer altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public static void calcularPerimetro(int altura, int ancho){
        double perimetro = (2 * altura) + (2 * ancho);
        System.out.println("El perimetro del rectangulo es de: " + perimetro);

    }

    public static void calcularArea(int altura, int ancho){
        double area = (altura * ancho);

        System.out.println("El area del rectangulo es de: " + area);
    }
}
