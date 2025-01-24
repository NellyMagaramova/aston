package org.test.resources;
import org.test.resources.Animal;

public class Cat extends Animal {

    private int foodNeed;
    private boolean sytost;

    public boolean isSytost() {
        return sytost;
    }

    public void setSytost(boolean sytost) {
        this.sytost = sytost;
    }

    public Cat(int foodNeed) {
        this.foodNeed = foodNeed;
    }

    public int getFoodNeed() {
        return foodNeed;
    }

    public void setFoodNeed(int foodNeed) {
        this.foodNeed = foodNeed;
    }

    @Override
    public void run(int m) {
        if(m<200)  System.out.println("Кот пробежал" + m + "m");
    }

    public void eat(Dish dish){
        if(foodNeed > dish.getMaxFood()){
            System.out.println("не может съесть больше миски" );
            return;
        }

        if (foodNeed < dish.getMaxFood()){
            System.out.println("поел");
            sytost = true;
            return;
        }

        System.out.println("не хватило еды" );
    }


    public Cat(){

    }


}
