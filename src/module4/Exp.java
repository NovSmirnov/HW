package module4;

public class Exp {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("ABC");
//            sb.insert(sb.lenght() /2 , "ABC");
//            sb.insert(0, "ABC");
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
