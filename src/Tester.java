/**
 * Esta Clase nos sirve para provar la Clase WordGames
 * Author: [Cezar]
 */
public class Tester {
    public static void main(String[] args){
        //Creamos el objeto
        WordGames obj1 = new WordGames();
        //damos los parametros al objeto creado y los asignamos como variables de tipo string
        String holaMundo = obj1.addHelloWord("Mundo");
        String nombreCompleto = obj1.getFullName("Cesar", "Cotrina");
        //Imprimimos en pantalla el resultado llamando a las variables creadas anteriormente
        System.out.println(holaMundo);
        System.out.println(nombreCompleto);
    }
}
