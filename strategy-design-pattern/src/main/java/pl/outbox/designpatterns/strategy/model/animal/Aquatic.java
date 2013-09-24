package pl.outbox.designpatterns.strategy.model.animal;


public class Aquatic implements Moveble{

    @Override
    public int move(Environment env, int distance) {
        switch (env) {

            case WATER:
                return distance;

            case LAND:
                return 0;

            default:
                return 0;
        }
    }
}
