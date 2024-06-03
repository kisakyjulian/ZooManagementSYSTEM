/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.animal;


/**
 *
 * @author Admin
 */

public class Zoo {
      public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Ella", 10);
        Animal monkey = new Monkey("Momo", 3);

        lion.makeSound();
        lion.eat();
        lion.makeSound(3);
        lion.eat("meat");

        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2);
        elephant.eat("grass");

        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4);
        monkey.eat("bananas");
    }
}

