/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.HashSet;

/**
 *
 * @author 41407
 */
public class Gameplay {
    
    private HashSet<Ball> balls;
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Stage s;
    
    public Gameplay(int x, int y) {
        this.balls = new HashSet();
        this.s = new Stage(x, y);
        this.leftPaddle = new Paddle((int) x/10, (int) y/2, 10, 200);
        this.rightPaddle = new Paddle((int) x-x/10, (int) y/2, 10, 200);
    }
    
    private void loop() {
        
    }
}
