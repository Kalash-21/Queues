package Uni_ds;
//Queue implemetation using Linked List
class Nodes { 
    int key; 
    Nodes next; 
  
    public Nodes(int key) 
    { 
        this.key = key; 
        this.next = null; 
    } 
} 
  
 
class Q { 
    Nodes front, rear; 
  
    public Q() 
    { 
        this.front = this.rear = null; 
    } 
  
   
    void enqueue(int key) 
    { 
  
       
        Nodes temp = new Nodes(key); 
  
 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return; 
        } 
  
      
        this.rear.next = temp; 
        this.rear = temp; 
    } 
  
    
    void dequeue() 
    { 
        if (this.front == null) 
            return; 
  
        Nodes temp = this.front; 
        this.front = this.front.next; 
  
        
        if (this.front == null) 
            this.rear = null; 
    } 
} 
   
public class QueueWL { 
    public static void main(String[] args) 
    { 
        Q q = new Q(); 
        q.enqueue(7); 
        q.enqueue(5);
        q.enqueue(3);
        System.out.println("Queue Front =" + q.front.key); 
        System.out.println("Queue Rear =" + q.rear.key); 
        q.dequeue(); 
        q.dequeue();
        q.dequeue();
        q.enqueue(30); 
        q.enqueue(40);  
        System.out.println("Queue Front =" + q.front.key); 
        System.out.println("Queue Rear =" + q.rear.key); 
    } 
} 
