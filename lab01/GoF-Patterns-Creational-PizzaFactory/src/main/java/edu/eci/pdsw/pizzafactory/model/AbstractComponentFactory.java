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
public abstract class AbstractComponentFactory {
    protected static AbstractComponentFactory instance = null;
    
    public static AbstractComponentFactory getInstance(Masa ma) {
        if(instance == null) {
            switch(ma) {
                case DELGADA:
                    instance = new PizzaDelgadaComponentsFactory();
                    break;
                case GRUESA:
                    instance = new PizzaGruesaComponentsFactory();
                    break;
                case INTEGRAL:
                    instance = new PizzaIntegralComponentsFactory();
                    break;
            }
        }
        return instance;
    }
    public abstract AbstractAmasadorPizza getAmasador();
    public abstract AbstractHorneadorPizza getHorneador();
    public abstract AbstractMoldeadorPizza getMoldeador();
}
