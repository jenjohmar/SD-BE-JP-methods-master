package nl.novi.jp.methods.medior;

import java.util.ArrayList;
import java.util.List;

/**
 * Uitdagend!
 * Gegeven: Een methode die string per character in een List stopt (numberStringToArrayList).
 * Gegeven: Een methode die een getal ontvangt en deze vertaalt naar een String (numberListToStringList).
 * Gegeven: Twee methodes die afgemaakt moeten worden door jou!
 *
 * Deze applicatie heeft als doel om een string van nummer in zijn geheel uit te schrijven:
 * "123" wordt "one-two-three"
 *
 * Twee methodes zijn al gegeven, twee moet je zelf maken en je dient ze vervolgens in de juiste volgorde aan te roepen
 * vanuit de main-methode.
 * Pas numberListToStringList() zo aan dat de getallen uit de list worden omgezet naar text en worden toegevoegd aan:
 * wordNumbers
 *
 * Pas printNumbers() zo aan dat de List wordt geprint met een "-" tussen de Strings.
 */

public class MediorFour {

    public static void main(String[] args) {
        // output is een list met elk cijfer omgezet naar integer
        List<Integer> result = numberStringToArrayList("123123145");
        //output is een list met elk cijfer omgezet naar het woord voor dit cijfer (string)
        List<String> resultWords = numberListToStringList(result);

        //output is een lijst van deze woorden met een - tussen elk woord
        printNumbers(resultWords);

    }

    public static List<Integer> numberStringToArrayList(String numbers) {
        //instantiatie van een nieuwe lijst met integers
        List<Integer> numberList = new ArrayList<>();
        //elk karakter (nummer) uit de string wordt omgezet naar de integer value
        //en toegevoegd aan de nieuwe lijst
        for(char character : numbers.toCharArray()) {
            numberList.add(Integer.parseInt(String.valueOf(character)));
        }
        return numberList;
    }

    public static List<String> numberListToStringList(List<Integer> numbers) {
        //instantiatie nieuwe lijst met strings
        List<String> wordNumbers = new ArrayList<>();
        //voor elke integer uit de meegegeven lijst met integers
        //maak er eerst het bijbehorende woord van via methode numberToWord()
        //en voeg deze string waarde toe aan de nieuwe lijst
        for(int number : numbers)  {
            wordNumbers.add(numberToWord(number));
        }

        return wordNumbers;
    }

    public static String numberToWord(int number) {
        //voor elke integer return het cijfer als woord (string)
        switch(number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "Unknown number";
        }
    }

    public static void printNumbers(List<String> numberWords) {
        //variabele met de lengte van de lijst
        int arraySize = numberWords.size();
        //lege variabele die gebruikt gaat worden voor de minus
        String finalString = "";

        //teller aanmaken op basis van lijstlengte
        for (int i = 0; i < numberWords.size(); i++) {
            //voor elk item in de lijst waarde finalString is
            finalString = finalString + numberWords.get(i);

            // Only add an hyphen when it is not the last one!
            if(i + 1 != arraySize) {
                finalString = finalString + "-";
            }
        }
        System.out.println(finalString);
    }

}
