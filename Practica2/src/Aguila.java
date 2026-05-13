public class Aguila extends Animal implements Volador{
    public Aguila(String nombre, int edad) { super(nombre, edad); }

    @Override
    public void sonido() {
        System.out.println(nombre + " nose");
    }

    @Override
    public void comer() {
        System.out.println("---AGUILA---"); System.out.println(nombre + " come gusanos"); }

    @Override
    public void volar() { System.out.println(nombre + " puede volar");}
}