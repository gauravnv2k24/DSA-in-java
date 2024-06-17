// below is the implementation to count no of digits in a number
import java.util.Scanner;

public class CountDigits
{
    // bello function return no of digits
    static int CountDigits(int n){
        
        // bellow used math function conver to base 10 means 1=>0 , 12=> 1, 123=> 2 
       // therefore one is added to obtain req result
        return (int)Math.log10(n) + 1;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: "); // Enter a number:
		int n = sc.nextInt(); // 12345
		System.out.println("No of digits: " + CountDigits(n)); // No of digits: 5
	}
}
