package pl.outbox.designpatterns.strategy.model.animal;


public class Herbivorous implements Eatable {

    @Override
    public int eat(Food f, int amount) {
        switch (f) {

            case MEAT:
                return 0;

            case PLANT:
                return amount;

            default:
                return 0;
        }
    }
}
