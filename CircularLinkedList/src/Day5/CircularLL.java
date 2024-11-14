package Day5;

public class CircularLL {

	public static void main(String[] args)
	{
		CircularLL cl = new CircularLL();
		cl.insertAtStart(10);
		cl.insertAtStart(20);
		cl.insertAtStart(30);		
		cl.insertAtStart(40);
		cl.insertAtStart(50);
		cl.insertAtStart(60);
		cl.insertAtStart(70);
	
		cl.deleteAtStart();
		cl.deleteAtStart();
		cl.Display();

	}
	
	Node start;
	
	
	void insertAtStart(int data) {
		Node current = new Node(data);
		if(start == null) {
			start = current;
			start.nxt = start;
			return;
		}else {
			Node temp = start ;
			while(temp.nxt != start) {
				temp = temp.nxt;
			}
			
			temp.nxt = current ;
			current.nxt = start ;
	
		}
	}
	void deleteAtEnd() {
		if(start==null) {
			System.out.println("List is empty");
		}else {
			Node temp=start;
			while(temp.nxt.nxt !=start) {
				temp =temp.nxt;
			}
			
			temp.nxt = start;
			
		}
	}
	
	void deleteAtStart() {
		if(start.nxt == start) {
			start = null;
		}
		else if(start.nxt == null) {
			System.out.println("List is Empty");
		}
		Node temp = start;
		while(temp.nxt != start) {
			temp = temp.nxt;
		}
		temp.nxt = start.nxt;
		 start = start.nxt;
		
		
	}
	void Display() {
		if(start==null) {
			System.out.println("It is empty");
			return;
		}
		else {
			Node temp=start;
			while(true) {
				System.out.print(temp.data + "-- ");
				temp=temp.nxt;
				if(temp == start ) {
					break;
				}
			}
		}
	}


}

class Node{
	int data;
	Node nxt;
	public Node(int data) {
		
		this.data = data;
		this.nxt = null;
	}
}
