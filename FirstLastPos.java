/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author shriya
 */
public class FirstLastPos {
     public static int[] findRange(int[] nums, int target) {
        
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        
        int left = 0;
        int right = nums.length - 1;
        
        int leftMost    = searchLeft(nums,target);
        int rightMost   = searchRight(nums,target);
        
        return new int[]{leftMost,rightMost};
    }
    
    private static int searchLeft(int[] nums,int target){
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target){
                while(mid >= 0 && nums[mid] == target){
                    mid = mid -1;
                }
                
                return mid + 1;
            }
            
            if(nums[mid] < target){
                left =  mid + 1;
            }else{
                right = mid -1;
            }
        }
        
        return -1;
    }
    
    
    private static int searchRight(int[] nums,int target){
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            
            int mid = left + (right - left)/2;
            
            if(nums[mid] == target){
                while(mid <= right && nums[mid] == target){
                    mid = mid + 1;
                }
                
                return mid - 1;
            }
            
            if(nums[mid] < target){
                left =  mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int [] arr = new int[]{3,4,4,4,4,5,8,8,8,9};
        // findRange(arr,4);
        int []range = findRange(arr,4);
        
        for(int i=0;i<range.length;i++){
        System.out.println("Element is at: "+range[i]);
    }}
}
