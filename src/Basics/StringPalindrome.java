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
public class StringPalindrome {
    
    public static void main(String[] args){
        
        String str = "tot";
        String original_string = str;
        String rev = "";
        int len = str.length();
        
        for(int i = len - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
      //  System.out.println(rev);
        
        if(original_string.equals(rev)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
    
}
