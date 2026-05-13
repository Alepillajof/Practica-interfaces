public class Leon extends Animal{
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void comer() {
        System.out.println("---LEON---");System.out.println(nombre + " come carne");
    }

    @Override
    public void sonido() {
        System.out.println(nombre + " ruge");
    }
}