package org.example;

public class Animal {
    private int id;
    private String name;
    private String category;
    private String color;
    private int age;

    public Animal(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(int id, String name, String category, String color, int age) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.color = color;
        this.age = age;
    }
}
