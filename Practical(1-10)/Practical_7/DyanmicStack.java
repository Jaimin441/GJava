import java.util.*;

class node{
	int data;
	node next;

	node(){
		data = 0;
		next = null;
	}

	node(int d_data){
		data = d_data;
		next = null;
	}

	void append(node new_node){
		//Assigning top element to temp node for traversal till end;
		node temp = this;
		while(temp.next != null) temp = temp.next;

		temp.next = new_node;
	}

	void display(){
		node temp=this;
		while(temp.next != null){
			System.out.println("Value = "+temp.data);
			temp = temp.next;
		}
		System.out.println("Value = "+temp.data);
	}
	//Insert node after the node having d_data value
	void insertNewNode(int d_data, node new_node){
		node temp = this;
		while(temp.data != d_data)temp = temp.next;

		new_node.next = temp.next;
		temp.next = new_node;

	}

	//Delete the node that has d_data value
	void deleteNthNode(int d_data){
		node temp1 = this;
		node temp2 = this.next;

		while(temp2.data != d_data){
			temp1 = temp2;
			temp2 = temp2.next;
		}

		temp1.next = temp2.next;
	}
}

class DyanmicStack{

	public static void print(String str){
		System.out.println(str);
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		print("\nEnter '-1' when done \n");
		print("Enter Values :- ");
		node obj = new node(inp.nextInt());
		while(true){
			node new_node = new node(inp.nextInt());
			if(new_node.data == -1) break;
			obj.append(new_node);
		}

		print("\nDisplaying element");
		obj.display();

		node temp = new node(15);
		obj.insertNewNode(4, temp);
		print("\nDisplaying element after Insertion");
		obj.display();

		obj.deleteNthNode(15);
		print("\nDisplaying element Deletion");
		obj.display();
	}
}