/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.HashSet;
import java.util.Iterator;
import ui.PongFrame;

/**
 *
 * @author 41407
 */
public class Gameplay {

    private HashSet<Ball> balls;
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Stage stage;
    private int player1score = 0;
    private int player2score = 0;
    private PongFrame frame;

    public Gameplay(int x, int y) {
        this.balls = new HashSet();
        this.stage = new Stage(x, y);
        this.leftPaddle = new Paddle(0 + 20000, (int) y / 2, 50000, 200000);
        this.rightPaddle = new Paddle(x - 20000, (int) y / 2, 50000, 200000);
        System.out.println(x + " y: " + y);
    }

    public void loop() {
        while (true) {
            if (balls.isEmpty()) {
                int xSpeed = 10;
                int ySpeed = 5;
                addABall(stage.getHeight() / 2, stage.getHeight() / 2, xSpeed, ySpeed);
            }

            for (Iterator<Ball> it = balls.iterator(); it.hasNext();) {
                Ball b = it.next();
                int x = b.update(stage);
                if (x < leftPaddle.getX()) {
                    if (x < 0) {
                        it.remove();
                    } else if (b.xCollide(leftPaddle)) {
                        addABall(b.getX(), b.getY(), b.getxSpeed(), b.getySpeed());
                    }
                } else if (x > rightPaddle.getX()) {
                    if (x > stage.getWidth()) {
                        it.remove();
                    } else if (b.xCollide(rightPaddle)) {
                        addABall(b.getX(), b.getY(), b.getxSpeed(), b.getySpeed());
                    }
                }
            }
            rightPaddle.update(stage);
            leftPaddle.update(stage);
            frame.updatePanel();
            try {
                Thread.currentThread().sleep(16);
            } catch (InterruptedException ex) {
                System.out.println("Perse!");
            }
        }
    }

    public HashSet<Ball> getBalls() {
        return balls;
    }

    public Paddle getLeftPaddle() {
        return leftPaddle;
    }

    public Paddle getRightPaddle() {
        return rightPaddle;
    }

    public Stage getStage() {
        return stage;
    }

    public int getPlayer1score() {
        return player1score;
    }

    public int getPlayer2score() {
        return player2score;
    }

    public void setFrame(PongFrame frame) {
        this.frame = frame;
    }

    public PongFrame getFrame() {
        return frame;
    }

    private void addABall(int x, int y, int xSpeed, int ySpeed) {
        Ball b = new Ball(x, y, xSpeed, ySpeed, calculateSize());
        balls.add(b);
    }
    
    private int calculateSize() {
        return 10000;
    }
}
