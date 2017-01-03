/*
问题描述
　　给定一个以秒为单位的时间t，要求用“<H>:<M>:<S>”的格式来表示这个时间。<H>表示时间，<M>表示分钟，而<S>表示秒，它们都是整数且没有前导的“0”。例如，若t=0，则应输出是“0:0:0”；若t=3661，则输出“1:1:1”。
输入格式
　　输入只有一行，是一个整数t（0<=t<=86399）。
输出格式
　　输出只有一行，是以“<H>:<M>:<S>”的格式所表示的时间，不包括引号。
样例输入
0
样例输出
0:0:0
样例输入
5436
样例输出
1:30:36
*/
import java.util.Scanner;
public class TimeFormat{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int hour = 0,min = 0, sec = 0;
		if(num >= 3600){
			hour = num / 3600;
			min = num % 3600 / 60;
			sec = num % 3600 % 60;
		}else if (num >= 60 && num < 3600) {
			min = num / 60;
			sec = num % 60;
		}else {
			sec = num;
		}
		System.out.println(hour + ":" + min + ":" + sec);
	}
}