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
public class SwapNumber {
    
    public static void main(String[] args){
        
        int a = 10;
        int b = 50;
        int temp = 0;
        
        System.out.println("Before swap "+a+" "+b);
        
        temp = a;
        a = b;
        b = temp;
        
         
        System.out.println("After swapping "+a+" "+b);
    }
    
}
