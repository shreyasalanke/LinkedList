package com.bridgelabz;

public class MyNode {

	int data;
	MyNode next;
	
	public MyNode(int data, MyNode next) {
		super();
		this.data = data;
		this.next = next;
	}
	public MyNode() 
	{
		super();
	}
	public void setData(int data)
	{
		this.data = data;
	}
	public int getData()
	{
		return data;
	}
	public void setNext(MyNode next) 
	{
		this.next = next;
	}
	
	public MyNode getNext() 
	{
		return next;
	}
}