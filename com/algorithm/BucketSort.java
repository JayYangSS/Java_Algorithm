package com.algorithm;

//桶排序,速度快，缺点浪费空间，时间复杂度O(M+N)
public class BucketSort extends Sort{
	
	
	//isDown=true,降序排列
	public void sort(boolean isDown)
	{
		System.out.println("输入排序的范围N(0-N):");
		int N=input();
		System.out.println("输入排序数量:");
		int num=input();
		int []bucket=new int[N+1];
		
		
		
		for (int i = 0; i < bucket.length; i++) {
			bucket[i]=0;
		}
		
		System.out.println("num="+num);
		for(int i=0;i<num;i++)
		{
			int element=input();
			bucket[element]++;
		}
		
		System.out.println("Sort result:");
		if (isDown) {
			for (int i = N; i >=0; i--) {
				for(int j=0;j<bucket[i];j++)
					System.out.println(i);
			}
		}else {
			for (int i = 0; i < bucket.length; i++) {
				for(int j=0;j<bucket[i];j++)
					System.out.println(i);
			}
		
		
		}
	}
	
	//5个人的成绩排序，满分10分
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BucketSort bucketSort=new BucketSort();
		bucketSort.sort(false);
		
	}

}
