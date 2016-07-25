/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class taarget {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the no.s:");
        Scanner s1 = new Scanner(System.in);
        String s = s1.nextLine();
        String[] b = s.split(" ");
        System.out.println("Enter the terget:");
        Scanner s2 = new Scanner(System.in);
        int t = s2.nextInt();
        int n = b.length;
        for (int i = 0; i < n; i++) {
        }
        for (int i = 0; i < n; i++) {
            int x;
            x = Integer.parseInt(b[i]);
            for (int j = i + 1; j < n; j++) {
                int y;
                y = Integer.parseInt(b[j]);
                if (x + y == t) {
                    System.out.println(x + " " + y);
                }                    
                else{
                    System.out.println("Data Invalid");
                }
            }
        }
    }
}
