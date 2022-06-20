package se.lexicon;
/*
4. Convert the following String: "CAPS EQUALS SCREAMING" to
lowercase and print it out. Then convert it back to
uppercase and print it out again.
 */
public class Work4 {
    public void upperLowerString(){

        String stringToLow = ("CAPS EQUALS SCREAMING");
        String stringToUpp = ("caps equals screaming");

        String lowerString1 = stringToLow.toLowerCase();
        System.out.println(lowerString1);

        String lowerString2 = stringToUpp.toUpperCase();
        System.out.println(lowerString2);
    }
}