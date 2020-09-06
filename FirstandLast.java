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
public class FirstandLast {
    
    public static int[] range(int [] nums,int target){
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        
        int left  = 0;
        int right = nums.length - 1;
        int leftMost = searchLeft(nums,target);
        int rightMost = searchRight(nums,target);
        
        return new int[]{leftMost,rightMost};
    }
    
    

    private static int searchLeft(int[] nums, int target) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int left = 0;
    int right = nums.length -1;
    
    while(left<= right){
        int mid = left + (right-left)/2;
        
        if(nums[mid] == target){
            while(mid >= 0 && nums[mid] == target){
                mid = mid - 1 ;
            }
            return mid + 1;
        }
        if(nums[mid] < target){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    return -1;
    }

    private static int searchRight(int[] nums, int target) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    int left = 0;
    int right = nums.length -1;
    
    while(left<= right){
        int mid = left + (right-left)/2;
        
        if(nums[mid] == target){
            while(mid <= nums.length - 1 && nums[mid] == target){
                mid = mid + 1 ;
            }
            return mid - 1;
        }
        if(nums[mid] < target){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    return -1;
    }
    
    public static void main(String[] args){
        int num[] = {1};
        int target = 1;
        int res[] = range(num,target);
        System.out.println("Range is: " + res[0]+"," + res[1]);
    }
}
