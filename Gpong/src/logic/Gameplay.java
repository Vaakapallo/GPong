/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.HashSet;
import java.util.Iterator;

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

    public Gameplay(int x, int y) {
        this.balls = new HashSet();
        this.stage = new Stage(x, y);
        this.leftPaddle = new Paddle((int) x / 10, (int) y / 2, 10, 200);
        this.rightPaddle = new Paddle((int) x - x / 10, (int) y / 2, 10, 200);
    }

    private void loop() {
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

    private void addABall(int x, int y, int xSpeed, int ySpeed) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
