
/*
		问题描述
	对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：

	00000

	00001

	00010

	00011

	00100

	请按从小到大的顺序输出这32种01串。
*/
public class String01{
	public static void main(String[] args) {
		for(int i = 0;i <= 1 ;i++){
			for (int j = 0;j <= 1 ;j++ ) {
				for (int k = 0;k <= 1 ;k++ ) {
					for (int l = 0;l <= 1 ;l++ ) {
						for (int m = 0;m <= 1 ;m++ ) {
							System.out.println(i+""+j+""+k+""+l+""+m);
						}
					}
				}
			}
		}
	}
}