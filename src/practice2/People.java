package practice2;

public abstract class People {
    protected String name;
    protected int age;
    protected String profession;

    public People(String name, int age, String profession) {
        this.name = name;
        this. age = age;
        this.profession = profession;
    }

    public abstract String getName();

    public abstract int getAge();

    public abstract String getProfession();
}
