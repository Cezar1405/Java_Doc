/**
 * La Clase WordGames proporciona 2 metodos de tipo String.
 * Author: [Cezar]
 */
public class WordGames {
    /**
     * Metodo que toma una palabra y la concatena con Hello
     * @param word es el parametro que el metodo toma
     * @return nos regresara un String concatenando Hello con el parametro word
     */
    public String addHelloWord(String word){
        return "Hello "+word;
    }
    /**
     * Concatenamos nombre y apellido
     *
     * @param nome es el parametro que se concatenara con el parametro cognome.
     * @return nos regresara el String con la concatenacion de nombre y apellido.
     */
    public String getFullName(String nome, String cognome){
        return nome+" "+cognome;
    }
}
