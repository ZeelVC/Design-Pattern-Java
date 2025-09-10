package com.example.structural_decorator_pattern.WithoutDecoratorPattern;

interface Pizza {
    String getDescription();
    double getCost();
}

class BasicPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Basic Pizza";

    }

    @Override
    public double getCost() {
        return 5.00; //base cost
    }
}

class CheesePizza extends BasicPizza{
    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}

class CheeseOlivePizza extends CheesePizza{

    @Override
    public String getDescription() {
        return super.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
public class WithoutDecoratorPattern {
    public static void main(String[] args) {
        Pizza pizza = new CheeseOlivePizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
