/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

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
        this.setSize(game.getStage().getWidth() / 1000, game.getStage().getHeight() / 1000);
        this.setVisible(true);
    }
}
