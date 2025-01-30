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

        Cat[] cats = new Cat[3];
        cats[0] = new Cat(15);
        cats[1] = new Cat(13);
        cats[2] = new Cat(3);

        for(int i = 0; i < cats.length; i++){
            cats[i].eat(dish);
        }

        System.out.println("количество животных "+ Animal.count);

        Rectangle rectangle1 = new Rectangle(5, 4);
        rectangle1.setBorderColor("Красный");
        rectangle1.setFillColor("желтый");
        rectangle1.info();

        Triangle triangle1 = new Triangle(3, 4);
        triangle1.setBorderColor("Черный");
        triangle1.setFillColor("Белый");
        triangle1.info();

        Circle circle1 = new Circle(3);
        circle1.setBorderColor("Розовый");
        circle1.setFillColor("Пурпурный");
        circle1.info();
    }
}