package se.lexicon;
/*
11. Convert the following char[]: {'J','a','v','a'} to a String and print it out.
 */
public class Work11 {
    public static void charToString() {

        char[] word = {'J','a','v','a'};

        String java = String.valueOf(word);

        System.out.println("The result of converting is " + java);
    }
}