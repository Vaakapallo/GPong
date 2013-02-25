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
    private int y;
    private int size;

    public Ball(int x, int y, int koko) {
        this.x = x;
        this.y = y;
        this.size = koko;
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
}
