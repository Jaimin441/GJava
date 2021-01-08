import java.util.*;
import java.lang.Math;
class Length{
	private int m, cm, mm;

	//Reset is Used to set proper value for M:Cm:MM in their respective range
	void reset(){
		cm += mm/10;
		mm %= 10;

		m += cm/100;
		cm %= 100;
	}

	Length(int d_m, int d_cm, int d_mm){
		m = d_m;
		cm = d_cm;
		mm = d_mm;
		this.reset();
	}
	Length(){
		m = cm = mm = 0;
	}
	
	Length add(Length obj){
		Length new_obj = new Length();
		new_obj.m = this.m + obj.m;
		new_obj.cm = this.cm + obj.cm;
		new_obj.mm = this.mm + obj.mm;

		new_obj.reset();
		return new_obj;
	}
	Length subtract(Length obj){
		Length new_obj = new Length();
		new_obj.m = Math.abs(this.m - obj.m);
		new_obj.cm = Math.abs(this.cm - obj.cm);
		new_obj.mm = Math.abs(this.mm - obj.mm);		
		new_obj.reset();
		return new_obj;
	}

	void multiply(int val){
		this.m *= val;
		this.cm *= val;
		this.mm *= val;
	}
	void divide(int val){
		this.m /= val;
		this.cm /= val;
		this.mm /= val;	
	}

	void print(int obj_no){
		System.out.print("\nPrinting object " +obj_no+ " in 'M:CM:MM' format");
		System.out.println(":-\t" +m+ ":" +cm+ ":" +mm);
	}
}

class caller{

	public static void main(String arg[]){
		Length obj1 = new Length(2, 10, 20);
		Length obj2 = new Length(1, 1, 1);
		Length obj3 = obj1.add(obj2);
		Length obj4 = obj2.subtract(obj1);

		obj1.print(1);
		obj2.print(2);

		System.out.print("\nObject 3 = obj1 + obj2");
		obj3.print(3);

		System.out.print("\nObject 4 = obj2 - obj1");
		obj4.print(4);
	}
}