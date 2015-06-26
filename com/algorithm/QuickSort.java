package com.algorithm;

import java.io.BufferedReader;

public class QuickSort{

	public static void main(String[] args) {
		
		QuickSort quickSort=new QuickSort();
		System.out.println("输入排序数量:");
		int num=quickSort.input();
		int []element=new int[num];
		System.out.println("输入元素：");
		for(int i=0;i<num;i++)
		{
			element[i]=quickSort.input();
		}
		
		quickSort.sort(element,0,num-1);
		
		quickSort.show(element);
	}

	
	public void sort(int []element,int left,int right) {

		//quickSort
		
		int i=left,j=right;
		
		if(i>=j)
			return;
		//这句话必须写在退出条件后面，不然会出现数组越界
		int temp=element[left];
		while(i!=j)
		{
			while(element[j]>=temp&&i<j)
				j--;
			while(element[i]<=temp&&i<j)
				i++;
			//swap
			if(i!=j)
			{
				int tmp;
				tmp=element[i];
				element[i]=element[j];
				element[j]=tmp;
			}
			
		}
		
		element[left]=element[i];
		element[i]=temp;
		
		//递归进行左半部分，右半部分排序
		sort(element, left,i-1);
		sort(element, i+1, right);
		
	}
	
	
	public int input()
	{
		BufferedReader buff;
		int t = 0;
		buff = new BufferedReader(new java.io.InputStreamReader(System.in));
		try {
			String string = buff.readLine();
			t = Integer.parseInt(string);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return t;
	}
	
	private void show(int []a)
	{
		int size=a.length;
		System.out.println("result:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}

}
