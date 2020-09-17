import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class lab4_func {

    public static String scanBook(String text, String book) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(book));
        while (scanner.hasNextLine()) {
            text += scanner.nextLine();
        }
        return  text;
    }

    public static String  findUniqueWords(String[] textArray, String uniqText) {
        for (int i = 0; i < textArray.length; i++) {
            if (!uniqText.contains(textArray[i])) {
                uniqText += textArray[i] + " ";
            }
        }
        return uniqText;
    }

    public static int[] findAmountUniqueWords(String[] uniqTextArray, String[] textArray, int[] amountOfRepeat) {
        for (int i = 0; i < uniqTextArray.length; i++) {
            int count = 0;
            for (int j = 0; j < textArray.length; j++) {
                if (uniqTextArray[i].equals(textArray[j])) {
                    count++;
                }
            }
            amountOfRepeat[i] = count;
        }
        return amountOfRepeat;
    }

    public static String[] sortArrays(int[] array, String[] uniqTextArray) {
        boolean isSorted = false;
        int buf;
        String temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;

                    temp = uniqTextArray[i];
                    uniqTextArray[i] = uniqTextArray[i+1];
                    uniqTextArray[i+1] = temp;
                }
            }
        }
        return uniqTextArray;
    }

    static void print (String [] uniqTextArray, int [] amountOfRepeat){
        for (int i = 0; i < uniqTextArray.length; i++) {
            System.out.println(uniqTextArray[i] + " = " + amountOfRepeat[i]);
        }
    }
}

