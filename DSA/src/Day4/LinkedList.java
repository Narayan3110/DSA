package Day4;

import java.util.Scanner;

public class LinkedList {
	static LinkedList ll = new LinkedList();

	public static void main(String[] args) {

//		LinkedList ll = new LinkedList();

//		ll.insertAtBegin(10);
//		ll.insertAtBegin(20);

//		ll.displayList();
//		System.out.println();

//		ll.insertAtEnd(99);

//		ll.displayList();
//		System.out.println();
boolean check = true ;
Scanner sc = new Scanner(System.in);

	while(check) {
		System.out.println("Enter the choice \nInsert : 1 Begin\t2End\t3After\n4:Display \n5:Delete First \n6:Exit... ");
		int choice = sc.nextInt() ;
		switch(choice) {
		case 1 : System.out.print("Enter The Data :");
		int a = sc.nextInt();
			ll.insertAtBegin(a);
			break ;
		case 2 :System.out.print("Enter The Data :");
		int b = sc.nextInt();
		ll.insertAtEnd(b);
		break ;
		case 3 : System.out.print("Enter The Data and After :");
		int c = sc.nextInt();int d = sc.nextInt();
		ll.insertAfter(c, d);
		break ;
		case 4 : ll.displayList();
		break ;
		case 5: ll.deletebegin();
		break;
		case 6 :
			check = false ;
			break ;
			
		
		}
	}

	}

	Node head;

	void displayList() {
		if (head == null) {
			System.out.println("List is Empty !!!");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + "--->");
				temp = temp.next;
			}
		}
	}

	void insertAtBegin(int data) {

		Node current = new Node(data);
		if (head == null) {
//			System.out.println(data);
			current.data = data;
			current.next = null;
			head = current;
			return;
		}

		else {
			current.data = data;
			current.next = head;
			head = current;
		}
	}

	void insertAtEnd(int data) {
//		LinkedList ll1 = new LinkedList();

		Node newnode = new Node(data);
		if (head == null) {
			System.out.println("Empty List Ading new");
			ll.insertAtBegin(data);
		}

		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newnode;
			newnode.data = data;
			newnode.next = null;
		}
	}

	void insertAfter(int data, int value) {
//		LinkedList ll = new LinkedList();

		
		if (head == null) {
			System.out.println("Empty List Ading new");
			ll.insertAtBegin(data);


		}

		else {
			Node newnode = new Node(data);
			Node temp = head;
			while (temp.next != null && temp.data != value) {
				temp = temp.next;
			}
			newnode.data = data;
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}
	
	
	void deletebegin() {
		if (head==null) {
			System.out.println("List is empty");
		}
		else {
			 head = head.next;
		}
	}
	
//	void deleteend() {
//		if(head==null) {
//			System.out.println("List is empty");
//		}
//		
//		else {
//			int temp = head;
//		}
//	}
//
//}

class Node {
	int data;
	Node next;

	public Node(int data) {

		this.data = data;
		this.next = null;
	}
}
}
