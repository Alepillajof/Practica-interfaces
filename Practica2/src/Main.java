public class Main {
    public static void main(String[] args){
        Leon a1 = new Leon("Simba", 10);
        Pinguino a2 = new Pinguino("Skiper", 5);
        Aguila a3 = new Aguila("Aguila", 3);
        Pato a4 = new Pato("Juan", 2);
        a1.comer(); a1.sonido();
        a2.comer(); a2.sonido(); a2.nada();
        a3.comer(); a3.sonido(); a3.volar();
        a4.comer(); a4.sonido(); a4.nada(); a4.volar();
    }
}