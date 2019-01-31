/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.task.pkg3;

import java.util.Scanner;

/**
 *
 Task 3
 */
public class Lab2Task3 {

  
    public static void main(String[] args) {
        int x, y ;
        
        System.out.println("Enter two numbers ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        
        if(x > y){
            System.out.println(x + " is greater than " + y);
        }
        else if (x < y){
            System.out.println(x + " is less than " + y);
        }
        else{
            System.out.println(x + " is equal to" + y);
        }
    }
    
}
