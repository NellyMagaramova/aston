package org.test.resources;

public class Dish {
    private int maxFood;

    public int getMaxFood() {
        return maxFood;
    }

    public void removeMaxFood(int food){
        this.maxFood -= food;
    }

    public void setMaxFood(int maxFood) {
        this.maxFood = maxFood;
    }

    public Dish(int count){
        this.maxFood =  count;
    }

    public void  add(int food){
        maxFood += food;
    }
}
