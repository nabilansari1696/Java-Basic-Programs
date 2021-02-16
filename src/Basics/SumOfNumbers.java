/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author nabil
 */
public class SumOfNumbers {
    
    public static void main(String[] args){
        
        int num = 1234;
        int sum = 0;
        int rem = 0;
        
        while(num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        
        System.out.println("Sum of digits: "+sum);
    }
    
}
