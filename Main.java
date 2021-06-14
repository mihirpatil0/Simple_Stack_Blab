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
		
		//printing stack.
		simpleStackObject.displayStack();
	}
}
