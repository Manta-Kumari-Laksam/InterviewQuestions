
package InterviewQ;



class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data=data;
    }
}
class LinkedList6{
    Node6 head; 
    public void insertEnd(int data){
        Node6 node=new Node6(data);
        if(head==null){
            head=node;
        }else{
            Node6 current=head;
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
            Node6 current=head;
            while(current !=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    
    public void removeDuplicates()
    {
        Node6 ptr1,ptr2,pprev,delElement;
        for(ptr1=head; ptr1.next!=null ; ptr1=ptr1.next){
            pprev=ptr1;
            for(ptr2=ptr1.next; ptr2!=null ; )
            {
                if(ptr1.data==ptr2.data)
                {
                    delElement=ptr2;
                    pprev.next=delElement.next;
                    delElement.next=null;
                    ptr2=pprev;
                }
                pprev=ptr2;
                ptr2=ptr2.next;
            }
        }
    }
}
public class Que6 {
    public static void main(String[] x){
        LinkedList6 l1=new LinkedList6();
        l1.insertEnd(10);
        l1.insertEnd(20);
        l1.insertEnd(20);
        l1.insertEnd(30);
        l1.insertEnd(40);
        l1.insertEnd(20);
        l1.insertEnd(10);
        l1.traverse();
        
        System.out.println("Elements after removing duplicates:");
        l1.removeDuplicates();
        l1.traverse();
       
    }
}
