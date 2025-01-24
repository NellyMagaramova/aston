package org.test;
import org.test.resources.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.run(10);

        Dog dog1 = new Dog();
        dog1.run(200);
        dog1.swim(100);

        Dish dish = new Dish(14);

        Cat[] cats = new Cat[2];
        cats[0] = new Cat(15);
        cats[1] = new Cat(13);

        for(int i = 0; i < 2; i++){
            cats[i].eat(dish);
        }

        System.out.println("количество животных "+ Animal.count);

    }
}