package Task1;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File(".\\src\\romeo-and-juliet.txt");
        File outFile = new File(".\\src\\longestword.txt");
        StringBuilder plainText = new StringBuilder();
        String regex = "[^A-z'-]";
        String resWord = "";

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(inputFile))) {
            while (reader.ready()) {

                plainText.append((char) reader.read());
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
        System.out.println(plainText);

        HashSet<String> words = new HashSet<>();
        words.addAll(Arrays.stream(plainText.toString().split(regex)).toList());
        for (String w : words) {
            resWord = (w.length() > resWord.length()) ? w : resWord;
        }

        System.out.println(resWord);
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outFile))) {
            writer.write(resWord);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
