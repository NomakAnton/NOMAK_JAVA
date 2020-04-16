/**
 * Являеться ли строка палиндромом
 */

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text){
        String textToLowerCase = text.toLowerCase();
        textToLowerCase = textToLowerCase.replaceAll("[^a-zA-Z0-9]", "");
        char charToString [] = textToLowerCase.toCharArray();
        for (int i = 0; i < charToString.length/2 ; i++) {
          if (charToString[i] != charToString[charToString.length-i-1]){
              return false;
          }
        }

        return true;
    }

}
