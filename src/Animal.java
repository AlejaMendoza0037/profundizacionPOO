public class Animal {


//atributos
        protected String nombre;
        protected int edad;


        // Constructor
        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;

        }

        // Métodos
        public void alimentarse() {
            System.out.println("El animal se está alimentando.");
        }

        public void respirar() {
            System.out.println("El animal está respirando.");
        }

        public void desplazarse() {
            System.out.println("El animal se está desplazando.");
        }


        public void emitirSonido() {
            System.out.println("El animal emite un sonido.");
        }
    }







