
package InterviewQ;

import java.util.Scanner;


class Node7{
    int data;
    Node7 prev,next;
    Node7(int data){
        this.data=data;
    }
}
class CircularList{
    Node7 head,tail;
    public void traverseClock(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node7 current=head;
            System.out.println("The elements in Clockwise are: ");
            while(current.next!=head)
            {
                System.out.println(current.data);
                current=current.next;
            }
            System.out.println(current.data);
        }
    }
    
    public void insertEnd(int data){
        Node7 node=new Node7(data);
        if(head==null){
           node.prev=node;
           node.next=node;
           head=node;
           tail=node;
        }else{
           tail.next=node;
           node.prev=tail;
           node.next=head;
           head.prev=node;
           tail=node;
            
        }
    }
    public void traverseFrom(int value){
        Node7 current;
        if(head==null)
        {
            System.out.println("List is empty");
        }else if(head.next==head){
            if(head.data==value)
                System.out.println(head);
        }
        else{
                int flag=0;
                current=head;
                Node7 start=null;
                while(current.next!=head){
                    if(current.data==value)
                    {
                        flag=1;
                        start=current;
                        break;
                    }
                    current=current.next;
                   }
                if(current.data==value)
                    {
                        flag=1;
                        start=current;
                    }

                if(flag==1){
                Node7 ptr=start;
                while(ptr.next!=start)
                {
                    System.out.println(ptr.data);
                    ptr=ptr.next;
                }
                System.out.println(ptr.data);
                }else
                {
                System.out.println("Such value doesnt exist in the list");
                }
            }
        }
}
public class Que7 {
    public static void main(String[] x)
    {
        CircularList l1=new CircularList();
        l1.insertEnd(10);
        l1.insertEnd(20);
        l1.insertEnd(30);
        l1.insertEnd(40);
        l1.traverseClock();
        System.out.println("Enter data starting with which rest element should be printed");
        Scanner in=new Scanner(System.in);
        int value=in.nextInt();
        l1.traverseFrom(value);
    }
}
