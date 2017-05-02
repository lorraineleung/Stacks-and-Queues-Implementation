package project3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {

	//test queue's head is an empty value when first created 
	@Test
	public void testMyQueue() {
		try{
			MyQueue<String> queue = new MyQueue<String>();
			String test = queue.peek();
			assertNull("Returned value is not null", test);
		}
		catch(Exception e){
			fail("testMyQueue failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}

	//test if peek returns value and not null 
	@Test
	public void testPeek() {
		try{
			MyQueue<String> queue = new MyQueue<String>();
			queue.offer("hello");
			String test = queue.peek();
			assertEquals("Element returned is not correct", "hello", test);
			assertNotNull("Element returned as null", test);
		}
		catch(Exception e){
			fail("testPeek failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}
	
	//test if peek returns null when queue first created 
	@Test
	public void testPeek2(){
		try{
			MyQueue<String> queue = new MyQueue<String>();
			String test = queue.peek();
			assertNull("Element returned not as null", test);
		}
		catch(Exception e){
			fail("testPeek2 failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}

	//test if poll returns null when queue first created
	@Test
	public void testPoll() {
		try{
			MyQueue<String> queue = new MyQueue<String>();
			String test = queue.poll();
			assertNull("Element returned not as null", test);
		}
		catch(Exception e){
			fail("testPoll failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}
	
	//test if poll returns correct value and not null  
	@Test
	public void testPoll2(){
		try{
			MyQueue<String> queue = new MyQueue<String>();
			queue.offer("hello");
			String test = queue.poll();
			assertEquals("Retrieved element does not equal offered element", "hello", test);
			assertNotNull("Element returned as null reference", test);
		}
		catch(Exception e){
			fail("testPoll2 failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}

	//test if offer adds and returns true when item added 
	@Test
	public void testOffer(){
		try{
			MyQueue<String> queue = new MyQueue<String>();
			boolean test = queue.offer("hello");
			assertTrue("Element not added", test);
		}
		catch(NullPointerException e){
			//correct behavior
		}
		catch(ClassCastException e){
			//correct behavior
		}
		catch(IllegalArgumentException e){
			//correct behavior
		}
		catch(Exception e){
			fail("testOffer failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}
	
	//test if item is added correctly 
	@Test
	public void testOffer2(){
		try{
			MyQueue<String> queue = new MyQueue<String>();
			queue.offer("hello");
			String test = queue.peek();
			assertEquals("Retrieved element is not offered element", "hello", test);
		}
		catch(NullPointerException e){
			//correct behavior
		}
		catch(ClassCastException e){
			//correct behavior
		}
		catch(IllegalArgumentException e){
			//correct behavior
		}
		catch(Exception e){
			fail("testOffer2 failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}


	//test if class cast exception is caught 
	@Test 
	public void testOffer3(){
		try{
			MyQueue<Object> queue = new MyQueue<Object>();
			Object test = new Integer(0);
			queue.offer((String)test);
		}
		catch(NullPointerException e){
			//correct behavior
		}
		catch(ClassCastException e){
			//correct behavior
		}
		catch(IllegalArgumentException e){
			//correct behavior
		}
		catch(Exception e){
			fail("testOffer2 failed \n" + e.getClass() + "\n" + e.getMessage());
		}

	}
	
	//test if null pointer exception is caught 
	@Test 
	public void testOffer4(){
		try{
			MyQueue<String> queue = new MyQueue<String>();
			queue.offer(null);
		}
		catch(NullPointerException e){
			//correct behavior
		}
		catch(ClassCastException e){
			//correct behavior
		}
		catch(IllegalArgumentException e){
			//correct behavior
		}
		catch(Exception e){
			fail("testOffer2 failed \n" + e.getClass() + "\n" + e.getMessage());
		}
		
	}

}
