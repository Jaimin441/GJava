import java.util.*; 
 
class SumDigit{ 

    public static int sum(int num){
        int r, sum=0;
        while(num!=0){
            r = (num % 10);
            sum += r;
            num /= 10;
        }
        return sum;
    }
    public static void main(String arg[]) 
    { 
        int digit;
        if(arg.length == 0){
            Scanner inp = new Scanner(System.in);  
            System.out.print("Enter the Number:- ");
            digit = inp.nextInt();

            System.out.println("Sum of digits of "+digit+" is = "+sum(digit));
        }
        else{
            digit = Integer.parseInt(arg[0]);
            System.out.println("Sum of digits of "+digit+" is = "+sum(digit));   
        }
    } 
} 