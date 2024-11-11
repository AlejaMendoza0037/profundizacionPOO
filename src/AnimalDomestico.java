public class AnimalDomestico extends Animal {




        public AnimalDomestico(String nombre, int edad) {
            super(nombre, edad);
        }

        public void vivirConHumanos() {
            System.out.println("Este animal está habituado a vivir con humanos.");
        }

        @Override
        public void emitirSonido() {
            System.out.println("El animal doméstico hace un sonido amigable.");
        }
    }





