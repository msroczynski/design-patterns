package pl.outbox.designpatterns.strategy.model.animal;


public class Dolphin extends AbstractAnimal {

    public Dolphin(){
        eatable = new Herbivorous();
        moveble = new Aquatic();
    }

}
