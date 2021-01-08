import java.util.Scanner;

class node{
	int data;
	node next, prev;

	node(){
		data = -1;
		next = prev = this;
	}
	node(int d_data){
		data = d_data;
		next = prev = this;
	}

	void append(node new_node){
		node temp = this;
		while(temp.next != this){
			temp = temp.next;
		}
		new_node.next = this;
		new_node.prev = temp;
		temp.next = new_node;
	}

	void insert(int d_data, node new_node){
		node temp = this;
		
		while(temp.data != d_data){ temp = temp.next; }
		new_node.next = temp.next;
		new_node.prev = temp;
		temp.next.prev = new_node;
		temp.next = new_node;
	}

	int delete(int d_data){
		node temp = this;
		if(temp.next == this){
			System.out.println("\nEmpty Linked list");
			return -1;
		}
		else{
			while(temp.data != d_data)temp = temp.next;

			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;

			return temp.data;
		}
	}

	void display(){
		node temp = this;

		while(temp.next != this){
			System.out.println("Value => "+temp.data);
			temp = temp.next;
		}
		System.out.println("Value => "+temp.data);
	}	
}

class doublyCircular{
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		System.out.println("Enter '-1' When done!!!");
		System.out.print("Enter the value:- ");
		node obj = new node(inp.nextInt());

		while(true){
			System.out.print("Enter the value:- ");
			node new_obj = new node(inp.nextInt());
			
			if(new_obj.data == -1) break;

			obj.append(new_obj);
		}

		System.out.println("Displaying LL");
		obj.display();

		System.out.println("\nInserting element after 30");
		node new_obj = new node(100);
		obj.insert(30, new_obj);
		System.out.println("Displaying LL after insertion");
		obj.display();		

		System.out.println("\nDeleting the last entered node");
		obj.delete(100);
		
		System.out.println("Displaying LL after Deletion");
		obj.display();				
	}
}