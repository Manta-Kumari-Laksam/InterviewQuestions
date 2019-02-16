/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQ;

import java.util.Scanner;

class Node{
    char data;
    Node next;
    Node(char data){
        this.data=data;
    }
}
class LinkedList{
    Node head;
    public void insertEnd(char data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }else{
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=node;
        }
    }
    
     public void insertBeg(char data){
       Node node=new Node(data);
      if(head==null)
      {
          head=node;
      }else{
          node.next=head;
          head=node;
      }
    }
    
     public void traverse(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
     public void CheckPalin(Node l1,Node l2){
//         if(l1==null && l2==null)
//         {
//             System.out.println("List is empty");
//         }
//         else{
//             Node ptr1=l1,ptr2=l2;
//             int flag=1;
//             while(ptr1.next!=null && ptr2.next!=null){
//                 if(ptr1.data!=ptr2.data)
//                 {
//                     flag=0;
//                     break;
//                 }
//                 ptr1=ptr1.next;
//                 ptr2=ptr2.next;
//             }

            Node f=l1,s=l1;
            int flag=1;
            while(f.next!=null){
                f=f.next;
                if(f.next!=null){
                    if(s.data!=l2.data){
                        flag=0;
                        break;
                    }
                    l2=l2.next;
                    s=s.next;
                    f=f.next;
                }
         }
             if(flag==0)
                 System.out.println("Not a palindrome");
             else
                 System.out.println("Is a palindrome");
     }
}

public class Que1 {
    public static void main(String[] x){
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=0;i<num;i++)
        {
            char letter=in.next().charAt(0);
            l1.insertEnd(letter);
            l2.insertBeg(letter);
        }
        l1.traverse();
        l2.traverse();
        
        l1.CheckPalin(l1.head,l2.head);
    }
}
