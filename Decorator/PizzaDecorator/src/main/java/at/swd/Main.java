package at.swd;

import at.swd.decorators.CheeseDecorator;
import at.swd.decorators.OliveDecorator;
import at.swd.decorators.PepperoniDecorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaMargherita();

        // Add extra cheese
        pizza = new CheeseDecorator(pizza);
        // Add olives
        pizza = new OliveDecorator(pizza);
        // Add pepperoni
        pizza = new PepperoniDecorator(pizza);

        System.out.println(pizza.getDescription() + "\nPrice: $" + pizza.getPrice());
    }
}