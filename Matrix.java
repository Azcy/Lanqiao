/*
问题描述
　　给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
　　例如：
　　A =
　　1 2
　　3 4
　　A的2次幂
　　7 10
　　15 22
输入格式
　　第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
　　接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
输出格式
　　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
样例输入
2 2
1 2
3 4
样例输出
7 10
15 22
*/
import java.util.Scanner;
public class Matrix{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//输入矩阵的阶数
		int m = in.nextInt();//输入矩阵的自乘幂数
		int[][] matrix = new int[n][n];
		for (int i = 0;i < n ;i++ ) {
			for (int j = 0;j < n ;j++ ) {
				matrix[i][j] = in.nextInt();//初始化矩阵
			}
		}
	    int[][] newMatrix = Matrix.multiply(matrix,n,m);//调用n阶矩阵m次方方法
		Matrix.printMatrix(newMatrix,n);//输出矩阵
	}
    
    /**
        输出n阶矩阵 
        @param matrix :需要被输出的矩阵
        @param n :参数矩阵的阶数，即行列数
    */
    public static void printMatrix(int[][] matrix,int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
        n阶矩阵的自乘m次幂
        @param matrix :需要处理的矩阵
        @param n :参数矩阵的阶数
        @param m :参数矩阵自乘的幂次数
    */
	public static int[][] multiply(int[][] matrix,int n,int m){
        int[][] temp = new int[n][n];//临时变量temp用来存放每一次矩阵相乘后的结果
        if (m == 0) {//矩阵0次幂的时候特殊处理，是对角线上为1，其他为0的对角矩阵
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    if (i == j) {
                        temp[i][j] = 1;
                    }else {
                        temp[i][j] = 0;   
                    }
                }
            }
        }else {//正常次幂的求法
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    temp[i][j] = matrix[i][j];//还没相乘之前临时变量存放矩阵本身
                }
            }
            for (int i = 1;i < m ;i++ ) {//m代表矩阵的次幂数，i从1开始，m=1则不用乘。
               temp = mul(temp,matrix,n);//调用两个n阶矩阵的乘积的方法，并将结果保存到temp； 
            }
        }
        return temp;
	}
    
    /**
        两个n阶矩阵相乘
        @param data :前一个矩阵
        @param matrix :后一个矩阵
        @param n : 矩阵的阶数
    */
    public static int[][] mul(int[][] data,int[][] matrix,int n){
        int[][] temp = new int[n][n];//用一个临时变量来存放每一次行列相乘后的结果
        for(int i = 0;i < n;i++){//控制前一个矩阵的行
            for(int j = 0;j < n;j++){//控制后一个矩阵的列
                temp[i][j] =  0;//初始化临时矩阵为0
                for(int k = 0;k < n;k++){//控制行列里的元素位置，每次k循环结束后就求出了一个元素的值
                    temp[i][j] += data[i][k] * matrix[k][j];//矩阵相乘实质上就是行乘列求和的结果
                } 
            }
        }
        return temp;
    }
}
