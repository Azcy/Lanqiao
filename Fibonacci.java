import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] fib = new int[1000000];
		fib[1] = fib[2] = 1;
		for(int i=3;i<=n;i++){
			fib[i]=(fib[i-2]+fib[i-1])%10007;
		}
		System.out.println(fib[n]);
	}

	public int getFibonacci(int n){
		if(n==1 || n==2)
			return 1;
		else if(n > 2)
			return (getFibonacci(n-2)+getFibonacci(n-1))%10007;
		else
			return -1;
	}
}
