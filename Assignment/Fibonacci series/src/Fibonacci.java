import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1,b=1,c=0,n;
		System.out.println("Enter value of n: ");
		n=sc.nextInt();
		System.out.println(a);
		System.out.println(" "+b);
		for(int i=0;i<n-2;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(" "+c);
		}
		System.out.println(n+"th number of the series is: "+c);
	}

}
