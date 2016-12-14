public class Recursion{

	/**
		从前往后加，递归出口为数组的末尾。
		@param data 求和数组
		@param begin 起始位置
	*/
	public static int recurseSum1(int[] data,int begin){
		if(begin>=data.length) return 0;
		return data[begin]+recurseSum1(data,begin+1);
	}
	/**
		从后往前加，递归出口为数组的起始。
		@param data 求和数组
		@param end 起始位置
	*/
	public static int recurseSum2(int[] data,int end){
		if(end<0) return 0;
		return recurseSum2(data,end-1)+data[end];
	}
	/**
		折半，左边求和，右边求和，再加起来；递归出口，左边和右边
		都只有一个数的时候。
		@param data 求和数组
		@param begin 数组的起始
		@param end 数组的末尾
	*/
	public static int recurseSum3(int[] data,int begin,int end){
		int mid = (begin + end) / 2;
		if(mid == begin && mid == end) return data[mid];
		return recurseSum3(data,begin,mid)+recurseSum3(data,mid+1,end);
	}

	public static void main(String[] args){
		int[] data = {1,2,3,4,5,6};
		int result = Recursion.recurseSum1(data,0);
//		int result = Recursion.recurseSum2(data,data.length-1);
//		int result = Recursion.recurseSum3(data,0,data.length-1);
		System.out.println(result);
	}
}