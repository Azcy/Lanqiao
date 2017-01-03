/*
问题描述
　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的四位十进制数。
*/
public class SpecialNum2{
	public static void main(String[] args) {
		int tho = 0,hun = 0,ten = 0,ge = 0;
		for (int i = 1000;i < 10000 ;i++ ) {
			tho = i / 1000;
			hun = i % 1000 / 100;
			ten = i % 1000 % 100 /10;
			ge = i % 1000 % 100 % 10 ;
			if(tho == ge && hun == ten)
				System.out.println(i);
		}
	}
}