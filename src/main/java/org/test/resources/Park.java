package org.test.resources;
import java.util.Date;

public class Park {

    public class Attraction{
        String name;
        String startTime;
        String endTime;
        int cost;

        public Attraction(String name, String startTime, String endTime, int cost){
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.cost = cost;
        }

        public void info(){
            System.out.println("Название аттракциона:" + name +", " + "Начало работы"  + startTime  + ", " +
                    "Окончание работы: " + endTime + ", " + "Стоимость: " + cost + "рублей");
        }
    }
}
