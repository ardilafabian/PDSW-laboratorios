
package edu.eci.pdsw.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class HorneadorPizzaDelgada implements AbstractHorneadorPizza{

    public void hornear() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza con masa delgada.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
