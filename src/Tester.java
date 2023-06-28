/**
 * Esta clase sirve para probar la clase WordGames
 * Author: [Cezar]
 **/

public class Tester {
    public static void main(String[] args){

        WordGames obj1 = new WordGames();

        String holaMundo = obj1.addHelloWord("Mundo");
        String nombreCompleto = obj1.getFullName("Cesar", "Cotrina");

        System.out.println(holaMundo);
        System.out.println(nombreCompleto);
    }
}
