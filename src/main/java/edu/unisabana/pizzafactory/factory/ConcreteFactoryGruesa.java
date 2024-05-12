package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.IPizza;
import edu.unisabana.pizzafactory.model.PizzaDelgada;
import edu.unisabana.pizzafactory.model.PizzaGruesa;

public class ConcreteFactoryGruesa extends PizzaFactory{

    public IPizza crearPizza() {
        return new PizzaGruesa();

    }

}
