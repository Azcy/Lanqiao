import java.util.Scanner;
public class LetterGraph{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i = 0 ;i < n ;i++ ){
			for (int j = 0;j < m ;j++ ) {
				if(i > j)
					System.out.print((char)('A' + i -j));
				else
					System.out.print((char)('A' + j -i));
			}
			System.out.println();
		}
	}
}