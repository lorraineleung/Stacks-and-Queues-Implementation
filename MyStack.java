package project3;

/**
 * The class represents a stack that stores generic data type E nodes  
 * @author Lorraine Leung
 * @version April 6, 2017
 */

import java.util.EmptyStackException;

public class MyStack<E> {
	
	private int size;
	private Node<E> head;
	
	/**
	 * Default constructor for MyStack class 
	 */
	public MyStack(){
		head = null;
		size = 0;
	}
	
	/**
	 * Tests if stack is empty
	 * @return returns true if stack is empty, else false
	 */
	public boolean empty(){
		if (size==0){
			return true;
		}
		return false;
	}
	
	/**
	 * Retrieves and returns element at top of stack without removing it
	 * @return element at top of stack 
	 * @throws EmptyStackException is size is zero 
	 */
	public E peek(){
		if (size==0){
			throw new EmptyStackException();
		}
		else{
			return head.getData();
		}
	}
	
	/**
	 * Removes and returns element at top of stack 
	 * @return element at top of stack 
	 * @throws EmptyStackException if size is zero 
	 */
	public E pop(){
		if (head==null||size==0){
			throw new EmptyStackException();
		}
		else{
			Node<E> currentHead = this.head;
			head = head.getNext();
			size--;
			return currentHead.getData();
		}
	}
	
	/**
	 * Adds specified item onto top of stack
	 * @param item to be added 
	 * @return item that was added 
	 */
	public E push(E item){
		Node<E> n = new Node<E>(item);
		n.setNext(head);
		head=n;
		size++;
		return item;
	}

}
