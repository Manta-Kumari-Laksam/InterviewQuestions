
package InterviewQ;



class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data=data;
    }
}
class LinkedList5{
    Node5 head; 
    public void insertEnd(int data){
        Node5 node=new Node5(data);
        if(head==null){
            head=node;
        }else{
            Node5 current=head;
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
            Node5 current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    
     public LinkedList5 merge(Node5 l1,Node5 l2)
     {
         LinkedList5 l3=new LinkedList5();
         Node5 ptr1=l1,ptr2=l2;
         while(ptr1!=null && ptr2!=null)
         {
             if(ptr1.data < ptr2.data)
             {
                 l3.insertEnd(ptr1.data);
                 ptr1=ptr1.next;
             }
             else if(ptr2.data < ptr1.data)
             {
                 l3.insertEnd(ptr2.data);
                 ptr2=ptr2.next;
             }
             else
             {
                 l3.insertEnd(ptr1.data);
                 ptr1=ptr1.next;
                 ptr2=ptr2.next;
             }
         }
         while(ptr1!=null)
         {
              l3.insertEnd(ptr1.data);
              ptr1=ptr1.next;
         }
         while(ptr2!=null)
         {
              l3.insertEnd(ptr2.data);
              ptr2=ptr2.next;
         }
         return l3;
     }
     
}
public class Que5 {
    public static void main(String[] x){
        LinkedList5 l1=new LinkedList5();
        l1.insertEnd(10);
        l1.insertEnd(20);
        l1.insertEnd(30);
        l1.insertEnd(40);
        l1.traverse();
        
        LinkedList5 l2=new LinkedList5();
        l2.insertEnd(5);
        l2.insertEnd(15);
        l2.insertEnd(25);
        l2.insertEnd(35);
        l2.insertEnd(45);
        l2.insertEnd(55);
        l2.traverse();
        
        LinkedList5 l3=new LinkedList5();
        l3=l3.merge(l1.head,l2.head);
        l3.traverse();
    }
}
