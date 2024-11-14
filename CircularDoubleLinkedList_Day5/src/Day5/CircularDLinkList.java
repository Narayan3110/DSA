package Day5;

public class CircularDLinkList 
{
	
	public static void main(String[] args) {
		
	}
	
	Node start;
	void insertAtStart(int data) {
		Node current = new Node(data);
		if(start == null) {
			
			System.out.println("List is empty");
			current.next = current;
			current.prev = current;
			start =current;
		}else {
			Node temp = start;
			while()
		}
	}

	
}

class Node{
	int data;
	Node next;
	Node prev;
	
	public Node(int data) {
		
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}