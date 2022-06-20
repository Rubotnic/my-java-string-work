package se.lexicon;
/*
5. Correct the following String: "Java is the worst programming language!"
by replacing the (obviously incorrect) word "worst" with the word "best". Then print
out the sentence.
 */
public class Work5 {

    public void replaceWord() {

        String text = "Java is the worst programming language!";

        String replaceString = text.replace("worst","best");
        System.out.println(replaceString);
    }
}