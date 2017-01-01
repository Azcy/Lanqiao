import java.util.Scanner;
public class AaddB{
    public static void main(String[] args){
        int a=0,b=0;
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            a = in.nextInt();
            b = in.nextInt();
			System.out.println(a+b);
        }
        
    }
}