package com.bridgelabz;

public class Main
  {
	public static void main(String[] args)
	{
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(70);
		linkedList.append(30);
		linkedList.print();
		
		int poplast = linkedList.poplast();
		 System.out.println(poplast);
		
		linkedList.print();
	}
}
