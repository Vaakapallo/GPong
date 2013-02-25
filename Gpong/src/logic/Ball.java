/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author lassi
 */
public class Ball {

    private int x;
    private int xSpeed;
    private int y;
    private int ySpeed;
    private int size;
    
    public Ball(int x, int y, int xSpeed, int ySpeed, int size) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }
    
    public void yCollide() {
        this.ySpeed *= -1;
    }
    
    /**
     * 
     * @param p
     * @return true if ball hits the paddle
     */
    public boolean xCollide(Paddle p) {
        if(this.y > p.getY() && this.y < p.getY()+p.getHeight()) {
            this.xSpeed *= -1;
            return true;
        } else {
            return false;
        }
    }
}