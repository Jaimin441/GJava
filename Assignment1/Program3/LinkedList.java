import java.util.*;

class nodell{
	int data;
	nodell next;

	nodell(){
		data = -1;
		next = null;
	}
	nodell(int d_data){
		data = d_data;
		next = null;
	}

	void append(nodell new_node){
		nodell temp = this;
		while(temp.next != null) temp = temp.next;
		temp.next = new_node;
	}

	void insert(int d_data, nodell new_node){
		nodell temp = this;
		while(temp.data != d_data) temp = temp.next;
		
		new_node.next = temp.next;
		temp.next = new_node;
	}

	int delete(int d_data){
		if(this.next == null){
			int val = this.data;
			this.data = -1;
			return val;
		}
		else{
			nodell prev_node = this, next_node = this.next;
			while(next_node.data != d_data){
				prev_node = next_node;
				next_node = next_node.next;
			}
			prev_node.next = next_node.next;
			return next_node.data;
		}

	}

	public int search(int val){
		nodell temp = this;
		int cnt = 0;
		while(temp.next != null && temp.data != val) {
			temp = temp.next;
			cnt += 1;
		}

		if(temp.next == null) return -1;
		else return cnt;
	}

	void display(){
		nodell temp = this;
		while(temp != null){
			System.out.println("Value = " + temp.data);
			temp = temp.next;
		}
	}
}

class LinkedList{

	static void print(String str){
		System.out.println(str);
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		print("Enter '-1' When done !!");
		print("\nEnter values:- ");
		nodell obj = new nodell(inp.nextInt());

		while(true){
			nodell new_obj = new nodell(inp.nextInt());
			if(new_obj.data == -1) break;
			obj.append(new_obj);
		}

		print("\nDisplaying Elements");
		obj.display();

		nodell temp = new nodell(15);
		obj.insert(4, temp);
		print("\nDisplaying Elements after insertion at Nth posisition");
		obj.display();

		obj.delete(15);
		print("\nDisplaying Elements after Deletion at Nth posisition");
		obj.display();		

		System.out.println("\nThe positoion of 2 is at " + obj.search(2));
	}
}