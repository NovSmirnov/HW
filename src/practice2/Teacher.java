package practice2;

public class Teacher extends People{
    private String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    public String getName() {
        return super.name;
    }

    public int getAge(){
        return super.age;
    }

    public String getProfession() {
        return super.profession;
    }

    public String getSubject() {
        return subject;
    }

    public String giveALesson() {
        return "The lesson was ended";
    }
}
