/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Scanner;

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
        System.out.println("ANna kentän x");
        int x = s.nextInt();
        System.out.println("Anne kentn yy");
        int y = s.nextInt();
        
        Gameplay gameplay = new Gameplay(x, y);
    }
}
