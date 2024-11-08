package LinkedList;

 class Node {

	int data;
	Node next;

	public Node(int data) {

		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
		Node head; // Making Head of LinkedList
		
		// Insert At End
		public void insertEnd(int data) {

			Node newNode = new Node(data);
			if (head == null) // Check for Head Exists Or Not
			{
				head = newNode;
			} else {
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = newNode;

			}
		}
		//Display LinkedList
		public void display() {
			Node current = head ;
			while(current !=null) {
				System.out.print(current.data +"--");
				current = current.next ;
			}
			System.out.println("Lawda Mera");
			
		}
		public void delete(int data) {
			Node current = head ;
			while(current.next != null) {
//				Node prev = current ;
				if(current.next.data ==data) {
					current.next = current.next.next ;
					break ;
				}
				current = current.next ;
			}
			
		}
		public static void main(String[] args) {
			
			LinkedList list = new LinkedList();
			list.insertEnd(10);
			list.insertEnd(20);
			list.insertEnd(30);
			list.insertEnd(40);
			list.insertEnd(50);
			
//			list.display();
			
//			list.delete(30);
			
			list.display();
			
			list.delete(10);
			
			list.display();
		}

	}

