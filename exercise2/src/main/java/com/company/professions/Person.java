package com.company.professions;

public class Person {
    private int age;
    private String lives;

    public void setAge(int personAge) {
        age = personAge;
    }

    public int getAge() {
        return age;
    }

    public void setLives(String personLives) {
        lives = personLives;
    }

    public String getLives() {
        return lives;
    }


    public Person(int age, String lives) {
        this.age = age;
        this.lives = lives;
    }

    @Override
    public String toString() {
        return age + " years, lives in " + lives;
    }

}



