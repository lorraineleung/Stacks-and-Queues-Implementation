package project3;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class MyStackTest {

	//test constructor to make sure it is empty when first created 
	@Test
	public void testMyStack() {
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.empty();
			assertTrue("Stack is not empty", true);
		}
		catch (Exception e){
			fail("testMyStack failed\n" + e.getClass());
		}
	}

	//test if stack is empty when first constructed 
	@Test
	public void testEmpty() {
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.empty();
			assertTrue("Stack is not empty", true);
			
		}
		catch (Exception e){
			fail("testEmpty failed\n" + e.getClass() + "\n"  + e.getMessage());
		}
	}
	
	//test if stack is not empty when one element is pushed 
	@Test
	public void testEmpty2(){
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.push("hello");
			stack.empty();
			assertFalse("Stack is empty", false);
		}
		catch (Exception e){
			fail("testEmpty 2 failed\n" + e.getClass() + "\n" + e.getMessage());
		}
	}

	//test if peek returns correct value 
	@Test
	public void testPeek() {
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.push("hello");
			String test = stack.peek();
			assertNotNull("Stack returned null reference", test);
			assertEquals("Returned value is different from pushed value", "hello", test);
		}
		catch(EmptyStackException e){
			//correct behavior
		}
		catch (Exception e){
			fail("testPeek failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}
	
	//test if peek throws exception when stack is empty 
	@Test 
	public void testPeek2(){
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.peek();
		}
		catch(EmptyStackException e){
			//correct behavior
		}
		catch(Exception e){
			fail("testPeek 2 failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}

	//test if pop throws exception when stack is empty
	@Test
	public void testPop(){
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.pop();
		}
		catch(EmptyStackException e){
			//correct behavior`
		}
		catch (Exception e){
			fail("testPop failed \n" + e.getClass() + "\n" + e.getMessage());
		}
	}
	
	//tests if pop returns correct value in order 
	@Test
	public void testPop2() {
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.push("hello");
			stack.push("bye");
			String test = stack.pop();
			String test2 = stack.pop();
			assertNotNull("Stack returned null reference", test);
			assertNotNull("Stack returned null reference", test2);
			assertEquals("Value returned not equal to pushed value", "bye", test);
			assertEquals("Value returned not equal to pushed value", "hello", test2);
		}
		catch (EmptyStackException e){
			fail("testPop failed" + e.getClass() + "\n" + e.getMessage());
		}
		catch (Exception e){
			fail("testPop failed" + e.getClass() + "\n" + e.getMessage());
		}
	}

	//test if return correct value with peek and pop 
	@Test 
	public void testPop3() {
		try{
			MyStack<String> stack = new MyStack<String>();
			stack.push("hello");
			stack.push("bye");
			String test = stack.pop();
			String test2 = stack.peek();
			assertNotNull("Stack returned null reference", test);
			assertNotNull("Stack returned null reference", test2);
			assertEquals("Value returned not equal to pushed value", "bye", test);
			assertEquals("Value returned not equal to peeked value", "hello", test2);
		}
		catch (EmptyStackException e){
			fail("testPop failed" + e.getClass() + "\n" + e.getMessage());
		}
		catch (Exception e){
			fail("testPop failed" + e.getClass() + "\n" + e.getMessage());
		}
	}
	
	//test if correct value is pushed 
	@Test
	public void testPush() {
		try{
			MyStack <String> stack = new MyStack<String>();
			stack.push("hello");
			String test = stack.peek();
			assertNotNull("Stack returned null reference, didn't add element", test);
		}
		catch (Exception e){
			fail("testPush failed" + e.getClass() + "\n" + e.getMessage());
		}
	}

}
