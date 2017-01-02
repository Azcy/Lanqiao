import java.lang.StringBuffer;
import java.util.Scanner;

/*
问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。

输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

输出格式
　　输出n行，每行为输入对应的八进制正整数。

先把十六进制转成二进制，每位十六进制正好转成4位二进制，然后再将二进制转成八进制，每三个二进制转成一个八进制。
*/
public class HexToBin{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0;i < n;i++){
			String hex = in.nextLine();
			String bin = HexToBin.hexToBinary(hex);
			String oct = HexToBin.binToOctonary(bin);
			System.out.println(oct);
		}
		
	}

	/*
		This method is used to transfer a hexadecimal
		number to binary number.

		The following method is a stupid method.
	*/
	public static String hexToBinary(String hex){
		StringBuffer sb = new StringBuffer();
		for (int i = 0;i < hex.length() ;i++ ) {
			char ch = hex.charAt(i);

			switch(ch){
				case '0':{sb.append("0000"); break;}
				case '1':{sb.append("0001"); break;}
				case '2':{sb.append("0010"); break;}
				case '3':{sb.append("0011"); break;}
				case '4':{sb.append("0100"); break;}
				case '5':{sb.append("0101"); break;}
				case '6':{sb.append("0110"); break;}
				case '7':{sb.append("0111"); break;}
				case '8':{sb.append("1000"); break;}
				case '9':{sb.append("1001"); break;}
				case 'A':{sb.append("1010"); break;}
				case 'B':{sb.append("1011"); break;}
				case 'C':{sb.append("1100"); break;}
				case 'D':{sb.append("1101"); break;}
				case 'E':{sb.append("1110"); break;}
				case 'F':{sb.append("1111"); break;}
				default: return null;
			}
		}

		return cutBinary(sb.toString());
	}
	/*
		This method is used to transfer a binary number
		to a octonary number.

		The following method is also a stupid method.
	*/
	public static String binToOctonary(String bin){
		StringBuffer sb = new StringBuffer();
		String str = bin;
		if(bin.length() % 3 == 1){
			str = "00"+bin;
		}else if(bin.length() % 3 == 2){
			str = "0"+bin;
		}
		for (int i = 0;i < str.length() ;i += 3 ) {
			String sub = str.substring(i,i+3);
			if(sub.equals("000")){
				sb.append("0");
			}else if(sub.equals("001")){
				sb.append("1");
			}else if(sub.equals("010")){
				sb.append("2");
			}else if(sub.equals("011")){
				sb.append("3");
			}else if(sub.equals("100")){
				sb.append("4");
			}else if(sub.equals("101")){
				sb.append("5");
			}else if(sub.equals("110")){
				sb.append("6");
			}else {
				sb.append("7");
			}
			
		}

		return sb.toString();
	}

	/*
		This method is used to remove '0' of binary number
		which is started with '0';
	*/
	public static String cutBinary(String bin){
		String sub = bin;
		for(int i = 0;i < bin.length()-1;i++){
			if(sub.startsWith("0")){
				sub = sub.substring(1,sub.length());
			}
			else
				break;
		}
		return sub;
	}
}