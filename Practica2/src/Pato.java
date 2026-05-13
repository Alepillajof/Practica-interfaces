public class Pato extends Animal implements Nadar, Volador{
    public Pato(String nombre, int edad) { super(nombre, edad); }

    @Override
    public void comer() {
        System.out.println("---PATO---");System.out.println(nombre + " come pan"); }

    @Override
    public void sonido() { System.out.println(nombre + " hace cuack"); }

    @Override
    public void nada() { System.out.println(nombre + " puede nadar"); }

    @Override
    public void volar() { System.out.println(nombre + " puede volar"); }
}