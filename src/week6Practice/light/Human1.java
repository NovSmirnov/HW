package week6Practice.light;

public class Human1 {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;


    public Human1(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 60;
    }

    public Human1(String name, String address) {
        this.name = name;
        this.age = 20;
        this.weight = 60;
        this.address = address;
    }

    public Human1(int age, int weight, String address, String work) {
        this.name = "Vasia";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human1(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human1(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 60;
        this.work = work;
    }

}
