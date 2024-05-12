package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaIntegral implements IPizza{
    public void amasar() {
        Logger.getLogger(PizzaIntegral.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza integral con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    public void hornear() {
        Logger.getLogger(PizzaIntegral.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza integral con masa convencional.");


        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    public void moldear(Tamano tamano) {
        Logger.getLogger(PizzaIntegral.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza integral de tamaño "+tamano.toString().toLowerCase()+" de masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }
}
