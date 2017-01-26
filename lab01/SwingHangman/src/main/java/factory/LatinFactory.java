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
public class LatinFactory extends AbstractCountryFactory{

    LatinFactory() {
        keyboard = new LatinKeyboard();
        image = new LatinImage();
        dictionary = new LatinDictionary();
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
