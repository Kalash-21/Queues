package Uni_ds;
//Queue implementation using Array//
import java.util.Scanner;
class Queue{
	private static int front,rear,capacity;
	private static int queue[];
	
	Queue(int a){
	front=rear=0;
	capacity=a;
	queue=new int [capacity];
	}

	static void Enqueue(int x) {
		// TODO Auto-generated method stub
		if(capacity==rear)
		{
			System.out.println("Queue is Full");
			return;
		}
		else {
			queue[rear]=x;
			rear++;
		}
		return;
		
	}

	static void Dequeue() {
		if(rear==front)
		{
			System.out.println("Queue is empty");
			return;
		}
		else {
			for(int i=0;i<rear-1;i++) {
				queue[i]=queue[i+1];
			}
		
		if(rear<capacity)
		{
			queue[rear]=0;
		}
		rear--;
		}
		return;
	}
static void display() {
		// TODO Auto-generated method stub
	if(front==rear)
	{
		System.out.println("Queue is empty");
		return;
	}
	for(int i=front;i<rear;i++)
	{
		System.out.print("  "+queue[i]);
	}
	return;	
	}
	
}
public class QueueWA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("What should be the size of array");
		int n=s.nextInt();
		Queue q= new Queue(n);
		q.display();
		for(int i=0;i<n;i++)
		{
			int x=s.nextInt();
			q.Enqueue(x);
		}
		q.display();
		for(int i=0;i<n;i++)
		{
			q.Dequeue();
		}
		System.out.println();
		q.display();
	}

}
