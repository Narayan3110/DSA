package Day4;

public class StackUsingArray {

	int arr[];
	int top = -1;
	int capacity = 0;

	public StackUsingArray(int size) {
		super();
		this.arr = new int[size] ;
		this.top = -1;
		capacity = size ;
	}

	void push(int data) {
		if(isfull()) {
			System.out.println("Stack Overflow !!");
		}
		else {
			arr[++top] = data ;
		}
		
	
	}
	
	void peek() 
	{

		if(isempty()) {
			System.out.println("Stack Empty");
			return ;
		}
		else {
			System.out.println(arr[top]);
		}
	}
	
	void pop() {
		if(isempty()) {
			System.out.println("Stack Empty");
			return ;
		}
		else {
		top--;
		}
	}
	
	boolean isempty() {
		
		return top == -1 ;
	}
	
	boolean isfull()
	{
		return top == capacity-1;
	}

	public static void main(String[] args)
	{
		StackUsingArray s = new StackUsingArray(2);
		s.push(10);
		s.push(30);
		s.push(40);
//		s.pop();
//		s.peek();
		s.peek();

	}

}
