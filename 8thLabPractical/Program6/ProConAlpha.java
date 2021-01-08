class Q{
	char n;
	boolean valueConsumed = true;
	boolean valueProduced = false;

	synchronized void get(){
		if(!valueProduced){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Conusmer Interrupted");
			}
		}

		System.out.println("GET:- " + n);
		valueConsumed = true;
		valueProduced = false;
		notify();
	}

	synchronized void put(int n){
		if(!valueConsumed){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Producer Interrupted");
			}
		}

		this.n = (char)n;
		System.out.println("Put:- " + this.n);

		valueProduced = true;
		valueConsumed = false;
		notify();

	}
}

class producer implements Runnable{
	Q q;

	producer(Q new_inst){
		q = new_inst;
		new Thread(this, "Producer").start();
	}

	public void run(){
		int i = 0;
		while(true){
			q.put((i+65));
			i+=1;
			i %= 26;
		}
	}
}

class consumer implements Runnable{
	Q q;

	consumer(Q new_inst){
		q = new_inst;
		new Thread(this, "Consumer").start();
	}

	public void run(){
		while(true){
			q.get();
		}
	}
}

class ProConAlpha{
	public static void main(String arg[]){
		Q obj = new Q();
		producer p_obj = new producer(obj);
		consumer c_obj = new consumer(obj);

		System.out.println("Press 'Ctrl + C' To exit");
	}
}