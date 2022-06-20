package se.lexicon;
/*
3. Given the following String: "Ok this is not as long!"
create a substring of only "not as long" (excluding the
exclamation point) and print it out.
 */
public class Work3 {
    public void subText() {
        {
            String stringText = ("Ok this is not as long!");
            String subString = "";

            subString = stringText.substring(11, 22);
            System.out.println(subString);
        }
    }
}