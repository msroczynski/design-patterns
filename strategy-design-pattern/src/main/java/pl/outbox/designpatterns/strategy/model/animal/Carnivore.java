package pl.outbox.designpatterns.strategy.model.animal;

public class Carnivore implements Eatable {

	@Override
	public int eat(Food f, int amount) {

		switch (f) {

		case MEAT:
			return amount;

		case PLANT:
			return 0;
		
		default:
			return 0;	
		}

	}
}
