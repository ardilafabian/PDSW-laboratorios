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
public class EuropeDictionary implements AbstractDictionary {

    @Override
    public String getFilename() {
        return "src/main/resources/europe_dictionary.txt";
    }
    
}
