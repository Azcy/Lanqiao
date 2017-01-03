/*
问题描述
　　求出区间[a,b]中所有整数的质因数分解。
输入格式
　　输入两个整数a，b。
输出格式
　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
样例输入
3 10
样例输出
3=3
4=2*2
5=5
6=2*3
7=7
8=2*2*2
9=3*3
10=2*5
提示
　　先筛出所有素数，然后再分解。
数据规模和约定
　　2<=a<=b<=10000
*/
import java.util.Scanner;
import java.lang.StringBuffer;
/*
	解题思路：
		这里我不使用先找出素数和可分解质因数的数，因为这样做
		会在判断素数的时候使用了一次循环，在打印的时候又会使
		用一次循环，这样效率太低了。

		我采取的方法是边判断边得出式子的字符串，也就是每一轮
		就能得该整数的质因数分解。首先每轮我初始化式子字符串
		为“'目标数'=”（目标数是区间中的整数），用一个循环从
		j=2到j=‘目标数’来判断是否为素数（条件为'目标数'%j==0）
		，如果为素数则“‘目标数’=”.append(i)；如果不是素数，就
		“‘目标数’=”.append(j+"*")，用后把‘目标数’/j当做新的目
		标数，重复之前的操作。这样的话最后质因数的式子必然会多
		出一个“*”的符号，把它干掉即可。
		
*/
public class PrimeResolve{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//从键盘输入区间
		int low = in.nextInt();
		int high = in.nextInt();
		int j,temp,flag=0;
		for (int i = low;i <= high ;i++ ) {
			//用来判断是否是素数，如果为素数为0，不为素数为1
			flag = 0;
			//由于我想用同一个循环，质因数分解的时候会改变目标数i，所以我用一个临时变量来存放i
			temp = i;
			//初始化式子的字符串
			StringBuffer sb = new StringBuffer(temp + "=");
			for (j = 2;j <= temp ;j++ ) {
				//如果为true则可分解，由于经过分解，改变flag的值，改变式子字符串，改变目标数，j从头开始
				if(temp % j == 0){
					flag = 1;
					sb.append(j+"*");
					temp/=j;
					j=1;
				}
			}
			//判断是否为素数，输出
			if(flag == 0){
				sb.append(i);
				System.out.println(sb.toString());
			}else {
				//质因数分解的时候式子动态添加的时候会多出一个“*”，所以删除了再输出
				System.out.println(sb.substring(0,sb.length()-1).toString());
			}
		}
	}
}
