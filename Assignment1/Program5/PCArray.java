class Q{
	int[] stack = new int[15];
	int last_pro = 0;
	int last_con = 0;
	int stack_len = 0;

	synchronized void pop(){
		if(stack_len == 0){
			try{ wait(); }
			catch(InterruptedException e){ System.out.println("\nConsumer Interrupted!!!"); }
		}

		System.out.print("\nConsuming:- ");
		while(stack_len != 0){
			stack[last_con] = 0;
			last_con += 1;
			System.out.print(last_con + "\t");
			
			last_con %= stack.length;
			stack_len -= 1;
		}
		notify();
	}

	synchronized void push(){
		if(stack_len == stack.length){
			try{ wait(); }
			catch(InterruptedException e){ System.out.println("\nProducer Interrupted!!!"); }
		}

		System.out.print("\nProducing-> ");
		while(stack_len != stack.length){
			stack[last_pro] = ++last_pro;
			System.out.print(last_pro + "\t");
			
			last_pro %= stack.length;
			stack_len += 1;
		}
		notify();
	}
}

class Producer implements Runnable{
	Q q;

	Producer(Q new_inst){
		q = new_inst;
		new Thread(this, "StackInsert").start();
	}

	public void run(){
		while(true){
			q.push();
		}
	}
}

class Consumer implements Runnable{
	Q q;

	Consumer(Q new_inst){
		q = new_inst;
		new Thread(this, "StackDelete").start();
	}

	public void run(){
		while(true){
			q.pop();
		}
	}
}

class PCArray{
	public static void main(String arg[]){
		Q obj = new Q();

		Producer p_obj = new Producer(obj);
		Consumer c_obj = new Consumer(obj);
	}
}