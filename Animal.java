/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.animal;

/**
 *
 * @author Admin
 */
public class Animal {
 private final String name; // Made final
    private final int age;     // Made final

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("Eating " + foodType);
    }

    // Getter methods to access name and age
    public String togetName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
