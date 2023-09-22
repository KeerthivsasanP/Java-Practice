import java.lang.Math;
import java.util.Scanner;

class Squareroot{
	public static void main(String args[]){
		double y,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for x");
		x = sc.nextDouble();
		y = Math.sqrt(x);
		System.out.println("Square root of x = "+y);
	}
}