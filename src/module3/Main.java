package module3;

import java.util.Arrays;

public class Main {
    public static String text = "Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.";

    public static String encrypt(String text, int shift) {
        shift %= 25; // по количеству букв в латинице (26) минус 1 буква.
        char[] chars = text.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            char newChar = 0;
            int charCode = (int) chars[i];
            if ((charCode >= 65 && charCode <= 90) ||  (charCode >= 97 && charCode <= 122)) {
                if (charCode <= 90 && charCode + shift > 90) {
                    newChar = (char) (charCode + shift - 90 + 65);
                    newChars[i] = newChar;
                } else if (charCode <= 122 && charCode + shift > 122) {
                    newChar = (char) (charCode + shift - 122 + 97);
                    newChars[i] = newChar;
                } else if ((charCode < 90 && charCode + shift <= 90) || (charCode < 122 && charCode + shift <= 122) ) {
                    newChar = (char) (charCode + shift);
                    newChars[i] = newChar;
                } else {
                    newChars[i] = chars[i];
                }
            } else {
                newChars[i] = chars[i];
            }

        }

        return new String(newChars);
    }

    public static String decrypt(String text, int shift) {
        shift %= 25; // по количеству букв в латинице (26) минус 1 буква.
        char[] chars = text.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            char newChar;
            int charCode = (int) chars[i];
            if ((charCode >= 65 && charCode <= 90) ||  (charCode >= 97 && charCode <= 122)) {
                if (charCode < 90 && charCode + shift > 90) {
                    newChar = (char) (charCode - shift - 90 + 65);
                    newChars[i] = newChar;
                } else if (charCode < 122 && charCode + shift > 122) {
                    newChar = (char) (charCode - shift - 122 + 97);
                    newChars[i] = newChar;
                } else if ((charCode < 90 && charCode + shift <= 90) || (charCode < 122 && charCode + shift <= 122) ) {
                    newChar = (char) (charCode - shift);
                    newChars[i] = newChar;
                } else {
                    newChars[i] = chars[i];
                }
            }
            newChars[i] = chars[i];
        }

        return new String(newChars);
    }

    public static void main(String[] args) {

        System.out.println(encrypt(text, 5));
        System.out.println(decrypt(text, 5));
    }

}
