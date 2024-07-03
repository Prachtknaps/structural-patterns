package at.swd.decorators;

import at.swd.Pizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", extra cheese";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 1.25;
    }
}
