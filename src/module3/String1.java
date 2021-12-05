package module3;

import java.util.Locale;

public class String1 {
    public static void main(String[] args) {
        String user1 = " иван иванович иванов ";
        String user2 = "Петр Иванов";
        checkName(user1, user2);
    }

    private static void checkName(String name1, String name2) {
        String user1m = name1.toLowerCase();
        String user2m = name2.toLowerCase();
        boolean b = user1m.equals(user2m);
        if (b) {
            System.out.println("Выберите другое имя!");
        } else {
            String nameWithoutSpaces = name1.replace(" ", "");
            System.out.println("Отличное имя!");
            System.out.println("Длина Вашего имени составляет " + name1.length() + " символов");
            System.out.println("А без пробелов длина Вашего имени составит " + nameWithoutSpaces.length() + " символов");
        }
    }
}
