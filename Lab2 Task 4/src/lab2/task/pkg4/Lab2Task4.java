/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.task.pkg4;

import java.util.Scanner;

/**
 *
 * Task 4
 */
public class Lab2Task4 {

    public static void main(String[] args) {
    float temp, F;
    Scanner in = new Scanner(System.in);
     
    System.out.println(" Input a degree in Farehnheit: ");
    temp = in.nextInt();
    
    F = ((temp - 32)* 5)/9 ;
    
    System.out.println(temp + " degree Farenheit is equal to " + F + " in Celsius");
    }
}
