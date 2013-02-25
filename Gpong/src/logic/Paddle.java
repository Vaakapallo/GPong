/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author lassi
 */
public class Paddle {

    private int x;
    private int y;
    private int score;
    private final int height;
    private final int width;
    private Direction direction;

    public Paddle(int x, int y, int width, int height) {
        this.score = 0;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        direction = Direction.STOP;
    }

    public int getScore() {
        return score;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    public void update(Stage s) {
        if(this.direction == Direction.UP && this.y > 0) {
            this.y-=5000;
        }
        if(this.direction == Direction.DOWN && this.y+this.height < s.getHeight()) {
            this.y+=5000;
        }
    }
}
