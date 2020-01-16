package edu.escuelaing.arem.app;

public class LinkedList {
	
	private Node firstNode;
	private Node lastNode;
	
	public LinkedList() {
		firstNode=null;
		lastNode=null;
	}
	
	public void addLastNode(Node node) {
		lastNode.setNextNode(node);
		node.setPrevNode(lastNode);
		lastNode=node;
	}
	
	public void addFirstNode(Node node) {
		firstNode.setPrevNode(node);
		node.setNextNode(firstNode);
		firstNode=node;
	}

}
