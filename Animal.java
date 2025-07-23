package animal;

class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}