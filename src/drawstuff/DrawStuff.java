/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.ApplicationStarter;
import java.awt.Dimension;

/**
 *
 * @author panpjp
 */
public class DrawStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        startUp();
    }
    
    private static void startUp() {
//        ApplicationStarter.run("My First Drawing", new DrawingEnvironment());
        ApplicationStarter.run(new String[0], "Apple Ad", new Dimension(2560, 1440), new DrawingEnvironment());
    }
}
