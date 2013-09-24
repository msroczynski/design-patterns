package pl.outbox.designpatterns.strategy;


import pl.outbox.designpatterns.strategy.model.animal.Dog;
import pl.outbox.designpatterns.strategy.model.animal.Dolphin;
import pl.outbox.designpatterns.strategy.model.animal.Environment;
import pl.outbox.designpatterns.strategy.model.animal.Food;

public class Run {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat(Food.MEAT, 3);
        dog.eat(Food.PLANT, 5);
        dog.move(Environment.LAND,10);
        dog.move(Environment.WATER,20);

        Dolphin dolphin = new Dolphin();
        dolphin.eat(Food.PLANT,7);
        dolphin.eat(Food.MEAT,10);
        dolphin.move(Environment.WATER,25);
        dolphin.move(Environment.LAND,35);

        System.out.println("# Dog #");
        System.out.println("Distance: " + dog.getDistance() + ", Mass: " + dog.getMass());

        System.out.println("# Dolphin #");
        System.out.println("Distance: " + dolphin.getDistance() + ", Mass: " + dolphin.getMass());


    }

}
