/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQ;

import java.util.Scanner;

class Node10{
    int data;
    Node10 prev,next;
    Node10(int data){
        this.data=data;
    }
}
class DoubleList10{
    Node10 head,tail;
    int count=0;
     public int insertend(int data){
        Node10 temp=new Node10(data);
         if(head==null){
            head=temp;
            tail=temp;
        }else{
             temp.prev=tail;
             tail.next=temp;
             tail=temp;             
         }
         count++;
         return count;
    }
    
    public void traverseFwd(){
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node10 current=head;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    
    public void rotation(int pos,int total)
    {
        int rotate=pos%total;
        Node10 current=head;
        if(rotate==0)
            return;
        
        for(int i=0;i<rotate-1;i++)
        {
            current=current.next;
        }
        tail.next=head;
        head.prev=tail;
        head=current.next;
        current.next=null;

    }
 
}
public class Que10 {
    public static void main(String[] x){
        int count=0;
        DoubleList10 l1=new DoubleList10();
        count=l1.insertend(10);
        count=l1.insertend(80);
        count=l1.insertend(50);
        count=l1.insertend(40);
        l1.traverseFwd();
        
//        System.out.println(count);
        Scanner in=new Scanner(System.in);
        int pos=in.nextInt();
        l1.rotation(pos,count);
        l1.traverseFwd();
       
    }
    
}
