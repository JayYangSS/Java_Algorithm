package com.algorithm;

//Ͱ����,�ٶȿ죬ȱ���˷ѿռ䣬ʱ�临�Ӷ�O(M+N)
public class BucketSort extends Sort{
	
	
	//isDown=true,��������
	public void sort(boolean isDown)
	{
		System.out.println("��������ķ�ΧN(0-N):");
		int N=input();
		System.out.println("������������:");
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
	
	//5���˵ĳɼ���������10��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BucketSort bucketSort=new BucketSort();
		bucketSort.sort(false);
		
	}

}
