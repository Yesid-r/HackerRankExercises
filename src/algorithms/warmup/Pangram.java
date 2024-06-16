package algorithms.warmup;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pangram {

    /*
    La Entrada consiste en una linea que contiene .

        Restricciones
        La longitud de  puede ser a lo mucho   y puede contener espacios, minúsculas y mayúsculas. Las minúsculas y mayúsculas de una misma letra son consideradas la misma letra.

        Formato de Salida

        Imprime una línea que contiene pangram si  es un pangrama, sino imprime not pangram.

        Ejemplo de Entrada #1

        We promptly judged antique ivory buckles for the next prize
        Ejemplo de Salida #1

        pangram
        Ejemplo de Entrada #2

        We promptly judged antique ivory buckles for the prize
        Ejemplo de Salida #2

        not pangram
     */
    public static String pangrams(String s) {
        // Write your code here
        String sMinus = s.toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = sMinus.charAt(i);
            if( Character.isLetter(c) ){
                letters.add(c);
            }

        }
        return (letters.size() == 26 )? "pangram" : "not pangram";
    }
}
