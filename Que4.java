/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQ;

class Node4{
    int data;
    Node4 prev,next;
    Node4(int data){
        this.data=data;
    }
}
class DoubleList4{
    Node4 head,tail;
    
     public void insertend(int data){
        Node4 temp=new Node4(data);
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
            Node4 current=head;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    
    public void deleteAlternate(){
        if(head==null)
            System.out.println("Empty list");
        else if(head.next==head)
            System.out.println("Single element.Invalid deletion of alternate node");
        else{
            Node4 current=head;
            while(current!=null && current.next!=null){
                Node4 delElement=current.next;
                current.next=delElement.next;
//                delElement.next.prev=current;
                current=delElement.next;
            }
        }
    }
    
}
public class Que4 {
    public static void main(String[] x){
        DoubleList4 l1=new DoubleList4();
        l1.insertend(10);
        l1.insertend(20);
        l1.insertend(30);
        l1.insertend(40);
//        l1.insertend(50);
        l1.traverseFwd();
        
        System.out.println("Element after deleting alternate node are:");
        l1.deleteAlternate();
        l1.traverseFwd();
    }
    
}
