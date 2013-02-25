/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author 41407
 */
public class Camera {

    private double scale;

    public Camera() {
        this.scale = 1000;
    }
    
    public Camera(int scale) {
        this.scale = scale;
    }

    public double getScale() {
        return scale;
    }
}
