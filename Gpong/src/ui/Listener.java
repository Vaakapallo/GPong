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
    private boolean p1up;
    private boolean p1down;
    private boolean p2up;
    private boolean p2down;

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
            p1up = true;
        } else if (ke.getKeyCode() == KeyEvent.VK_S) {
            p1down = true;
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            p2up = true;
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            p2down = true;
        }
        keyLogic();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_W) {
            p1up = false;
        } else if (ke.getKeyCode() == KeyEvent.VK_S) {
            p1down = false;
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            p2up = false;
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            p2down = false;
        }
        keyLogic();
    }

    private void keyLogic() {
        if (p1up) {
            leftPaddle.setDirection(Direction.UP);
        } else if (p1down) {
            leftPaddle.setDirection(Direction.DOWN);
        } else {
            leftPaddle.setDirection(Direction.STOP);
        }
        if (p2up) {
            rightPaddle.setDirection(Direction.UP);
        } else if (p2down) {
            rightPaddle.setDirection(Direction.DOWN);
        } else {
            rightPaddle.setDirection(Direction.STOP);
        }
    }
}
