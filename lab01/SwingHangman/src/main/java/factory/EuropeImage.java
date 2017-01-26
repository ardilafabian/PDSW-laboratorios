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
public class EuropeImage implements AbstractImage {

    @Override
    public void paint(Graphics g, int incorrectCount, int height, int width) {
        ((Graphics2D)g).setStroke(new BasicStroke(5));
        int panelWidth = width;
        int panelHeight = height;
        
        g.setColor(Color.BLUE);
        
        int dy = panelHeight / 4;
        
        g.drawOval((panelWidth/4)+ 10 - (panelHeight / 12),(panelHeight/6)+dy,panelHeight/6,panelHeight/6); // Head
        g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*2+dy,(panelWidth / 4) + 10,(panelHeight/6)*3+dy); // Torso
        g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18)+dy,((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)+dy); // Left Arm
        g.drawLine((panelWidth / 4) + 10,((panelHeight/6)*2) + (panelHeight/18)+dy,((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*2) + (panelHeight/18))-(panelHeight/12)+dy); // Right Arm
        g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3 +dy,((panelWidth / 4) + 10) - (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)+dy); // Left Leg
        g.drawLine((panelWidth / 4) + 10,(panelHeight/6)*3+dy,((panelWidth / 4) + 10) + (panelHeight/6),
                    (((panelHeight/6)*3) + (panelHeight/18))+(panelHeight/12)+dy); // Left Leg
        
        
        if(incorrectCount > 0){
            g.drawLine( (panelWidth / 4) , (panelHeight / 6), (panelWidth / 4), (panelHeight / 6) + dy - (panelHeight / 12));
            g.drawOval( (panelWidth / 4), (panelHeight / 6) + dy - (panelHeight / 24), panelWidth / 256, panelHeight / 256);
        }
        if(incorrectCount > 1){
            g.drawLine( (panelWidth / 4) - (panelWidth / 32) , (panelHeight / 6), (panelWidth / 4) - (panelWidth / 32), 
                    (panelHeight / 6) + dy - (panelHeight / 12));
            g.drawOval( (panelWidth / 4) - (panelWidth / 32), (panelHeight / 6) + dy - (panelHeight / 24), panelWidth / 256, panelHeight / 256);
        }
        if(incorrectCount > 2){
            g.drawLine( (panelWidth / 4) + (panelWidth / 32) , (panelHeight / 6), (panelWidth / 4) + (panelWidth / 32), 
                    (panelHeight / 6) + dy - (panelHeight / 12));
            g.drawOval( (panelWidth / 4) + (panelWidth / 32), (panelHeight / 6) + dy - (panelHeight / 24), panelWidth / 256, panelHeight / 256);
        }
        if(incorrectCount > 3){
            g.drawLine( (panelWidth / 4) - 2*(panelWidth / 32) , (panelHeight / 6), (panelWidth / 4) - 2*(panelWidth / 32), 
                    (panelHeight / 6) + dy - (panelHeight / 12));
            g.drawOval( (panelWidth / 4) - 2*(panelWidth / 32), (panelHeight / 6) + dy - (panelHeight / 24), panelWidth / 256, panelHeight / 256);
        }
        if(incorrectCount > 4){
            g.drawLine( (panelWidth / 4) + 2*(panelWidth / 32) , (panelHeight / 6), (panelWidth / 4) + 2*(panelWidth / 32), 
                    (panelHeight / 6) + dy - (panelHeight / 12));
            g.drawOval( (panelWidth / 4) + 2*(panelWidth / 32), (panelHeight / 6) + dy - (panelHeight / 24), panelWidth / 256, panelHeight / 256);
        }
        if(incorrectCount > 5){
            g.drawLine( (panelWidth / 4) + 3*(panelWidth / 32) , (panelHeight / 6), (panelWidth / 4) + 3*(panelWidth / 32), 
                    (panelHeight / 6) + dy - (panelHeight / 12));
            g.drawOval( (panelWidth / 4) + 3*(panelWidth / 32), (panelHeight / 6) + dy - (panelHeight / 24), panelWidth / 256, panelHeight / 256);
        }
    }
    
}
