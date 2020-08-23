/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;
import java.util.Stack;


/**
 *
 * @author shriya
 */

class min{
   Stack<Integer> s1;
   Stack<Integer> s2;
    
   int glblmin;
   
   public min(){
       s1 = new Stack<>();
       s2 = new Stack<>();
       glblmin = Integer.MAX_VALUE;
       s2.push(glblmin);
   }
   
   public void push(int x){
       int currentMin = s2.peek();
       if(glblmin > x){
           currentMin = x;
           glblmin = x;
       }
       s2.push(currentMin);
       s1.push(x);
   }
   
   public void pop(){
       int popElement = s1.pop();
       s2.pop();
       if(glblmin >= popElement){
           glblmin = s2.peek();
       }
   }
   public int top(){
       if(!s1.isEmpty()) return s1.peek();
       
       return -1;
   }
   public int getMin(){
       return glblmin;
   }
}
public class MinStack {
 public static void main (String args[]){
     
    min obj = new min();
    obj.push(23);
    obj.push(4);
    obj.push(10);
    obj.push(-2);
    System.out.println("Minimum element is: " + obj.getMin());
    obj.pop();
    System.out.print("Top: " + obj.top());
 //   System.out.println("Popped: " + obj.pop());
}
}
