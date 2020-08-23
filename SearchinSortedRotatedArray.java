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




public class SearchinSortedRotatedArray {
    public static int search(int []nums, int target){
        int left = 0;
        int right = nums.length-1;
        
        if(nums == null || nums.length == 0) return -1;
        
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target)return mid;
            if(nums[left]<=nums[mid]){
            if(nums[left]<= target && nums[mid]>=target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }else{
                if(nums[right]>=target && nums[mid] <= target){
                    right = mid + 1;
                   
                }else{
                    left = mid - 1;
                }
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int [] arr = new int[]{3,4,5,6,1,2,9};
        int search;
        search = search(arr,2);
        System.out.println("Element is at: " + search);
    }
}
