/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.factory;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author skinman95
 */
public class LatinImage implements AbstractImage {

    @Override
    public void paint(Graphics g, int incorrectCount, int height, int width) {
        ((Graphics2D)g).setStroke(new BasicStroke(5));
        int panelWidth = width;
        int panelHeight = height;
        
        g.drawLine(10, panelHeight - 10, (panelWidth / 4) + 10, panelHeight - 10);
        g.drawLine(((panelWidth/4)/2) + 10, panelHeight - 10,((panelWidth/4)/2) + 10, 10);
        g.drawLine(((panelWidth/4)/2) + 10, 10, (panelWidth / 4) + 10, 10);
        g.drawLine((panelWidth / 4) + 10, 10, (panelWidth / 4) + 10, panelHeight / 6);
        
        g.setColor(Color.BLACK);
        
        if(incorrectCount > 0){
            g.drawOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6),panelHeight/6,panelHeight/6); // Head
        }
        if(incorrectCount > 1){
            g.setColor(Color.GREEN);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*2,(panelWidth / 4) + 10,(panelHeight/6)*3); // Torso
        }
        if(incorrectCount > 2){
            g.setColor(Color.RED);
            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Left Arm
        }
        if(incorrectCount > 3){
            g.setColor(Color.RED);
            g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18),((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)); // Right Arm
        }
        if(incorrectCount > 4){
            g.setColor(Color.BLUE);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg
        }
        if(incorrectCount > 5){
            g.setColor(Color.BLUE);
            g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3,((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)); // Left Leg        
        }
    }
    
}
