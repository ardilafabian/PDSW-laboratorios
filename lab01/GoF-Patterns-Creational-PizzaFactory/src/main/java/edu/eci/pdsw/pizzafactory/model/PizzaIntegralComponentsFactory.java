/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.pizzafactory.model;

/**
 *
 * @author Fabian Ardila
 */
public class PizzaIntegralComponentsFactory extends AbstractComponentFactory{

    @Override
    public AbstractAmasadorPizza getAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public AbstractHorneadorPizza getHorneador() {
        return new HorneadorPizzaIntegral();
    }

    @Override
    public AbstractMoldeadorPizza getMoldeador() {
        return new MoldeadorPizzaIntegral();
    }
    
    
}
