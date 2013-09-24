package pl.outbox.designpatterns.strategy.model.animal;


public class Terrestrial implements Moveble {

    @Override
    public int move(Environment env, int distance) {
        switch (env) {

            case WATER:
                return 0;

            case LAND:
                return distance;

            default:
                return 0;
        }
    }
}
