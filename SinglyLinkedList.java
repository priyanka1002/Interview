/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;
import java.util.LinkedList;
/*
 *
 * @author shriya
 */

 class SinglyLinkedList{
    Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            this.data = d;
        }
    }
    
    public static SinglyLinkedList insert(SinglyLinkedList list, int data){
        Node dummyNode = new Node(data);
        
        if(list.head == null){
            list.head = dummyNode;
        }
        else{
            Node traverseNode = list.head;
            while(traverseNode.next != null){
                traverseNode = traverseNode.next;
            }
            traverseNode.next = dummyNode;
           
        }
        return list;
    }
    public static String delete(SinglyLinkedList list, int data){
        Node tempNode = list.head;
        
        while(tempNode !=null && tempNode.next !=null){
            if(tempNode.next.data == data){
                tempNode.next = tempNode.next.next;
                return "Element is Deleted";
            }
            tempNode = tempNode.next;
        }
        return "Element is not present";
    }
    
    public static void printList(SinglyLinkedList list){
        
        Node traverse = list.head;
        while(traverse != null){
            System.out.println("Current Node: " + traverse.data);
            traverse = traverse.next;
        }
        
    }
    public static void main(String args[]){
    SinglyLinkedList list1 = new SinglyLinkedList();
list1 =  insert(list1, 10);
list1 =  insert(list1, 85);
list1 =  insert(list1, 48);
list1 =  insert(list1, 34);
list1 =  insert(list1, 5);


printList(list1);
System.out.println(delete(list1, 5));
printList(list1);
    
}
}

    

