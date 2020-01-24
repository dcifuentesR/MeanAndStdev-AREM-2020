package edu.escuelaing.arem.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class LinkedList<T> implements List<T>,Iterable<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public boolean add(T data) {
		Node<T> node = new Node<T>(data);
		if (head == null)
			tail = head = node;
		else {
			tail.setNextNode(node);
			tail = node;
		}
		size++;
		return true;
	}

	// return Head
	public Node<T> getHead() {
		return head;
	}

	// return Tail
	public Node<T> getTail() {
		return tail;
	}

	// return Iterator instance
	public Iterator<T> iterator() {
		return new ListIterator<T>(this);
	}
	
	class ListIterator<T> implements Iterator<T>{
		private Node<T> current;
		
		public ListIterator(LinkedList<T> list) {
			current=list.getHead();
		}

		public boolean hasNext() {
			return current !=null;
		}

		public T next() {
			T value =current.getValue();
			current = current.getNextNode();
			return value;
		}
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public java.util.ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public java.util.ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
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
