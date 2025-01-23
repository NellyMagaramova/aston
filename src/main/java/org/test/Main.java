package org.test;
import  org.test.resources.Person;
import  org.test.resources.Park;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Магарамова Nelly Aslanovna", "Engineer",
                "jasmin_oir@mail.ru", "79202520308",  50000, 32);
        person1.info();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 30);
        persArray[1] = new Person("Gamzajev Rafik Ruslanovich", "Businessman", "gamzaevrafik@mail.ru",
                "89051951005", 100000, 40);
        persArray[2] = new Person("Filippova Madina Ruslanovna", "Accountant", "gamzaevamadina@mailru",
                "89063646479", 70000, 40);
        persArray[3] = new Person("Filippov Victor Anatolievitch", "Engineer", "filippovvictor@mailru",
                "89108747422", 80000, 37);
        persArray[4] = new Person("Gaubatova Sherihan Rafetovna", "Accountant", "gaiatovasherihan@mailru",
                "89302603225", 40000, 37);

        Park.Attraction attraction = new Park().new Attraction("Американские горки", "10:00", "20:00", 150);
        attraction.info();
    }
}