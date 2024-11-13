package Day5;

public class QueueUsingLl {

	Node front;
	Node rear;

	void enqueue(int data) {
		Node current = new Node(data);
		if (front == null) {
			front = current;
			rear = current;
		} else {
			rear.next = current;
			rear = current;
		}
	}
	void dequeue () {
		if(front == null) {
			System.out.println("Stack is empty");
		}
		
		else {
			if(front.next == null) {
				front=null;
			}
			
			if(front.next !=null) {
				front = front.next;
			}
		}
	}

	void display() {
		if (front == null) {
			System.out.println("Empty");
		} else {
			Node temp = front;
			while (temp != null) {
				System.out.print(temp.data +"--");
				temp = temp.next;
			}

		}
	}

	public static void main(String[] args) {
		QueueUsingLl ql = new QueueUsingLl();
		ql.enqueue(10);
		ql.enqueue(20);
		ql.enqueue(30);
		
		ql.dequeue();
		ql.display();

	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {

		this.data = data;
		this.next = null;
	}
}