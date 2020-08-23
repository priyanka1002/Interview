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
class StackImp{
int top;
static final int MAX = 1000;
int a[]= new int[MAX];

boolean isEmpty(){
    if(top == -1){
        return true;
    }
    return false;
}
StackImp(){
    top = -1;
}
boolean push(int x){
    if(top == MAX-1){
        System.out.println("Stack Overflow");
        return false;
    }
    a[++top] = x;
    return true;
}
int pop(){
    if(isEmpty()){
        System.out.println("Stack Underflow");
        return 0;
    } 
      int element = a[top];
      top--;
      return element;
}

int peek(){
    
    if(!isEmpty()){
        return a[top];
    }
    System.out.println("Stack is Empty");
    return -1;
}
}
public class StackImplementation {
    public static void main(String args[]){
        StackImp s = new StackImp();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Element popped : " + s.pop());
        System.out.println("Top element is: " + s.peek());
    }
}
