public class Circulo {
    private Double radio;

    public Circulo(){
    }

    public Circulo(Double radio){
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public static void circunferencia (double radio){
        double circunferencia= 2 * Math.PI * radio;
        System.out.println("La circunferencia del circulo es: " + circunferencia);
    }

    public static void area(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);

    }
}