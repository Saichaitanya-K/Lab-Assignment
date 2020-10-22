package cubes;

import java.util.*;

public class cubes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,result;
		System.out.println("Enter a number :");
		number=sc.nextInt();
		result=cube(number);
		System.out.println(result);

	}

	private static int cube(int number) {
		int sum=0,digit=0;
		while(number!=0) {
			digit=number%10;
			sum+=digit*digit*digit;
			number=number/10;
		}
		return sum;
	}

}
