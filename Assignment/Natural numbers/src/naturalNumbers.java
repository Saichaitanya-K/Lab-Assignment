import java.util.*;
public class naturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		sum=calculateSum(n);
		System.out.println("The sum of natural numbers is:"+sum);
	}

	private static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
