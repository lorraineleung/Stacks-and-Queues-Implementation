package project3;

/**
 * The class represents a queue that stores generic data type E nodes 
 * @author Lorraine Leung
 * @version April 6, 2017
 */

public class MyQueue<E> {
	
	private Node<E> head;
	private int size;

	/**
	 * Default constructor for MyQueue class 
	 */
	public MyQueue(){
		this.head = null;
		this.size = 0;
	}
	
	/**
	 * Retrieves element at head of queue, without removing it 
	 * @return element at head of queue, or null if queue is empty 
	 */
	public E peek(){
		if (head==null||size==0){
			return null;
		}
		else{
			return head.getData();
		}
	}
	
	/**
	 * Retrieves and removes element at head of queue 
	 * @return element at head of queue, or null if queue is empty 
	 */
	public E poll(){
		if (head==null||size==0){
			return null;
		}
		else{
			Node<E> currentHead = this.head;
			this.head = this.head.getNext();
			size--;
			return currentHead.getData();
		}
	}
	
	/**
	 * Adds specified item to queue (end/tail of queue)
	 * @param item to be added 
	 * @return true if item was added, else false  
	 */
	public boolean offer(E item){
		//create new node item with given item
		Node<E> n = new Node<E>(item);
		//create temp variable, current
		Node<E> current = this.head;
		//check to make sure item to be added is not null 
		if (n.getData()==null){
			throw new NullPointerException("Element to be offered cannot be null");
		}
		//loop through all the elements in current queue 
		else if(size==0){
			this.head = n;
			size++;
			return true;
		}
		//loop to end of queue to add new item 
		else if(size!=0){
			while (current.getNext()!=null){
				current = current.getNext();
			}
			current.setNext(n);
			size++;
			return true;
		}
		//return false if item not added
		else{
			return false;
		}
	}
	
}
