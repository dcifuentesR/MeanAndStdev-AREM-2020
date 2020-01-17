package edu.escuelaing.arem.app;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList extends AbstractSequentialList{

	@Override
	public ListIterator listIterator(int index) {
		
		return new ;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	private Node firstNode;
//	private Node lastNode;
//	
//	public LinkedList() {
//		firstNode=null;
//		lastNode=null;
//	}
//	
//	public boolean add(Node node) {
//		lastNode.setNextNode(node);
//		node.setPrevNode(lastNode);
//		lastNode=node;
//		//REVISAR CASOS EN QUE RESPONDA FALSE
//		return true;
//	}
//
//	public void add(int index, Node element) {
//		Node currentNode=firstNode;
//		for(int i=0;i<index;i++)
//			currentNode=currentNode.getNextNode();
//		
//		
//		
//		
//	}
//
//	
//	
////	public void addLastNode(Node node) {
////		lastNode.setNextNode(node);
////		node.setPrevNode(lastNode);
////		lastNode=node;
////	}
////	
////	public void addFirstNode(Node node) {
////		firstNode.setPrevNode(node);
////		node.setNextNode(firstNode);
////		firstNode=node;
////	}
////	
////	public void removeFirstNode() {
////		Node newFirstNode=firstNode.getNextNode();
////		newFirstNode.setPrevNode(null);
////		firstNode=newFirstNode;
////		
////	}
////	
////	public void removeLastNode() {
////		Node newFirstNode=firstNode.getNextNode();
////		newFirstNode.setPrevNode(null);
////		firstNode=newFirstNode;
////		
////	}
//
//	public Node getFirstNode() {
//		return firstNode;
//	}
//
//	public Node getLastNode() {
//		return lastNode;
//	}
//
//	@Override
//	public ListIterator listIterator(int arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int size() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	

}
