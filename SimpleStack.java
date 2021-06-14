package com.bridgelab;

public class SimpleStack 
{
	Node top;
	int size;
	
	/**
	 * @param element
	 * element variable holds value that we want to push into stack.
	 */
	public void push(int element)
	{
		Node tempNode = new Node(element);
		tempNode.next = top;
		top = tempNode;
		size++;
	}
	
	/**
	 * Printing Stack.
	 */
	public void displayStack()
	{
		Node curruent = top;
		
		while(curruent != null)
		{
			System.out.println(curruent.data);
			curruent = curruent.next;
		}
	}
}
