
/*
		问题描述
	利用字母可以组成一些美丽的图形，下面给出了一个例子：

	ABCDEFG

	BABCDEF

	CBABCDE

	DCBABCD

	EDCBABC

	这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
*/
import java.util.Scanner;
public class LetterGraph{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i = 0 ;i < n ;i++ ){
			for (int j = 0;j < m ;j++ ) {
				//get the absolute value
				if(i > j)
					System.out.print((char)('A' + i -j));
				else
					System.out.print((char)('A' + j -i));
			}
			System.out.println();
		}
	}
}