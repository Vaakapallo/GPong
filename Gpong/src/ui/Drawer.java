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

    private Camera c;

    public Drawer(Camera c) {
        this.c = c;
    }

    public void drawPaddle(Paddle p, Graphics g) {
        double scale = c.getScale();

        int visualX = (int) scale * p.getX();
        int visualY = (int) scale * p.getY();
        int visualWidth = (int) scale * p.getWidth();
        int visualHeight = (int) scale * p.getHeight();

        g.fillRect(visualX, visualY, visualWidth, visualHeight);
    }

    public void drawBalls(HashSet<Ball> balls, Graphics g) {
        for (Ball b : balls) {
            drawBall(b, g);
        }
    }

    public void drawBall(Ball b, Graphics g) {
        double scale = c.getScale();

        int visualX = (int) scale * b.getX();
        int visualY = (int) scale * b.getY();
        int visualSize = (int) scale * b.getSize();

        g.fillRect(b.getX(), b.getY(), b.getSize(), b.getSize());
    }

    public void drawScore(int scoreA, int scoreB, Graphics g) {
        System.out.println("yks - nolla");
    }
}