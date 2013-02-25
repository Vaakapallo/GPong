/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import logic.Direction;

/**
 *
 * @author 41407
 */
public class Listener implements KeyListener {

    private Direction[] paddleDirection = new Direction[2];

    @Override
    public void keyTyped(KeyEvent ke) {
        // Unused method
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_W) {
            paddleDirection[0] = Direction.UP;
        } else if(ke.getKeyCode() == KeyEvent.VK_S) {
            paddleDirection[0] = Direction.DOWN;
        } else {
            paddleDirection[0] = Direction.STOP;
        }
        if(ke.getKeyCode() == KeyEvent.VK_UP) {
            paddleDirection[1] = Direction.UP;
        } else if(ke.getKeyCode() == KeyEvent.VK_DOWN) {
            paddleDirection[1] = Direction.DOWN;
        } else {
            paddleDirection[1] = Direction.STOP;
                    
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
