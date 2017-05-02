package project3;

/**
 * The class represents a node that has a generic data type E  
 * @author Lorraine Leung
 * @version April 6, 2017
 */

public class Node<E> {
	
	private E data;
	private Node<E> next;
	
	/**
	 * Default constructor for Node class 
	 */
	public Node(){
		this.data=null;
	}
	
	/**
	 * Second constructor for Node class with data as param 
	 * @param data to be stored in the node 
	 */
	public Node (E data){
		this.data=data;
	}
	
	/**
	 * Third constructor for Node class 
	 * @param data to be stored in the node
	 * @param next node that this node is pointing to 
	 */
	public Node (E data, Node<E> next){
		this.data=data;
		this.next=next;
	}
	
	/**
	 * Sets the next node that this node is pointing to 
	 * @param newNode that this node points to 
	 */
	public void setNext(Node<E> newNode){
		this.next = newNode;
	}
	
	/**
	 * Retrieves and returns this node's next node 
	 * @return next node  
	 */
	public Node<E> getNext(){
		return next;
	}
	
	/**
	 * Sets the data for this node 
	 * @param data to be stored in this node 
	 */
	public void setData(E data){
		this.data=data;
	}
	
	/**
	 * Retrieves and returns the data stored in this node 
	 * @return data of this node 
	 */
	public E getData(){
		return data;
	}
	
}
