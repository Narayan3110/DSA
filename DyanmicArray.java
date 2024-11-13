package Day5;

public class DyanmicArray {
	int arr[];
	int capacity = 2;
	int presentEle = 0;

	public DyanmicArray() {
		super();
		this.arr = new int[capacity];

		this.presentEle = 0;
	}

	void add(int data) {
		int temp[];
		if(presentEle == capacity-1) {
			  temp = new int[2*capacity];
			for(int i = 0 ; i<capacity ; i++) {
				temp[i] = arr[i];
			}
			
			arr = temp;
			capacity = 2* capacity ;
			
		}
		
		arr[presentEle] = data;
		presentEle++;
		
	}
	
	void display() {
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}

	public static void main(String[] args)
	{
		DyanmicArray da = new DyanmicArray();
		da.add(10);
		da.add(20);
		da.add(30);
		da.add(30);
		
		da.display();
	}
}
