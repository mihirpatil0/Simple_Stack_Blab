package com.bridgelab;

import java.util.EmptyStackException;

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
	 * @return
	 * popping i.e. removing last pushed element from stack.
	 */
	public int pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}
	
	/**
	 * @return
	 * Printing last pushed element only.
	 */
	public int peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	/**
	 * @return
	 * This function will return size of an stack.
	 */
	public int size()
	{
		return size;
	}
	
	/**
	 * @return
	 * Checking if stack is empty or not.
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	/**
	 * Printing elements of Stack.
	 */
	public void displayStack()
	{
		Node curruent = top;
		
		while(curruent != null)
		{
			System.out.print(curruent.data + " --> ");
			curruent = curruent.next;
		}
		System.out.println();
	}
}
