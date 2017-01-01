import java.util.Scanner;
public class Sum1
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = 0L;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
}
