/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Scanner;
import ui.PongFrame;

/**
 *
 * @author lassi
 */
public class Gpong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        while (x < 400) {
            System.out.println("ANna kentän x>400");
            x = s.nextInt();
        }


        int y = 0;
        while (y < 400) {
            System.out.println("Anne kentn yy>400");
            y = s.nextInt();
        }

        Gameplay gameplay = new Gameplay(x, y);
        PongFrame frame = new PongFrame(gameplay);
    }
}
