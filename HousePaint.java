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
public class HousePaint {
    
    public static int paintCost(int[][] cost){
        if(cost == null || cost.length == 0)
        return 0;
        
        for(int i = 1 ;i<cost.length; i++){
            cost[i][0] += Math.min(cost[i-1][1],cost[i-1][2]);
              cost[i][1] += Math.min(cost[i-1][0],cost[i-1][2]);
                cost[i][2] += Math.min(cost[i-1][1],cost[i-1][0]);
        }
        return Math.min(Math.min(cost[cost.length-1][0], cost[cost.length-1][1]),cost[cost.length-1][2]);
    }
    
    public static void main(String args[]){
        int paint[][] = {{17,2,17},{16,16,5},{14,3,19}};
        System.out.println("Minimum cost is: " + paintCost(paint));
    }
}
