package power;

import java.util.*;

public class power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		boolean number=checkNumber(n);
		System.out.println("The number is a power of 2 "+number);
	}
	private static boolean checkNumber(int n) {
		boolean number=false;
		if(n<=0) {
			number=false;
		}
		while(n>1) {
			if(n%2==0) {
				number=true;
			}
			else {
				number=false;
				break;
			}
			n=n/2;
		}
		return number;
	}

}
