/*
问题描述
　　给定两个仅由大写字母或小写字母组成的字符串(长度介于1到10之间)，它们之间的关系是以下4中情况之一：
　　1：两个字符串长度不等。比如 Beijing 和 Hebei
　　2：两个字符串不仅长度相等，而且相应位置上的字符完全一致(区分大小写)，比如 Beijing 和 Beijing
　　3：两个字符串长度相等，相应位置上的字符仅在不区分大小写的前提下才能达到完全一致（也就是说，它并不满足情况2）。比如 beijing 和 BEIjing
　　4：两个字符串长度相等，但是即使是不区分大小写也不能使这两个字符串一致。比如 Beijing 和 Nanjing
　　编程判断输入的两个字符串之间的关系属于这四类中的哪一类，给出所属的类的编号。
输入格式
　　包括两行，每行都是一个字符串
输出格式
　　仅有一个数字，表明这两个字符串的关系编号
样例输入
BEIjing
beiJing 
样例输出
3
*/
import java.util.Scanner;
public class JudgeString{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		int type = JudgeString.judge(str1,str2);
		System.out.println(type);
	}
	/*
	判断方式：
		1：首先判断两个字符串是否相等，若不相等返回1
		2：若相等，则循环判断对应下表的字符是否相等，若每个相等则返回2
		3：若2中有某一次不相等，则判断该不相等的字符大写或者小写是否相等，若有一次不相等，则返回4
		4：若3中每一次都相等，则返回3
	@param str1
	@param str2
	*/
	public static int judge(String str1,String str2){
		//判断两个字符串的长度是否不相等，不相等返回1
		if(str1.length() != str2.length()) return 1;
		else{//两个字符串相等
			for (int i = 0;i < str1.length() ;i++ ) {
				//循环判断字符串相对应的下表的字符是否相等，若全都相等，则会执行到return 2而不会进入if语句
				if(str1.charAt(i) != str2.charAt(i)){
					//到这里证明有某个字符不相等，则判断该字符串是否有相似，相似的意思是该字符不分大小写相等
					if((str1.charAt(i) + 32 != str2.charAt(i)) && (str1.charAt(i) - 32 != str2.charAt(i)))
						//字符串不相似
						return 4;
					//字符串相似
					return 3;
				}
			}
			return 2;
		}
	}
}
