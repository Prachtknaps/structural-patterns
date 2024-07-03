package at.swd.decorators;

import at.swd.Pizza;

public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription() + ", olives";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice() + 0.75;
    }
}
