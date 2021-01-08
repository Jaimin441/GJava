import java.util.*;

class node{
	int data;
	node next, prev;

	node(){
		data = 0;
		next = prev = this;
	}

	node(int d_data){
		data = d_data;
		next = prev= this;
	}

	void append(node new_node){
		node temp = this;

		while(temp.next != this)temp = temp.next;

		temp.next = new_node;
		new_node.next = this;
		this.prev = new_node;
		new_node.prev = temp;
	}

	void insert(int d_data, node new_node){
		node temp = this;
		while(temp.data != d_data)temp = temp.next;

		temp.next.prev = new_node;
		new_node.next = temp.next;
		new_node.prev = temp;
		temp.next = new_node;
	}

	int delete(){
		node temp = this;
		while(temp.next != this)temp = temp.next;

		this.prev = temp.prev;
		temp.prev.next = this;	
		return temp.data;
	}

	int delete(int d_data){
		node temp = this;
		while(temp.data != d_data) temp = temp.next;

		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		return temp.data;
	}

	void display(){
		node temp = this;
		while(temp.next != this){
			System.out.println("Value = "+temp.data);
			temp = temp.next;
		}
		System.out.println("Value = "+temp.data);
	}
}

class DoublyCircularLL{

	public static void print(String str){
		System.out.println(str);
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		print("Enter '-1' When done \n");

		print("Enter values:- ");
		node obj = new node(inp.nextInt());

		while(true){
			node new_node = new node(inp.nextInt());
			if(new_node.data == -1) break;
			obj.append(new_node);
		}

		print("\nDisplaying all Element");
		obj.display();

		node new_node = new node(15);
		obj.insert(4, new_node);
		print("\nDisplaying all Element After Insertion");
		obj.display();

		obj.delete(15);
		print("\nDisplaying all Element After deletion of Nth element");
		obj.display();

		obj.delete();
		print("\nDisplaying all Element after deleting last elements");
		obj.display();
	}
}