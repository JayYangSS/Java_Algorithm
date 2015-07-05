/**
* С����С��ѯ��QQ�ţ�С������С��һ�����ܹ������֣�ͬʱС��Ҳ������С�߽��ܹ��򡣹����������ģ����Ƚ���1����ɾ����������
*����2�����ŵ��⴮����ĩβ���ٽ���3����ɾ��������4�����ٷŵ��⴮����ĩβ���ٽ���5����ɾ������ֱ��ʣ�����һ�����������һ����Ҳɾ����
*���ող�ɾ����˳�򣬰���Щɾ����������һ�����С����QQ���������������С�߰�
*/
package com.algorithm;
import java.io.*;;

public class Queue {

	public static void main(String[] args) {
		
		System.out.println("�����ܵ����ִ����ȣ�");
		BufferedReader readerNum=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num=0;
		try {
			str=readerNum.readLine();
			num=Integer.parseInt(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		StructQueue queue=new StructQueue(100,num);
		//read data
		System.out.println("�������֣�");
		for(int i=0;i<num;i++)
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			try {
				str=reader.readLine();
				queue.array[i]=Integer.parseInt(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		while(queue.head!=queue.tail)
		{
			System.out.print(queue.array[queue.head]);
			queue.head++;
			
			queue.array[queue.tail]=queue.array[queue.head];
			queue.tail++;
			queue.head++;
		}
		
	}

}


//������нṹ
class StructQueue{
	
	int head;
	int tail;
	int []array;
	public StructQueue(int arrayLen,int size)
	{
		this.tail=size;
		array=new int[arrayLen];
		head=0;
	}
	
}