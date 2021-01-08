class Q{
	int[] buffer = new int[10];
	int buf_len = 0;
	int last_con = 0;
	int last_pro = 0;

	synchronized void get(String name){
		
		if(buf_len == 0){
			try{ wait(); }
			catch(InterruptedException e){ System.out.println(name + " Interrupted!!!"); }
		}	

		System.out.print("\n"+name+" Consuming:- ");
		while(buf_len != 0){
			last_con %= buffer.length;
			buffer[last_con] = 0;
			
			System.out.print((last_con+1 ) + " ");
			last_con = (last_con + 1);
			buf_len -= 1;
		}
		System.out.println("\n " + name + " Notifying ");
		notify();
	}

	synchronized void put(){
		if(buf_len == buffer.length){
			try{ wait(); }
			catch(InterruptedException e){ System.out.println("Producer Interrupted!!!"); }
		}

		System.out.print("\nProducing:- ");
		while(buf_len != buffer.length){
			last_pro %= buffer.length;
			buffer[last_pro] = ++last_pro;
			
			System.out.print(last_pro + " ");
			buf_len += 1;
		}
		notify();
	}
}

class Producer implements Runnable{
	Q q_obj;
	Thread t;
	
	Producer(Q new_inst, int priority){
		q_obj = new_inst;
		t = new Thread(this, "Producer");
		t.setPriority(priority);
		t.start();
	}

	public void run(){
		while(true){
			q_obj.put();
		}
	}
}

class Consumer implements Runnable{
	Q q_obj;
	Thread t;
	String name;
	Consumer(Q new_inst, String d_name, int priority){
		q_obj = new_inst;
		name = d_name;
		t = new Thread(this, name);
		t.setPriority(priority);
		t.start();
	}

	public void run(){
		while(true){
			q_obj.get(name);
		}
	}
}

class p1c2{
	public static void main(String arg[]){
		Q obj = new Q();
		int pro_prio = 7;
		int con_prio = 3;

		Producer p_obj = new Producer(obj, pro_prio);
		Consumer c_obj1 = new Consumer(obj, "Consumer1", con_prio);
		Consumer c_obj2 = new Consumer(obj, "Consumer2", con_prio);
	}
}