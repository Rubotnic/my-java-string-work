package se.lexicon;
/*
1. What is the length of the String "Java"?

1.1 What char is at index position 6 in the following String:
"Longer example sentence"
 */
public class Work1 {
    public void stringLength() {
        String word = ("Java");
        System.out.println("The length of the word Java is "+ word.length() + ".");

        String text = ("Long example sentence");
        System.out.println("The char in index position 6 is " + text.charAt(6) + ".");
    }
}