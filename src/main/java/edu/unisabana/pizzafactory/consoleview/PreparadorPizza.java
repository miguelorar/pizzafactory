
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.factory.ConcreteFactoryDelgada;
import edu.unisabana.pizzafactory.factory.ConcreteFactoryGruesa;
import edu.unisabana.pizzafactory.factory.ConcreteFactoryIntegral;
import edu.unisabana.pizzafactory.factory.PizzaFactory;
import edu.unisabana.pizzafactory.model.*;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){

        Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};
        PizzaFactory pizzaFactoryDelgada = new ConcreteFactoryDelgada();

         IPizza pizzaDelgada =  pizzaFactoryDelgada.crearPizza();
        pizzaDelgada.amasar();
        pizzaDelgada.hornear();
        pizzaDelgada.moldear(Tamano.MEDIANO);

        aplicarIngredientes(ingredientes);

        PizzaFactory pizzaFactoryGruesa = new ConcreteFactoryGruesa();

        IPizza pizzaGruesa =  pizzaFactoryGruesa.crearPizza();
        pizzaGruesa.amasar();
        pizzaGruesa.hornear();
        pizzaGruesa.moldear(Tamano.PEQUENO);

        aplicarIngredientes(ingredientes);

        PizzaFactory pizzaFactoryIntegral = new ConcreteFactoryIntegral();

        IPizza pizzaIntegral =  pizzaFactoryIntegral.crearPizza();
        pizzaIntegral.amasar();
        pizzaIntegral.hornear();
        pizzaIntegral.moldear(Tamano.MEDIANO);

        aplicarIngredientes(ingredientes);

    }


    private static void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));

        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }


}
