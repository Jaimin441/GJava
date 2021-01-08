import java.text.SimpleDateFormat;
import java.util.*;

class time{
	public static void main(String arg[]){
		long date = System.currentTimeMillis();
		System.out.println("In Mills = " + date);
		System.out.println("Date = ", SimpleDateFormat("dd/mm/yyyy").format(Date(date)));
	}
}