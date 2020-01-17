package edu.escuelaing.arem.app;

import java.util.ListIterator;

public class NodeIterator implements ListIterator<Node> {
	
	int nextIndex;
	Node nextNode;
	Node currentNode;
	Node prevNode;
	
	public NodeIterator(int index) {
		
	}

	public boolean hasNext() {
		return nextNode != null;
	}

	public Node next() {
		return nextNode;
	}

	public void add(Node e) {
		// TODO Auto-generated method stub
		
	}

	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Node previous() {
		// TODO Auto-generated method stub
		return null;
	}

	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

	public void set(Node e) {
		// TODO Auto-generated method stub
		
	}

}
