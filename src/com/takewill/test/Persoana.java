package com.takewill.test;

public class Persoana {
    static final Integer wage = 100;
    int age = 0;
    String name;
    String job;

    public Persoana() {    }

    @Override
    public String toString() {
        return "Persoana{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public Persoana(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    public static void main(String[] args) {
        Persoana persoana = new Persoana(30, "Vasile", "Tester");
        Persoana persoana1 = new Persoana();
        Persoana persoana2 = new Persoana(30, "Ana", "QA");
        System.out.println(persoana1.toString());
        System.out.println(persoana.toString());
    }
}
