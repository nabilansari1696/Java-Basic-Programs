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
public class CheckPrime {
    
    public static void main(String[] args){
        
        int num = 7;
        boolean isPrime = true;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" is Prime");
        }
        else
        {
            System.out.println(num+" is not Prime");
        }
    }
    
}
