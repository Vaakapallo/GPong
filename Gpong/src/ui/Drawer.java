/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics;
import java.util.HashSet;
import logic.Ball;
import logic.Paddle;

/**
 *
 * @author 41407
 */
public class Drawer {

    public Drawer() {
    }
    
    public void drawPaddle(Paddle p, Graphics g) {
        g.fillRect(p.getX(), p.getY(), p.getWidth(), p.getHeight());
    }
}
