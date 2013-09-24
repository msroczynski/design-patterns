package pl.outbox.designpatterns.strategy.model.animal;

public class Dog extends AbstractAnimal {

    public Dog(){
        eatable = new Carnivore();
        moveble = new Terrestrial();
    }

}
