/***************************************************************
* file: HangmanPanel.java
*           Omar Rodriguez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Swing Project v1.0
* date last modified: 10/11/2016
*
* purpose: This is the view component for displaying a hangman game
*
****************************************************************/ 
package main.java.view;

import main.java.factory.AbstractCountryFactory;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class HangmanPanel extends JPanel{
    int incorrectCount;
    
    public HangmanPanel(){
        incorrectCount = 0;
    }

    //method: incrementIncorrectGuesses
    //purpose: increase the number of incorrect guesses from the player
    public void incrementIncorrectGuesses() {
        incorrectCount++;
    }

    //method: setIncorrectGuesses
    //purpose: manually setting number of incorrect guesses
    public void setIncorrectGuesses(int incorrectGuesses) {
        this.incorrectCount = incorrectGuesses;
    }
    
    //method: paint
    //purpose: paint the panel with the features of a hangman game, depending on 
    // how many incorrect guesses by the player
    @Override
    public void paint(Graphics g){
        super.paint(g);
        AbstractCountryFactory.getInstance().getImage().paint(g, incorrectCount, this.getHeight(), this.getWidth());
    }
}