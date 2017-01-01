import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String isNot = null;
		isNot=(LeapYear.isLeapYear(year))?"yes":"no";
		System.out.println(isNot);
	}

	public static boolean isLeapYear(int year){
		if(year % 4 ==0 && year % 100 != 0) return true;
		if(year % 400 == 0) return true;
		return false;
	}
}