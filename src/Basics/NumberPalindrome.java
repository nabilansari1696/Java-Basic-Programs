/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

import java.util.Scanner;

public class NumberPalindrome {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;
        int original_number = num;
        
        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        
        if(original_number == rev){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
        
    }
    
}
