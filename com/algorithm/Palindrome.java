package com.algorithm;
import java.util.Scanner;
/*
 * �жϻ�����*
 */
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����ַ�����");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		StringBuffer buffer=new StringBuffer(str);
		String reverse=buffer.reverse().toString();
		
		
		//�Ƚ��ַ�������Ҫʹ��equals,==�Ƚϵ����ַ���������
		//���str="hha",reverse="hha",��str==reverseΪtrue,
		//���str=new String("hha");reverse=new String("hha");��str==reverseΪfalse
		//��Ϊ��ʱ��str��reverseָ��������ͬ�Ķ������ǵ������ǲ�ͬ��
		if(reverse.equals(str))
			System.out.print("YES");
		else {
			System.out.print("NO");
		}
	
	}

}
