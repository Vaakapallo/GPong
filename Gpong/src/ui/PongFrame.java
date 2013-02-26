/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import javax.swing.JFrame;
import logic.Gameplay;

/**
 *
 * @author lassi
 */
public class PongFrame extends JFrame {

    public PongFrame(Gameplay game) {
        Listener listener = new Listener(game.getLeftPaddle(), game.getRightPaddle());
        this.addKeyListener(listener);
        this.add(new PongPanel(game));
        this.setTitle("Pong");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize((int)game.getStage().getWidth(), (int)game.getStage().getHeight());
        this.setVisible(true);
        this.setBackground(Color.black);
    }
    
    
    public void updatePanel(){
        this.repaint();
    }
}
