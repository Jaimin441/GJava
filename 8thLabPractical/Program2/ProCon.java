class Q{
	int n;

	synchronized void get(){
		System.out.println("Got:= " + n);
	}

	synchronized void put(int n){
		this.n = n;
		System.out.println("Put-> " + this.n);
	}
}

class Producer implements Runnable{
	Q obj;

	Producer(Q new_inst){
		obj = new_inst;
		new Thread(this, "Producer").start();
	}

	public void run(){
		int i = 0; 
		while(true){
			obj.put(i);
			i+=1;
		}
	}
}

class Consumer implements Runnable{
	Q obj;

	Consumer(Q new_inst){
		obj = new_inst;
		new Thread(this, "Consumer").start();
	}

	public void run(){
		while(true){
			obj.get();
		}
	}
}

class ProCon{
	public static void main(String arg[]){
		Q obj = new Q();
		Producer p_obj = new Producer(obj);
		Consumer c_obj = new Consumer(obj);

		System.out.println("Press 'Ctrl+C' to EXIT");
	}
}