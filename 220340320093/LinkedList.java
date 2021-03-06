/*Function Description
Complete the reverse function in the editor below.
reverse has the following parameter:
 Node pointer head: a reference to the head of a list
Returns
LinkedListNode pointer: a reference to the head of the reversed list
Input Format
The first line contains an integer t, the number of test cases.
Each test case has the following format:
The first line contains an integer n, the number of elements in the linked list.
Each of the next n lines contains an integer, the data values of the elements in the linked list.*/
import java.util.*;
class LinkedList{
	static Node head;
	static class Node{
	 int data;
	 Node next;
	 Node(int d)
		{
			data = d;
			next = null;
		}
	}
	Node insertData(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		return new_node;
	}
	void  insertAfter(Node prev,int new_data)
	{
	    Node new_node = new Node(new_data);
		if(prev == null)
		{
			System.out.println("there is no previous position so that you can not insert data after");	
		}
		new_node.next = prev.next;
		prev.next = new_node;
	}
	void append(int new_data)
	{	
		Node new_node = new Node(new_data);
		if(head == null)
		{
			 head = new_node;
			return;
			
		}
		new_node.next =null;
		Node n =head;
		while(n.next != null)
		{
			n = n.next;
		}
		n.next = new_node;
		return;
	}
	void display()
	{
		Node n = head;
		Node prev = null;
		while(n.next != null)
		{
			n = n.next;
		}
		
		prev = n;
		
		System.out.println(n.data +" ");
		
		
		
	}
	
	public static void main(String [] args)
	{	 
		 LinkedList ls = new LinkedList();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the node you want to create");
		 
		 int x = sc.nextInt();
		 System.out.println("enter the elements you want to add");
		 int value=0;
		 
		 for(int i=0;i<x;i++)
		 {
			  value = sc.nextInt();
		 }
		 Node a=ls.insertData(value);
	//Node b = ls.insertAfter(head.next,value);
	//Node c = ls.append(value);
	ls.display();
	
	
	}
}
