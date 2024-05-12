package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.IPizza;
import edu.unisabana.pizzafactory.model.PizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaIntegral;

public class ConcreteFactoryIntegral extends PizzaFactory{

    public IPizza crearPizza() {
        return new PizzaIntegral();

    }



}
