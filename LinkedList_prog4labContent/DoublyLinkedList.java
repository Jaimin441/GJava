import java.util.*;

class node{
	int data;
	node next, prev;

	node(){
		data = 0;
		next = prev = null;
	}
	node(int d_data){
		data = d_data;
		next = prev = null;
	}

	void append(node new_node){
		node temp = this;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = new_node;
		new_node.prev = temp;
	}

	//Inserting new node after the node having value equal to d_data
	void insertNode(int d_data, node new_node){
		node temp = this;
		while(temp.data != d_data)temp = temp.next;

		new_node.next = temp.next;
		new_node.prev = temp;
		if(temp.next != null){
			temp.next.prev = new_node;
		}
		temp.next = new_node;

	}
	//Deleting node after a given node;
	void delete(int d_data){
		node temp = this;
		while(temp.data != d_data){
			temp = temp.next;
		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
	}

	//Deleting last node
	void delete(){
		node temp = this;
		while(temp.next != null) temp = temp.next;
		temp.prev.next = null;
		temp.prev = null;
	}

	//Displaying node
	void display(){
		node temp = this;
		while(temp.next != null){
			System.out.println("Value = "+temp.data);
			temp = temp.next;
		}
		System.out.println("Value = "+temp.data);
	}
}

class DoublyLinkedList{

	public static void print(String str){
		System.out.println(str);
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		print("Enter '-1' When done \n");
		print("Enter value :- ");
		node obj = new node(inp.nextInt());

		while(true){
			node new_node = new node(inp.nextInt());
			if(new_node.data == -1) break;
			obj.append(new_node);
		}

		print("Displaying All element");
		obj.display();

		node temp = new node(15);
		obj.insertNode(4, temp);
		print("\nDisplaying element after Insertion at N");
		obj.display();		

		obj.delete(15);
		print("\nDisplaying element after deletetion at N");
		obj.display();

		print("\nDisplaying element after Deleting last node");
		obj.delete();
		obj.display();				
	}
}