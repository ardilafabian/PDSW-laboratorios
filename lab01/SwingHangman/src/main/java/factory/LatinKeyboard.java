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
public class LatinKeyboard implements AbstractKeyboard {

    @Override
    public char[] getCharacters() {
        int lim = 'Z' - 'A';
        char[] c = new char[lim+1];
        for(int i = 0; i < lim; i++) {
            c[i] = (char)(i + 'A');
        }
        c[lim] = 'Ñ';
        
        return c;
    }
    
}
