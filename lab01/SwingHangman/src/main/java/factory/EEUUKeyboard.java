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
public class EEUUKeyboard implements AbstractKeyboard{

    @Override
    public char[] getCharacters() {
        int lim = 'Z' - 'A';
        char[] c = new char[lim];
        for(int i = 0; i < lim; i++) {
            c[i] = (char)(i + 'A');
        }
        
        return c;
    }
    
}
