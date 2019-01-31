/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/*
Task 1
*/
import java.util.Scanner;
public class Task1 {
    public static void main (String [] args) {
       int x, y, z;
       
       System.out.println("Enter two numbers ");
       Scanner in = new Scanner(System.in);
       
       x = in.nextInt();
       y = in.nextInt();
       z = x * y ;
       
       System.out.println("Sum of the integers = " + z);
        
    }
}
