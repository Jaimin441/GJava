import java.util.Scanner;

class FlipCart{
	private int product_price;
	private String product_name;

	FlipCart(int d_prc, String d_name){
		product_price = d_prc;
		product_name = d_name;
	}

	private int getCashBack(){
		int cashback;
		if(product_price < 5000){
			cashback = 50*(product_price/1000);
		}
		else{
			cashback = 100*(product_price/1000);
		}

		return cashback;
	}

	void display(){
		int cashback = this.getCashBack();

		System.out.println("Product name -> "+product_name);
		System.out.println("Actual price -> "+product_price);
		System.out.println("Cashback -> "+cashback);
		System.out.println("Total Bill -> " + (product_price-cashback));
	}
}

class caller{
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		System.out.println("Enter the Product name:- ");
		String name = inp.nextLine();

		System.out.println("Enter the product price:- ");
		int prc = inp.nextInt();

		FlipCart obj = new FlipCart(prc, name);

		System.out.println("<-----Displaying Info----->");
		obj.display();
	}
}