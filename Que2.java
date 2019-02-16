/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQ;

class NodeD{
    int data;
    NodeD prev;
    NodeD next;
    NodeD(int data){
        this.data=data;
    }
}
class DoubleList{
    NodeD head;
    NodeD tail;
    
     public void insertend(int data){
        NodeD temp=new NodeD(data);
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
            NodeD current=head;
            while(current!=null)
            {
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    public void sort()
    {
        NodeD ptr1;
        NodeD ptr2;
        for(ptr1=head ; ptr1.next!=null; ptr1=ptr1.next){
            for(ptr2=ptr1.next ; ptr2!=null ; ptr2=ptr2.next){
                if(ptr1.data > ptr2.data)
                {
                    int temp=ptr1.data;
                    ptr1.data=ptr2.data;
                    ptr2.data=temp;
                }
            }
        }
    }
}
public class Que2 {
    public static void main(String[] x){
        DoubleList l1=new DoubleList();
        l1.insertend(10);
        l1.insertend(80);
        l1.insertend(50);
        l1.insertend(40);
        
        l1.traverseFwd();
        l1.sort();
        System.out.println("Element in sorted order are: ");
        l1.traverseFwd();
    }
    
}
