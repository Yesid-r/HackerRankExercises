package algorithms.warmup;

import java.util.HashMap;
import java.util.Map;

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

        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if((int) sMinus.charAt(i) != 32){
                int pos = (int) sMinus.charAt(i);
                numbers.put(pos, 1);
            }

        }
        if(numbers.size() == 26){
            return "pangram";
        }
        return "not pangram";
    }
}
