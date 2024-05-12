package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaDelgada implements IPizza{

    @Override
    public void amasar() {
        Logger.getLogger(PizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void hornear() {
        Logger.getLogger(PizzaDelgada.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");


        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    @Override
    public void moldear(Tamano tamano) {
        Logger.getLogger(PizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza delgada de tamaño "+tamano.toString().toLowerCase()+" de masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }
}
