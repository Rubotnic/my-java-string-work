package se.lexicon;
/*
9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
into an array. Print out all names separately.
 */
public class Work9 {

    public static void splitNames() {

        String liquidName = "Carl,Susie,Fredrick,Bob,Erik";

        String[] substring = liquidName.split(",");

        for (String s : substring) {
            System.out.println(s);
        }
    }
}