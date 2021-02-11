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
public class CountNumbers {
    
    public static void main(String[] args){
        
        int number = 2345;
        int count = 0;
        
        while(number > 0){
            number = number / 10;
            count++;
        }
        System.out.println("Number of digit: "+count);
    }
}
