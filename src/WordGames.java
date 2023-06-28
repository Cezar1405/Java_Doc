/**
 * La Clase WordGames proporciona 2 metodos de tipo String.
 * Author: [Cezar]
 */
public class WordGames {
    /**
     * Agregamos Hello antes de la palabra dada.
     *
     * @param word es la palabra para concatenar despues de Hello.
     * @return el String de Hello mas la palabra dada(word).
     */
    public String addHelloWord(String word){
        return "Hello "+word;
    }
    /**
     * Concatenamos nombre y apellido
     *
     * @param nome es el nombre, cognome es el apellido que se concatenaran.
     * @return el String con la concatenacion de nombre y apellido.
     */
    public String getFullName(String nome, String cognome){
        return nome+" "+cognome;
    }
}
