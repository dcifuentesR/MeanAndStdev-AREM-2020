package edu.escuelaing.arem.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import edu.escuelaing.arem.app.LinkedList;

public class LinkedListTest {
	
	@Test
	public void testAddNodes() {
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		assertNull("The first node should be empty on list creation",l.getHead());
		assertNull("The last node should be empty on list creation",l.getTail());
		
		l.add(3);
		assertEquals("firstNode and lastNode should point to the same node",l.getHead(),l.getTail());
	}
	
	@Test
	public void testRemoveNodes() {
		
	}

}
