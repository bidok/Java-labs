import java.io.*;

public class lab_4 {
    public static void main(String[] args) throws FileNotFoundException {
        String bookName = "Harry Potter and the Sorcerer.txt";
        String text = "";

        text = lab4_func.scanBook(text, bookName);
        text = text.replaceAll("[^a-zA-Z ']", "").toLowerCase();
        String[] textArray = text.split(" ");
        String uniqText = new String();

        uniqText = lab4_func.findUniqueWords(textArray, uniqText);
        String[] uniqTextArray = uniqText.split(" ");
        int[] amountOfRepeat = new int[uniqTextArray.length];

        amountOfRepeat = lab4_func.findAmountUniqueWords(uniqTextArray, textArray, amountOfRepeat);
        uniqTextArray = lab4_func.sortArrays(amountOfRepeat, uniqTextArray);
        lab4_func.print(uniqTextArray, amountOfRepeat);
    }
}







