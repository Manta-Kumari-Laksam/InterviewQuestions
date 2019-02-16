/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQ;

import java.util.Scanner;

class Node9{
    int data;
    Node9 prev,next;
    Node9(int data){
        this.data=data;
    }
}
class DoubleList9{
    Node9 head,tail;
     public void insertend(int data){
        Node9 temp=new Node9(data);
         if(head==null){
            head=temp;
            tail=temp;
        }else{
             temp.prev=tail;
             tail.next=temp;
             tail=temp;             
         }
    }
    
    public void traverseFwd(){
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node9 current=head;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    
    public void cloneList(Node9 l1,Node9 l2){
        
        Node9 current=l1;
        while(current!=null){
            insertend(current.data);
            current=current.next;
        }
        
    }
    
}
public class Que9 {
    public static void main(String[] x){
        DoubleList9 l1=new DoubleList9();
        l1.insertend(10);
        l1.insertend(20);
        l1.insertend(30);
        l1.insertend(40);
        l1.traverseFwd();        
       
        System.out.println("Clone list: ");
        DoubleList9 l2=new DoubleList9();
        l2.cloneList(l1.head,l2.head);
        l2.traverseFwd();
    }
    
}
