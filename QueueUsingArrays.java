package Day5;

public class QueueUsingArrays {
	int arr[];
	int front = -1 ;
	int rear = -1 ;
	

	public QueueUsingArrays(int size) {
		super();
		this.arr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	void enqueue(int data) {
		if(rear == arr.length -1) {
			System.out.println("Queue Fulll");
		}else {
			if(front == rear) {
				front = 0 ; 
				++rear; 
			}else {
				rear++ ;
			}
			arr[rear]= data ;
//			System.out.println("Element Added ");
		}
		
	}
	
	void dequeue() {
		if(front == -1 && rear ==-1) {
			System.out.println(" Queue Khali hai");
		}else {
			System.out.println(arr[front]+ "is poped");
			front++;
		}
	}
	void display() {
		int test = front ;
		for(int i =test ; i< rear ;i++) {
			System.out.print(arr[i]+" ");
		}
	}


	public static void main(String[] args)
	{
		QueueUsingArrays qa = new QueueUsingArrays(5);

		
		System.out.println("***********");
		qa.dequeue();
		qa.display();
	}

}
