package com.algorithm;
//冒泡排序，双重循环，时间复杂度为O(N*N)
public class BubbleSort extends Sort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.sort(false);
	}
	
	
	private void show(int []a)
	{
		int len=a.length;
		System.out.println("Result:");
		for(int i=0;i<len;i++)
			System.out.println(a[i]);
	}

	@Override
	void sort(boolean isDown) {
		// TODO Auto-generated method stub
		System.out.println("输入排序数量:");
		int num=input();
		int []element=new int[num];
		System.out.println("输入元素：");
		for(int i=0;i<num;i++)
		{
			element[i]=input();
		}
		
		//冒泡排序
	
		if(!isDown)
		{
			for(int i=0;i<num-1;i++)
			{
				int min_temp=element[i],min_index=i;
				for(int j=i+1;j<num;j++)
				{
					if(element[j]<min_temp)
					{
						min_temp=element[j];
						min_index=j;
					}
				}
				
				//swap
				int tmp;
				tmp=element[i];
				element[i]=element[min_index];
				element[min_index]=tmp;
			}
		}else{
			for(int i=0;i<num-1;i++)
			{
				int max_temp=element[i],max_index=i;
				for(int j=i+1;j<num;j++)
				{
					if(element[j]>max_temp)
					{
						max_temp=element[j];
						max_index=j;
					}
				}
				
				//swap
				int tmp;
				tmp=element[i];
				element[i]=element[max_index];
				element[max_index]=tmp;
			}
		}
		
	
		show(element);
	}

}
