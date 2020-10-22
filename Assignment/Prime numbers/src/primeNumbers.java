import java.util.*;
public class primeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter a integer : ");
		number=sc.nextInt();
		int count;
		for(int i = 2 ; i <= number ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
	}
}
