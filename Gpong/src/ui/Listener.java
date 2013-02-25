/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import logic.Direction;
import logic.Paddle;

/**
 *
 * @author 41407
 */
public class Listener implements KeyListener {

    private Paddle leftPaddle;
    private Paddle rightPaddle;

    public Listener(Paddle a, Paddle b) {
        this.leftPaddle = a;
        this.rightPaddle = b;
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        // Unused method
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_W) {
            leftPaddle.setDirection(Direction.UP);
        } else if (ke.getKeyCode() == KeyEvent.VK_S) {
            leftPaddle.setDirection(Direction.DOWN);
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            rightPaddle.setDirection(Direction.UP);
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            rightPaddle.setDirection(Direction.DOWN);
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_W
                || ke.getKeyCode() == KeyEvent.VK_S) {
            leftPaddle.setDirection(Direction.STOP);
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP
                || ke.getKeyCode() == KeyEvent.VK_DOWN) {
            rightPaddle.setDirection(Direction.STOP);
        }
    }
}
