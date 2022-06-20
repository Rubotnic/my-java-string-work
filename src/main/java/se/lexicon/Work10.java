package se.lexicon;
/*
10. Convert the following String: "ThisShouldBeConverted" to
a char array. Iterate through the char array and print out
each element.
 */
public class Work10{

    public static void convertChar() {

        {
            String newString = "ThisShouldBeConverted";

            int stringLength = newString.length();

            for (int i = 0; i < stringLength; i++) {
                char newChar = newString.charAt(i);

                System.out.println("The result of converting is " + newChar);
            }
        }
    }
}