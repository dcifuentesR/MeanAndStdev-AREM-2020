package edu.escuelaing.arem.app;

public class Node {
	
	private Node nextNode;
	private Node prevNode;
	
	private int value;
	
	public Node(int value) {
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}

}
