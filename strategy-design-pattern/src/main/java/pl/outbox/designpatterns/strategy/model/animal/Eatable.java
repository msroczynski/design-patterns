package pl.outbox.designpatterns.strategy.model.animal;

public interface Eatable {
    public abstract int eat(Food f, int amount);
}
