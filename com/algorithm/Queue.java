/**
* 小哼向小哈询问QQ号，小哈给了小哼一串加密过的数字，同时小哈也告诉了小哼解密规则。规则是这样的：首先将第1个数删除，紧接着
*将第2个数放到这串数的末尾，再将第3个数删除并将第4个数再放到这串数的末尾，再将第5个数删除……直到剩下最后一个数，将最后一个数也删除。
*按照刚才删除的顺序，把这些删除的数连在一起就是小哈的QQ啦。现在你来帮帮小哼吧
*/
package com.algorithm;
import java.io.*;;

public class Queue {

	public static void main(String[] args) {
		
		System.out.println("待解密的数字串长度：");
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
		System.out.println("输入数字：");
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


//定义队列结构
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