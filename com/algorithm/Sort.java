package com.algorithm;

import java.io.BufferedReader;

abstract public class Sort {
	
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
	
	
	abstract void sort(boolean isDown);
	
	
}
