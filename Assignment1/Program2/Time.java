class Time{
	int hh, mm, ss;

	Time(int d_h, int d_m, int d_s){
		hh = d_h;
		mm = d_m;
		ss = d_s;
		setTime();
	}
	private void setTime(){	
	//	This function just set proper time 
	//	i.e. if Minute = 65 then it add 1 hour and set min to 5
		hh += (mm/24);

		mm = (mm%24);
		mm += (ss/60);

		ss = (ss % 60);
	}
	public Time sum(Time obj){
		Time new_time = new Time(hh+obj.hh, mm+obj.mm, ss+obj.ss);
		return new_time;
	}
	public void showTime(String name){
		System.out.println("\nTime of Obj" + name + " :- " + hh + ":" + mm + ":" + ss);
	}
}

class MainClass{
	public static void main(String args[]){
		Time obj1 = new Time(10, 50, 30);
		Time obj2 = new Time(5, 70, 50);
		Time obj3 = obj1.sum(obj2);

		obj1.showTime("1");
		obj2.showTime("2");
		obj3.showTime("3");
	}
}