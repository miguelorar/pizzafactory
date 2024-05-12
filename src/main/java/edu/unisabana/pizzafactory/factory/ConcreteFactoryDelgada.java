package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.IPizza;
import edu.unisabana.pizzafactory.model.PizzaDelgada;

public class ConcreteFactoryDelgada extends PizzaFactory{

    public IPizza crearPizza() {
        return new PizzaDelgada();

    }

}
