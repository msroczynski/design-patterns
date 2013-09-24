package pl.outbox.designpatterns.strategy.model.animal;

public abstract class AbstractAnimal {

    public int getMass() {
        return mass;
    }

    public int getDistance() {
        return distance;
    }

    protected int mass;
    protected int distance;

    protected Eatable eatable;
    protected Moveble moveble;

    public void eat(Food f, int amount){
        this.mass += eatable.eat(f, amount);
    }

    public void move(Environment env, int distance){
        this.distance += moveble.move(env, distance);
    }

}

