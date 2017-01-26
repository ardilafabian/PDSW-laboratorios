/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.factory;

/**
 *
 * @author skinman95
 */
public abstract class AbstractCountryFactory {
    private static AbstractCountryFactory instance = null;
    
    protected AbstractKeyboard keyboard;
    protected AbstractImage image;
    protected AbstractDictionary dictionary;
    
    public abstract AbstractKeyboard getKeyboard();
    public abstract AbstractImage getImage();
    public abstract AbstractDictionary getDictionary();
    
    public static AbstractCountryFactory getInstance() {
        return instance;
    }
    
    public static AbstractCountryFactory getInstance(CountryRegion reg) {
        if (instance == null) {
            switch(reg) {
                
                case EUROPE:
                    instance = new EuropeFactory();
                    break;
                case LATIN:
                    instance = new LatinFactory();
                    break;
                case EEUU:
                default:
                    instance = new EEUUFactory();
                    break;
            }
        }
        
        return instance;
    }
}
