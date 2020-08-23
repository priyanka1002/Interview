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
public class QueueImp {
Stack<Integer> s1;
Stack<Integer> s2;

public QueueImp(){
    s1 = new Stack<>();
    s2 = new Stack<>();
    
}
public void push(int x){
    s1.push(x);
}
public int pop(){
    if(s2.isEmpty()){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }
    return s2.pop();
}
 public int peek() {
         if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    
    public static void main(String args[]){
        QueueImp obj = new QueueImp();
        obj.push(5);
        obj.push(54);
        obj.push(29);
        obj.push(47);
        obj.push(435);
        System.out.println("Popped Element is: " + obj.pop());
        System.out.println("Peek Element is: " + obj.peek());
    }
        }
