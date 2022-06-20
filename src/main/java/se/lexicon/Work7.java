package se.lexicon;
/*
7. Parse the following int: 20 to a String and add a 20 to the end of the String.
Printing it out should return: "2020".
 */
import java.util.Arrays;

public class Work7 {
    public void twenty(){

        int[] array1 = {20};
        int[] array2 = Arrays.copyOf(array1, array1.length + 1);
        array2[1] = 20;

        for(int numbers : array2)
            System.out.print(numbers);
        System.out.println();
    }
}
