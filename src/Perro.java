




    public class Perro extends AnimalDomestico implements Comunicar {
        public Perro(String nombre, int edad) {
            super(nombre, edad);
        }



        public void ladrar() {
            System.out.println("El perro ladra.");
        }

        @Override
        public void comunicar() {
            ladrar();
        }
    }




