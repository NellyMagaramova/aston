package org.test.resources;
import org.test.resources.Animal;

public class Cat extends Animal {
    private int foodNeed;
    private boolean satiety;

    public boolean isSytost() {
        return satiety;
    }

    public void setSatiety(boolean sytost) {
        this.satiety = sytost;
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
        if(m <= 200)  System.out.println("Кот пробежал" + m + "m");
    }

    @Override
    public void swim(int m) {
        throw new UnsupportedOperationException();
    }

    public void eat(Dish dish){
        if(foodNeed > dish.getMaxFood()){
            System.out.println("не может съесть больше миски" );
            return;
        }

        if (foodNeed < dish.getMaxFood()){
            System.out.println("поел");
            dish.removeMaxFood(foodNeed);
            satiety = true;
            return;
        }

        System.out.println("не хватило еды" );
    }




}
