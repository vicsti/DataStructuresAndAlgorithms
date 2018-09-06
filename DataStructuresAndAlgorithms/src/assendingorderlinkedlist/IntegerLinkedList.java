package assendingorderlinkedlist;

public class IntegerLinkedList {
	IntegerNode head;
	
	public IntegerLinkedList(Integer num) {
		IntegerNode node = new IntegerNode(num);
		head=node;
		head.next=null;		
	}
	
	public void addInAssending(Integer num) {
		IntegerNode node = new IntegerNode(num);
		IntegerNode start = head;
		IntegerNode prev=start;
		
		while(start != null && start.num < node.num) {
			prev = start;
			start=start.next;			
		}
		if (prev == start) {
		node.next=start;
		head=node;	
		} else if (start == null) {
			prev.next=node;
			node.next=null;
		}else{
			node.next=start;
			prev.next=node;
		}
		

	}
	
	public void printList() {
		IntegerNode start = head;
		while(start != null) {
			System.out.print(" ");
			start.printNode();
			start=start.next;			
		}
		
	}
}
