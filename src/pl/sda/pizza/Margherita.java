package pl.sda.pizza;

import java.util.List;

public class Margherita implements Pizza, Ingredients {
    public List<String> ingrets;
    private PizzaDough pizzaDough;

    public Margherita() {
    }

    public Margherita(List<String> ingrets, PizzaDough pizzaDough) {
        this.ingrets = ingrets;
        this.pizzaDough = pizzaDough;
    }

    @Override
    public void preparePizza() {

    }

    @Override
    public List<String> getIngredients() {
        return null;
    }
}
