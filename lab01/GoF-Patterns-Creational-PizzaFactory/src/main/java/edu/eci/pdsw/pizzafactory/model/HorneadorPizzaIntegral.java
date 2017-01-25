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
public class HorneadorPizzaIntegral implements AbstractHorneadorPizza {

    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza con masa integral.");
    }

    
    
}
