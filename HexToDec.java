import java.math.BigInteger;
import java.util.Scanner;

/*
	问题描述
　　        从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　        注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
    样例输入
           FFFF
    样例输出
           65535
*/
public class HexToDec{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String hex = in.nextLine();
		String dec = HexToDec.convert(hex);
		System.out.println(dec);
	}

	/*
		convert a hexadecimal number into a decimalism number.
		thinking:
			1 step:get every character from tail to head of the
				   hexadecimal string.
			2 step:convert the character into a BigInteger tpye,
				   because it is out of the range of the Int.
			3 step:get the BigInteger and multiply 16 power product,which 
				   background number is hexadecimal.lentgh()-i-1
			4 step:get the result from 3 step and add to summary.
	*/
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