package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PizzaGruesa implements IPizza{
    public void amasar() {
        Logger.getLogger(PizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    public void hornear() {
        Logger.getLogger(PizzaGruesa.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa convencional.");


        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

    public void moldear(Tamano tamano) {
        Logger.getLogger(PizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza gruesa de tamaño "+tamano.toString().toLowerCase()+" de masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }
}
