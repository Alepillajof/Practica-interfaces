public class Pinguino extends Animal implements Nadar{
    public Pinguino(String nombre, int edad) { super(nombre, edad); }

    @Override
    public void comer() {
        System.out.println("---PINGUINO---");System.out.println(nombre + " come pescado"); }

    @Override
    public void sonido() {
        System.out.println(nombre + " Nose");
    }

    @Override
    public void nada() { System.out.println(nombre + " puede nadar"); }
}