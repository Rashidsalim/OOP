/*
Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, 
the average, the distance (the difference between integer), 
the maximum (the larger of the two integers), the minimum (smaller of the two integers).  
 */
package lab2.task5;
import java.util.*;
/**
 *
 Task 5
 */
public class Lab2Task5 {

  
    public static void main(String[] args) {
        int x,y,z;
        float avg ;
    System.out.println("Enter two numbers ");
    Scanner in = new Scanner(System.in);
    x = in.nextInt();
    y = in.nextInt();
    
    z = x + y;
    System.out.println("Sum of two integers: " + z);
    z = x - y ;
    System.out.println("Difference of two integers " + z);
    z = x * y ;
    System.out.println("Product of two integers " + z);
    avg = (float)((x+y)/2);
    System.out.println("Average of two integers " + avg);
    z = x - y ;
    System.out.println("Distance between two integers " + z);
    if (x > y){
    System.out.println("Max integer: " + x );    
    }
    else{
    System.out.println("Max integer: " + y);
    }
    if (x < y){
    System.out.println("Min integer: " + x);
    }
    else{
    System.out.println("Min integer: " + x);
    }
    }
    
}
