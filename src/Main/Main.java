/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import core.Cat;
import core.Dog;
import core.Person;

/**
 *
 * @author jpradaj
 */
public class Main {
    public static void main(String[] args) {
        
        Person persona1 = new Person("Juan Jose", 22, 1007041039);
        System.out.println(persona1);
        
        Dog perro1 = new Dog("Maltez", "Macho", 7);
        System.out.println(perro1);
        
        Cat gato1 = new Cat("Gato", 33);
        System.out.println(gato1);
    }
}
