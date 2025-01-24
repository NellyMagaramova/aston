package org.test.resources;
import org.test.resources.Animal;

public class Dog  extends Animal{
    static int count;

    @Override
    public void run(int m) {
        if(m<500) System.out.println("Бобик пробежал" + m+ "m");
        return;
    }

    @Override
    public void swim(int m) {
        if(m<10) System.out.println("Бобик проплыл" + m + "m");
        return;
    }

    public Dog(){
    }
}
