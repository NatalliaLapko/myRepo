package task;

import java.util.ArrayList;

public class Task1 {


    void lineReverse(String line) {

        char[] l = line.toCharArray();
        for (int i = l.length - 1; i >= 0; i--) {

            System.out.print(l[i]);
        }
        System.out.println();
    }


    void replaceCharacter(String line, int characterNumber, char newCharacter) {

        try {
            char[] l = line.toCharArray();
            for (int i = 0; i < l.length; i++) {
                if (i == characterNumber) {
                    l[i] = newCharacter;
                }
                System.out.print(l[i]);
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        System.out.println();
    }

    void deleteCharacter(String line, int charNumber) {

        try {
            char[] l = line.toCharArray();
            for (int i = 0; i < l.length; i++) {
                if (i == charNumber) {
                    i = charNumber + 1;
                }
                System.out.print(l[i]);
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        System.out.println();
    }

    void countChar(String line, char charToCount) {

        int counter = 0;
        char[] l = line.toCharArray();
        for (int i = 0; i < l.length; i++) {
            if (l[i] == charToCount) {
                counter++;
            }
        }

        System.out.println("Символ " + charToCount + " в вашей строке появляется " + counter + " раз.");
    }

    void showLine(String line, int times) {

        try {
            for (int i = 0; i < times-1; i++) {
                System.out.print(line);
                System.out.print(" | ");
            }
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
        System.out.println(line);

    }

    boolean isPalindrom(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        boolean isPalindrom = reverse.equals(word);
        System.out.println("Is  word '" + word + "' a palyndrome? " + isPalindrom);
        return isPalindrom;


    }


    boolean isAnagramm(String word1, String word2) {

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();


        for (int i = ch1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ch1[j] > ch1[j + 1]) {
                    char temp = ch1[j];
                    ch1[j] = ch1[j + 1];
                    ch1[j + 1] = temp;

                }
            }
        }

        for (int i = ch2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ch2[j] > ch2[j + 1]) {
                    char temp = ch2[j];
                    ch2[j] = ch2[j + 1];
                    ch2[j + 1] = temp;

                }
            }

        }

        String word1Value = String.valueOf(ch1);
        String word2Value = String.valueOf(ch2);


        boolean isAnagramm = word1Value.equals(word2Value);

        System.out.println("Are the words '" + word1 + "' and '" + word2 + "' an anagramm? : " + isAnagramm);
        return isAnagramm;

    }


    int factorial(int f) {
        int i = 1;
        int result = 1;
        try {
            while (i <= f) {

                result = result * i;
                i++;
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Entered number should be greater than 0");
        }

        System.out.println(result);
        return result;
    }


    void fibonacchi(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 0;

        int i = 0;
        try {
            while (i < n) {
                i++;
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
                System.out.print(fn + " ");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Entered number should be greater than 0");
        }
        System.out.println();
    }


}








