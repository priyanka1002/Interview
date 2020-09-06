/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
//import java.math.*;
/**
 *
 * @author Priyanka.Manish
 */
public class HouseRobber {
    public static int amountRob(int[] nums){
        
        if(nums == null || nums.length == 0) return 0;
        
        if(nums.length == 1) return nums[0];
        
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        
        int [] dp = new int[nums.length];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        
        for(int i = 2; i<nums.length ; i++){
            dp[i] = Math.max(nums[i] + dp[i-2],dp[i-1]);
        }
        
        return dp[nums.length -1];
    }
    
    public static void main(String[] args){
        int [] num = new int[]{1,27,3,10};
   //     int[] amountRob;
     //   num[] = {1,3,2,1};

     
     int x = amountRob(num);
        System.out.println("Max Amount is: " + x );
    }
}
