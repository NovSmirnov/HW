package module3;

public class RemChars {
    public static void main(String[] args) {
        String myText = "helloworld";
        int stringLength = myText.length();
        for (int i = 0; i < stringLength; i++) {
            if (myText.length() >= 2) {
                myText = myText.substring(1, myText.length() - 1);
                System.out.println(myText);
            }
        }
    }
}
