package se.lexicon;
/*
What is the output of the following String:
"\tJ\ta\tv\ta\t" after you trim it?
 */
public class Work6 {
    public void trimOutput(){

        String text1 = ("\tJ\ta\tv\ta\t");
        String result;

        result = text1.replaceAll("\t", "");
        System.out.println("The output is " + result + ".");
    }
}