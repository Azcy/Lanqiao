import java.util.Scanner;
import java.text.DecimalFormat;
public class Circle
{
	public static void main(String[] args){
		final double PI = 3.14159265358979323;
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		double area = r * r * PI;
		System.out.println(new DecimalFormat("#.0000000").format(area));
	}
}