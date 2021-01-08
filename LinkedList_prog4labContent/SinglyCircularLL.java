import java.util.*;

class node{
	int data;
	node next;

	node(){
		data = 0;
		next = this;
	}

	node(int d_data){
		data = d_data;
		next = this;
	}

	//Append node
	void append(node new_node){
		node temp = this;
		while(temp.next != this)temp = temp.next;

		//Braking last node link with 1st node and connecting with new last node
		temp.next = new_node;

		//Setting up the new last node link with 1st node
		new_node.next = this;
	}

	//insert at Nth node
	void insert(int d_data, node new_node){
		node temp = this;

		while(temp.data != d_data) temp = temp.next;

		//All same as done for Linked list. Pretty easy !!!
		new_node.next = temp.next;
		temp.next = new_node;
	}

	int delete(){
		node prev_ptr = this, next_ptr = this.next;
		while(next_ptr.next != this){
			prev_ptr = next_ptr;
			next_ptr = next_ptr.next;
		}

		//Conneting last second link with 1st node thus removing last node
		prev_ptr.next = next_ptr.next;
		return next_ptr.data;
	}

	int delete(int d_data){
		node prev_ptr = this, next_ptr = this.next;
		while(next_ptr.data != d_data){
			prev_ptr = next_ptr;
			next_ptr = next_ptr.next;
		}

		prev_ptr.next = next_ptr.next;
		return next_ptr.data;
	}

	//Display

	void display(){
		node temp = this;
		while(temp.next != this){
			System.out.println("Value = "+temp.data);
			temp = temp.next;
		}
		System.out.println("Value = "+temp.data);
	}
}

class SinglyCircularLL{

	static void print(String str){
		System.out.println(str);
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);
		print("Enter '-1' When done!!!\n");
		print("Enter elements:- ");
		node obj = new node(inp.nextInt());

		while(true){
			node new_node = new node(inp.nextInt());
			if(new_node.data == -1) break;

			obj.append(new_node);
		}

		print("\nDisplaying all elements");
		obj.display();

		node temp = new node(15);
		obj.insert(4, temp);
		print("\nDisplaying elements after Insertion at Nth place");
		obj.display();

		obj.delete(15);
		print("\nDisplaying elements after Deletion at Nth place");
		obj.display();		

		obj.delete();
		print("\nDisplaying elements after Deletion Last node");
		obj.display();
	}
}