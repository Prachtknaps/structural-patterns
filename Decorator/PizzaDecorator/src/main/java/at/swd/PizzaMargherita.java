package at.swd;

public class PizzaMargherita implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza Margherita";
    }

    @Override
    public double getPrice() {
        return 11.99;
    }
}
