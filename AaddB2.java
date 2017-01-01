import java.util.Scanner;
import java.math.BigInteger;
public class AaddB2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        if(T>=1 && T<=20){
            for(int i=1;i<=T;i++){
                BigInteger a = in.nextBigInteger();
                BigInteger b = in.nextBigInteger();
                System.out.println("Case " + i +":");
                System.out.println(a + " + " + b +" = " + a.add(b));
				System.out.println();
            }
        }
    }
}