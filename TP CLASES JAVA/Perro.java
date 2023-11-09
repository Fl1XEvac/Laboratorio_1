public class Perro {
        private String nombre;

        private Integer edad;

        private String raza;

        private String ladrar;

        public Perro() {
        }

        public Perro(String nombre, Integer edad, String raza) {
                this.nombre = nombre;
                this.edad = edad;
                this.raza = raza;
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

        public String getRaza() {
                return raza;
        }

        public void setRaza(String raza) {
                this.raza = raza;
        }

        public static void Ladrar(){
                System.out.println("guau guau");
        }
}



