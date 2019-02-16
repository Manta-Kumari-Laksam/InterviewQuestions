
package InterviewQ;



class Node8{
    int data;
    Node8 next;
    Node8(int data){
        this.data=data;
    }
}
class LinkedList8{
    Node8 head; 
    public void insertEnd(int data){
        Node8 node=new Node8(data);
        if(head==null){
            head=node;
        }else{
            Node8 current=head;
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
            Node8 current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    
     public LinkedList8 intersection(Node8 l1,Node8 l2)
     {
         LinkedList8 l3=new LinkedList8();
         Node8 ptr1=l1,ptr2=l2;
         while(ptr1!=null && ptr2!=null)
         {
             if(ptr1.data < ptr2.data)
             {
                 ptr1=ptr1.next;
             }
             else if(ptr2.data < ptr1.data)
             {
                 ptr2=ptr2.next;
             }
             else
             {
                 l3.insertEnd(ptr1.data);
                 ptr1=ptr1.next;
                 ptr2=ptr2.next;
             }
         }
         return l3;
     }
     
}
public class Que8 {
    public static void main(String[] x){
        LinkedList8 l1=new LinkedList8();
        l1.insertEnd(10);
        l1.insertEnd(20);
        l1.insertEnd(30);
        l1.insertEnd(40);
        l1.traverse();
        
        LinkedList8 l2=new LinkedList8();
        l2.insertEnd(5);
        l2.insertEnd(15);
        l2.insertEnd(30);
        l2.insertEnd(40);
        l2.traverse();
        
        System.out.println("List after intersection is:");
        LinkedList8 l3=new LinkedList8();
        l3=l3.intersection(l1.head, l2.head);
        l3.traverse();
    }
}
