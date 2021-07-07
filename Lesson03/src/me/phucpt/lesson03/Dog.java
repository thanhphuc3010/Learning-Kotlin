package me.phucpt.lesson03;

public class Dog extends Animal {
    private String name;
    private String color;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void animalSound() {
        System.out.println("The dog says: gau gau");
    }
}
