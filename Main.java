package animal;

// Clase principal que usa las otras clases
public class Main {
    public static void main(String[] args) {
        Animal miPerro = new Perro("Buddy");
        Animal miGato = new Gato("Whiskers");

        System.out.println("El perro se llama: " + miPerro.getNombre());
        miPerro.hacerSonido();

        System.out.println("El gato se llama: " + miGato.getNombre());
        miGato.hacerSonido();
    }
}