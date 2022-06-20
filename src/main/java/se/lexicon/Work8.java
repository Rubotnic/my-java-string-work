package se.lexicon;
/*
8. Oil and water don't go well together. Given the String:
"Oil and Water", split them up into the words "Oil","Water"
and store them in a String array.
 */
import java.util.Arrays;

public class Work8 {
    public static void slitLiquid() {

        String liquidName = "Oil and Water";

        String[] str = liquidName.split("and");
        System.out.println(Arrays.toString(str));
    }
}
