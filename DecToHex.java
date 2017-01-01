import java.lang.StringBuffer;
import java.util.Scanner;
public class DecToHex{
	public static final int MOD = 16;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String decimalism = DecToHex.convert(num);
		System.out.println(decimalism);
	}
	/*
		This method receive a decimalism number and convert 
		the decimalism number into a hexadecimal number.

		@param num
	*/
	public static String convert(int num){
		StringBuffer sb = new StringBuffer();
		int div = num;
		int mod = 0;
		do{
			mod = div % MOD;
			div /= MOD; 
			switch(mod){
				case 15:{ sb.append("F");break; }
				case 14:{ sb.append("E");break; }
				case 13:{ sb.append("D");break; }
				case 12:{ sb.append("C");break; }
				case 11:{ sb.append("B");break; }
				case 10:{ sb.append("A");break; }
				default :{ sb.append(mod);break; }
			}
		}while(div > 0);

		return sb.reverse().toString();
	}
}