package com.bridgelabz;

public class LinkedList {
	
	MyNode head;
	MyNode tail;
	
public void append(int data) 
{
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = null;
		if(head == null) 
		{
			this.head = newNode;
		}
		else {
			MyNode tempNode = head;
			while(tempNode.next != null) 
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
public void add(int data)
 {
	MyNode newNode = new MyNode();
	newNode.data = data;
	newNode.next = head;
	head = newNode;
}
	
	public void insert(int data) {
		MyNode newNode = new MyNode();
		newNode.data = data;
		newNode.next = null;
		if(head == null) {
			this.head = newNode;
		}
		else {
			MyNode tempNode = head.next;
			head.next = newNode;
			newNode.next = tempNode;
		}
	}
	public void print()
	{
		MyNode tempNode = head;
		while(tempNode.next != null)
		{
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
		}
		System.out.println(tempNode.data);
	}
	
	public void insertAfter(MyNode prevNode, int value)
	{

		if (prevNode == null)
		{
		System.out.println("Previous Node should not be NULL");
		return;
		}
		
		MyNode newNode= new MyNode(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		}
	public int poplast()
	{
		if (head == null) 
        {
            System.out.println("Empty");
        } 
        else if (head.next == null) 
        {
            head = null;
        }
        else
        {
            MyNode a = head;
            MyNode b = head;
            while (a.next != null)
            {
                b = a;
                a = a.next;
            }
            b.next = null;
        }
		return 0;
    }
	public void searchNode(int data) {  
        MyNode current = head;  
        int x = 1;  
        boolean flag = false;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            while(current != null) {  
                if(current.data == data) {  
                    flag = true;  
                    break;  
                }  
                x++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is present at : " + x);  
        else  
             System.out.println("Element is not present in the list");  
    }
}