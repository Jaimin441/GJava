import java.util.*;
class node
{
	int data;
	node next;

	node()
	{
		data=0;
		next=null;
	}

	node(int d_data)
	{
		data=d_data;
		next=null;
	}

	void append(node new_node)
	{
		node temp;
		temp=this;

		while(temp.next!=null)
			temp=temp.next;
		
		temp.next=new_node;
		
	}

	void display()
	{
		node temp=this;

		while(temp.next!=null)
		{
			System.out.println("node value is\t"+temp.data);		
			temp=temp.next;
		}

		System.out.println("node value is\t"+temp.data);		
	}

	void insert(int d_data,node new_node)
	{
		node temp=this;

		while(temp.data!=d_data)
			temp=temp.next;

		new_node.next=temp.next;
		temp.next=new_node;
	}

}

class LinkList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		node ob[]=new node[10];

		for(int i=0;i<10;i++)
		{
			ob[i]=new node(sc.nextInt());
			if(i>0)
			ob[0].append(ob[i]);
		}

		node n_n=new node(22);


		ob[0].display();
		ob[0].insert(21,n_n);
		ob[0].display();


	}
}