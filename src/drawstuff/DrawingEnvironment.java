/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author panpjp
 */
class DrawingEnvironment extends Environment {

    public DrawingEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
        this.setBackground(Color.WHITE);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
//        graphics.fillOval(10, 20, 200, 300);
//        graphics.fillOval(210, 20, 200, 300);
//        graphics.drawOval(200,100,150,150);
//        graphics.setColor(Color.yellow);
//        graphics.drawOval(300,100,150,150);
//        graphics.setColor(Color.GREEN);
//        graphics.drawOval(400,100,150,150);
//        graphics.setColor(Color.blue);
//        graphics.drawOval(250,150,150,150);
//        graphics.setColor(Color.RED);
//        graphics.drawOval(350,150,150,150);
//        graphics.setColor(Color.ORANGE);
//
//        Venn Diagram
//        
//        graphics.setColor(new Color(255, 0, 0, 120));
//        graphics.fillOval(400, 300, 100, 100);
//        graphics.setColor(new Color(0, 255, 0, 120));
//        graphics.fillOval(375, 350, 100, 100);
//        graphics.setColor(new Color(0, 0, 255, 120));
//        graphics.fillOval(425, 350, 100, 100);
        
        // Playground
//        graphics.setFont(new Font("Comic Sans MS", Font.BOLD, 55));
//        graphics.drawString("420 blaze it", 300, 300);
        while (true) {
            
        }
        if (logo != null) {
            graphics.drawImage(logo, 1180, 520, 200, 200, this);
        }
        graphics.setFont(new Font("SFNS Display", Font.PLAIN, 110));
        graphics.drawString("Hey. Get over here.", 300, 300);
    }
    
    Image logo = null;
    
}
