import java.util.Scanner;
public class Sum
{
	public static void main(String[] args) 
	{
		int n,sum;
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()){
			sum=0;
			n = in.nextInt();
			for(int j=1;j<=n;j++){
				sum+=j;
			}
			System.out.println(sum);
			System.out.println();
		}
	}
}
