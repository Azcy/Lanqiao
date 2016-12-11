import java.util.Scanner;
public class QuickSort 
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
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(data,0,n-1);
		quickSort.printData(data,n);
	}
	/**
		确定轴值:
			一开始默认第一个数为轴值，从后面开始往前扫描，扫到第一个比轴值小的数，
			交换两个数；从前面往后面扫，扫到第一个比轴值大的数，交换。直到start>=end.
	*/
	public int quick(int[] data,int start,int end){
		int goal = data[start];
		int startIndex = start;
		int endIndex = end;
		while(startIndex < endIndex){
			while(startIndex < endIndex){ //从后往前扫
				if(goal > data[endIndex]){//扫到第一个比轴值小的数，交换
					data[startIndex] = data[endIndex];
					data[endIndex] = goal;
					startIndex++;//前头索引加1
					break;//终止这轮循环
				}
				endIndex--;
			}
			while(startIndex < endIndex){//从前往后扫
				if(goal < data[startIndex]){//扫到第一个比轴值大的数，交换
					data[endIndex] = data[startIndex];
					data[startIndex] = goal;
					endIndex--;//后面索引减1
					break;//终止这轮循环
				}
				startIndex++; 
			}
		}
		return startIndex;
	}
	/**
		快速排序递归函数
	*/
	public void quickSort(int[] data,int start,int end){
		if(start < end){
			int center = quick(data,start,end);//对这个数列进行快速排序
			if(center>start)
				quickSort(data,start,center-1);//对轴值的左侧数列进行快速排序
			if(center<end)
				quickSort(data,center+1,end);//对轴值的右侧数列进行快速排序
		}
	}

	public void printData(int[] data,int n){
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
