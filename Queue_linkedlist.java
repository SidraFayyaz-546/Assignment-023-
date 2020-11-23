
package queue_linkedlist;


public class Queue_linkedlist {

    
    public static void main(String[] args) {
        QLL queuelist=new QLL();
         queuelist.enqueue(1);
        queuelist.enqueue(2);
        queuelist.enqueue(3);
        queuelist.enqueue(4);
        queuelist.enqueue(5);
        System.out.println("Dispaly the complete Queue:");
        queuelist.display();
        System.out.println("First value of Queue:");
        queuelist.peek();
        queuelist.dequeue();
        System.out.println("Display the queue after dequeue the elemnt of Queue:");
        queuelist.display();
        System.out.println("Again call the peek function:");
        queuelist.peek();
    }
    
}
class node{
    int data;
    node next;
}
class QLL{
    node front=null;
    node rear=null;
    
    public void enqueue(int data){
        node new_node=new node();
        new_node.data=data;
        new_node.next=null;
        
        if(front==null&&rear==null){
            front=new_node;
            rear=new_node;
        }
        else{
            rear.next=new_node;
            rear=new_node;
        }
        
    }
    public void dequeue(){
        if(front==null&&rear==null){
            System.out.println("Queue is empty.");
        }
        else{
            front=front.next;
        }
    }
    public void peek(){
        if(front==null&&rear==null){
            System.out.println("Queue is empty.");
        }
        else{
            System.out.println(" "+front.data);
        }
    }
    public void display(){
        node curr=front;
        do{
            System.out.println(" "+curr.data);
            curr=curr.next;
        }while(curr!=null);
    }
}