public class AnimalSalvaje extends Animal{


    // Clase para Animales Salvajes

        public AnimalSalvaje(String nombre, int edad) {
            super(nombre, edad);
        }

        public void vivirEnHabitatNatural() {
            System.out.println("Este animal vive en su hábitat natural.");
        }

        @Override
        public void emitirSonido() {
            System.out.println("El animal salvaje emite un sonido cauteloso o agresivo.");

        }}

