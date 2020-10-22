import java.util.*;
public class increasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number : ");
		n=sc.nextInt();
		boolean number=checkNumber(n);
		System.out.println("The number is increasing "+number);

	}

	private static boolean checkNumber(int n) {
		int digit;
		int count=0;
		boolean number=false;
		int[] a=new int[count];
		while(n!=0) {
			digit=n%10;
			n=n/10;
		a[count]=digit;
		count++;
	}
		for(int i=0;i<=a.length;i++) {
			if(a[i]>a[i+1]) {
				number=true;
			}
		}
		return number;
	}

}
