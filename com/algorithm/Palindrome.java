package com.algorithm;
import java.util.Scanner;
/*
 * 判断回文字*
 */
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入字符出：");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		StringBuffer buffer=new StringBuffer(str);
		String reverse=buffer.reverse().toString();
		
		
		//比较字符串内容要使用equals,==比较的是字符串的引用
		//如果str="hha",reverse="hha",则str==reverse为true,
		//如果str=new String("hha");reverse=new String("hha");则str==reverse为false
		//因为这时候str和reverse指向两个不同的对象，他们的引用是不同的
		if(reverse.equals(str))
			System.out.print("YES");
		else {
			System.out.print("NO");
		}
	
	}

}
