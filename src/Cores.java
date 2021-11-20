
class FindUserHomeDirectory {

    public static void main(String... args){
        String home = System.getProperty("user.home");
        System.out.println("User Home Directory: " + home);
    }
}