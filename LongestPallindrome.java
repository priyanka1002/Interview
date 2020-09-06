/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Priyanka.Manish
 */
public class LongestPallindrome {
    
    public static int pallindromLength(String s){
        
        if(s == null || s.length() == 0) return 0;
        
        int res = 0;
        
        Set<Character> set = new HashSet<>();
        
        for(int i =0;i<s.length();i++){
            char t = s.charAt(i);
            
            if(set.contains(t)){
                res = res + 2;
                set.remove(t);
            }else{
                set.add(t);
            }           
            
        }
        if(set.size() >= 1)
            res +=1;
        
    return res;
    }
    
    public static void main(String [] args){
        String s = "abcccdd";
        
        System.out.println("Longest pallindrome is: " + pallindromLength(s));
    }
    
}
