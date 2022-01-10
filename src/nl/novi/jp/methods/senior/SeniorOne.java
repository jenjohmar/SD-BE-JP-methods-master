package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class SeniorOne {
    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        List<String> checkedList = checkCapitals(customerNames);

        System.out.println(checkedList);
    }

    public static List<String> checkCapitals(List<String> names) {
        List<String> checkedNames = new ArrayList<>();

        //voor elke string in de lijst namen
        for (String name:names) {
            //maak van deze string een lijst met losse woorden
            String separateWords[] = name.split("\\s");
            //lege string die gevuld gaat worden
            String capitalizedWords = "";
            //pak het eerste en laatste woord uit de lijst separateWords en maak van de eerste letter een hoofdletter
            String firstWordCap = capitalize(separateWords[0]);
            String lastWordCap = capitalize(separateWords[separateWords.length -1]);

            //vervang het eerste en laatste woord in de lijst door de gekapitaliseerde woorden
            separateWords[0] = firstWordCap;
            separateWords[separateWords.length -1] = lastWordCap;
            // maak van de lijst een string
            String newName = String.join(" ", separateWords);

            checkedNames.add(newName);
        }

        return checkedNames;

    }

    public static String capitalize(String word) {
        String newWord = "";
        String first = word.substring(0,1);
        String rest = word.substring(1);
        newWord += first.toUpperCase() + rest + " ";

        return newWord.trim();

    }


}
