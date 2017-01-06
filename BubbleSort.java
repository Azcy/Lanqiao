import java.util.Scanner;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		final int MAX_SIZE = 200;
		int[] data = new int[MAX_SIZE];
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>0 && n<=200)
			for(int i=0;i<n;i++){
				data[i] = in.nextInt();
			}
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(data,n);
		bs.printData(data,n);
	}

	public void bubbleSort(int[] data,int n){
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(data[j]<data[j-1]){
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
		}
	}

	public void printData(int[] data,int n){
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
