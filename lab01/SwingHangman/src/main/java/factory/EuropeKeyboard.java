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
public class EuropeKeyboard implements AbstractKeyboard {

    @Override
    public char[] getCharacters() {
        int lim = 'Z' - 'A';
        char[] c = new char[lim+5];
        for(int i = 0; i < lim; i++) {
            c[i] = (char)(i + 'A');
        }
        String e = "àèìòù".toUpperCase();
        for(int i = 0; i < e.length(); i++) {
            c[lim + i] = e.charAt(i);
        }
        
        return c;
    }
    
}
