import java.util.Scanner;

/*
		问题描述
	给定一个年份，判断这一年是不是闰年。

	当以下情况之一满足时，这一年是闰年：

	1. 年份是4的倍数而不是100的倍数；

	2. 年份是400的倍数。

	其他的年份都不是闰年。
*/
public class LeapYear{
	public static void main(String[] args) {
		//get the input stream
		Scanner in = new Scanner(System.in);
		//get a year number from keyboard
		int year = in.nextInt();
		String isNot = null;
		isNot=(LeapYear.isLeapYear(year))?"yes":"no";
		System.out.println(isNot);
	}

	/*
		judge whether the parameter is a leap year,
		if true,return true,else return false.
	*/
	public static boolean isLeapYear(int year){
		if(year % 4 ==0 && year % 100 != 0) return true;
		if(year % 400 == 0) return true;
		return false;
	}
}