package at.swd.decorators;

import at.swd.Pizza;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", pepperoni";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 1.50;
    }
}
