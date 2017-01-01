import java.math.BigInteger;
import java.util.Scanner;
public class HexToDec{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String hex = in.nextLine();
		String dec = HexToDec.convert(hex);
		System.out.println(dec);
	}
	public static String convert(String hex){
		BigInteger sum = BigInteger.valueOf(0L);
		BigInteger sixteen = BigInteger.valueOf(16L);
		BigInteger dec = null;
		int len = hex.length();
		for(int i = 0;i < len;i++){
			char ch = hex.charAt(len-i-1);
			switch(ch){
				case 'A':{ dec = BigInteger.valueOf(10L);sum = sum.add(dec.multiply(sixteen.pow(i)));break;}
				case 'B':{ dec = BigInteger.valueOf(11L);sum = sum.add(dec.multiply(sixteen.pow(i)));break;}
				case 'C':{ dec = BigInteger.valueOf(12L);sum = sum.add(dec.multiply(sixteen.pow(i)));break;}
				case 'D':{ dec = BigInteger.valueOf(13L);sum = sum.add(dec.multiply(sixteen.pow(i)));break;}
				case 'E':{ dec = BigInteger.valueOf(14L);sum = sum.add(dec.multiply(sixteen.pow(i)));break;}
				case 'F':{ dec = BigInteger.valueOf(15L);sum = sum.add(dec.multiply(sixteen.pow(i)));break;}
				default:{ dec = BigInteger.valueOf(ch - '0');sum = sum.add(dec.multiply(sixteen.pow(i)));break;}
			}
		}

		return sum.toString();
	}
}