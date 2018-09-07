package queues;

import java.util.NoSuchElementException;

public class ArrayQueues {
	
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueues(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void add(Employee emp) {
		if((back == queue.length && front == 0)) {
			Employee[] temp = new Employee[2*queue.length];
			System.arraycopy(queue, 0, temp, 0, queue.length);
			queue = temp;
		}
		if(back == queue.length && front > 0) {
			back=0;
		}
		if(back==front && back>0) {
			Employee[] temp = new Employee[2*queue.length];
			System.arraycopy(queue, front, temp, 0, queue.length-front);
			System.arraycopy(queue, 0, temp, queue.length-front, back);
			back=queue.length;
			queue=temp;
			front=0;
		}
		queue[back] = emp;
		back++;
	}
	
	public Employee remove() {
		if (size()==0) {
			throw new NoSuchElementException();
		}
		Employee emp = queue[front];
		queue[front]=null;
		front++;
		if(size()==0) {
			front=back=0;
		}
		return emp;		
	}
	
	public Employee peek() {
		if (size()==0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public int size() {
		int size=0;
		if(back>front) {
			size= (back - front);			
		} else if(front > back) {
			size= (queue.length - front + back);
		}
		return size;
	}
	
	public void printQueue() {
		if(front<back) {
		for (int i=front; i<back;i++) {
			System.out.println(queue[i]+" "+i);
		}
		} else {
			for(int i=front;i<queue.length;i++) {
				System.out.println(queue[i]+" "+i);				
			}
			for(int i=0;i<back;i++) {
				System.out.println(queue[i]+" "+i);				
			}
		}
	}

}
