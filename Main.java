package com.bridgelab;

public class Main 
{
	public static void main(String[] args)
	{
		SimpleStack simpleStackObject = new SimpleStack();
		
		//pushing elements into stack.
		simpleStackObject.push(70);
		simpleStackObject.push(30);
		simpleStackObject.push(56);
		
		//printing the size of stack after pushing elements inside.
		System.out.println("Size of an stack is : " + simpleStackObject.size() + "\n");
		
		//printing full stack elements.
		simpleStackObject.displayStack();
		
		//displaying only last i.e top element.
		System.out.println("Peek element: " + simpleStackObject.peek() + "\n");
		
		//Popping i.e removing last inserted element from stack.
		System.out.println("Popping element: " + simpleStackObject.pop() + "\n");
		
		//again printing size of an stack after popping element.
		System.out.println("Size of an stack is : " + simpleStackObject.size() + "\n");
		
		//printing full stack elements.
		simpleStackObject.displayStack();
		
		
	}
}
