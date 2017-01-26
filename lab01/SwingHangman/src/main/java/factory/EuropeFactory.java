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
public class EuropeFactory extends AbstractCountryFactory{

    EuropeFactory() {
        image = new EuropeImage();
        keyboard = new EuropeKeyboard();
        dictionary = new EuropeDictionary();
    }
    
    @Override
    public AbstractKeyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public AbstractImage getImage() {
        return image;
    }

    @Override
    public AbstractDictionary getDictionary() {
        return dictionary;
    }
    
}
