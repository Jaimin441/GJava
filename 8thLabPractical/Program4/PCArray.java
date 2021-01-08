class Q{
	int[] buffer = new int[10];
	int last_pro = 0;
	int last_con = 0;
	int buf_len = 0;

	synchronized void get(){
		if(buf_len == 0){
			try{ wait(); }
			catch(InterruptedException e){ System.out.println("\nConsumer Interrupted!!!"); }
		}

		System.out.print("\nConsuming:- ");
		while(buf_len != 0){
			buffer[last_con] = 0;
			last_con += 1;
			System.out.print(last_con + "\t");
			
			last_con %= buffer.length;
			buf_len -= 1;
		}
		notify();
	}

	synchronized void put(){
		if(buf_len == buffer.length){
			try{ wait(); }
			catch(InterruptedException e){ System.out.println("\nProducer Interrupted!!!"); }
		}

		System.out.print("\nProducing-> ");
		while(buf_len != buffer.length){
			buffer[last_pro] = ++last_pro;
			System.out.print(last_pro + "\t");
			
			last_pro %= buffer.length;
			buf_len += 1;
		}
		notify();
	}
}

class Producer implements Runnable{
	Q q;

	Producer(Q new_inst){
		q = new_inst;
		new Thread(this, "Producer").start();
	}

	public void run(){
		while(true){
			q.put();
		}
	}
}

class Consumer implements Runnable{
	Q q;

	Consumer(Q new_inst){
		q = new_inst;
		new Thread(this, "Consumer").start();
	}

	public void run(){
		while(true){
			q.get();
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