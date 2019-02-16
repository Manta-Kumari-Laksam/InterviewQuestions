/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQ;

/**
 *
 * @author DELL
 */
class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
    }
}
class LinkedList3{
    Node3 head; 
    public void insertEnd(int data){
        Node3 node=new Node3(data);
        if(head==null){
            head=node;
        }else{
            Node3 current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=node;
        }
    }
    
     public void traverse(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node3 current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
     public void insertloop(){
         
         head.next.next.next=head.next;
     }
     
     public void detectloop(){
         Node3 current=head;
         int flag=1;
//         while(current.next!=null)
//         {
//             if(current.next==head){
//                 flag=0;
//                 break;
//             }
//             current=current.next;
//         }

        Node3 s=head,f=head.next;
        
        while(f!=null && f.next!=null && f!=s)
        {
            s=s.next;
            f=f.next.next;
        }
       System.out.println(s.data);
       System.out.println(f.data);
        if(f==s)
        {
             System.out.println("Loop Exixts");
         }
         else
             System.out.println("Loop Doesnt Exixts");
//         if(flag==0)
//         {
//             System.out.println("Loop Exixts");
//         }
//         else
//             System.out.println("Loop Doesnt Exixts");
     }
}
public class Que3 {
    public static void main(String[] x){
        LinkedList3 l1=new LinkedList3();
        l1.insertEnd(10);
        l1.insertEnd(20);
        l1.insertEnd(30);
        l1.insertEnd(40);
        l1.traverse();
//        l1.insertloop();
        l1.detectloop();
    }
}
