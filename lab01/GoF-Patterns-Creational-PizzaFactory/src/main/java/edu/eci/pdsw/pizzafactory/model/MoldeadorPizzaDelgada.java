
package edu.eci.pdsw.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class MoldeadorPizzaDelgada implements AbstractMoldeadorPizza{

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa delgada.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa delgada.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
