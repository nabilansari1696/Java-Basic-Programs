/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

public class FindEvenOdd {
    
    public static void main(String[] args){
        
        int num = 1234;
        int even_count = 0;
        int odd_count = 0;
        int rem = 0;
        
        while(num > 0){
            
            rem = num % 10;
            
            if(rem % 2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
            
            num = num / 10;
        }
        
             
        System.out.println("Number of even digits:"+even_count);
        System.out.println("Number of odd digits:"+odd_count);
       
    }
    
}
