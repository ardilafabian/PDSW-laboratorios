/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabian Ardila
 */
public class MoldeadorPizzaIntegral implements AbstractMoldeadorPizza {

    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Moldeando pizza pequena con masa integral.");
    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Moldeando pizza mediana con masa integral.");
    }

    
    
}
