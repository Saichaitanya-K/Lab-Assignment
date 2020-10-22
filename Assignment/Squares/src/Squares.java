import java.util.*;
public class Squares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		sum=calculateDifference(n);
		System.out.println("The difference is :"+sum);

	}

	private static int calculateDifference(int n) {
		int sum,digit=0,square=0;
		for(int i=1;i<=n;i++) {
			digit+=i*i;
			square+=i;
		}
		sum=digit-(square*square);
		return sum;
	}

}
