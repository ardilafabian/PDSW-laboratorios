
package edu.eci.pdsw.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class AmasadorPizzaDelgada implements AbstractAmasadorPizza {
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza con masa delgada.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
