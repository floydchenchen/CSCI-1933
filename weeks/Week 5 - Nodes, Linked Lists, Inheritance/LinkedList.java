// LinkedList.java
// Implementation of a simple higher level list abstraction for
// a list of integers.  
// This implementation starts to hide the Node details from the user.
// See ListNode,java for the node component used here.
// Note: the abtraction is not complete because the programmer
// must have some awareness of the ListNodes used to form the lists.  
// How would you modify the LinkedList class so that adding integers
// to the list requires no knowledge of ListNodes?


public class LinkedList {
	private ListNode head = null;
	
	public LinkedList() {}
	
	public LinkedList(ListNode h) {
		head = h;
	}
	
	public void add(ListNode nodeToAdd) {
		if(head == null) { 
			head = nodeToAdd;
			return;
		}
		ListNode current = head;
		while(current.hasNext()) {
			current = current.getNext();
		}
		current.setNext(nodeToAdd);
	}
	
	public void addInOrder(ListNode nodeToAdd) {
		if(head == null) {
			head = nodeToAdd;
			return;
		}
		ListNode current = head;
		if(head.getData() > nodeToAdd.getData()) {
			nodeToAdd.setNext(head);
			head = nodeToAdd;
			return;
		}
		while(current.hasNext()) {
			if(current.getNext().getData() >= nodeToAdd.getData())
			{
				nodeToAdd.setNext(current.getNext());
				current.setNext(nodeToAdd);
				return;
			}
			current = current.getNext();
		}
		current.setNext(nodeToAdd);
	}
	
	public void print() {
		if(head == null) {
			return;
		}
		ListNode current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public static void main(String[] args) {
		// add in any order
		LinkedList unorderedList = new LinkedList();
		unorderedList.add(new ListNode(7));
		unorderedList.add(new ListNode(5));
		unorderedList.add(new ListNode(6));
		unorderedList.add(new ListNode(3));
		unorderedList.add(new ListNode(9));
		unorderedList.add(new ListNode(1));
		unorderedList.print();
		
		System.out.println("");
		// adding in order now
		LinkedList orderedlist = new LinkedList();
		orderedlist.addInOrder(new ListNode(7));
		orderedlist.addInOrder(new ListNode(5));
		orderedlist.addInOrder(new ListNode(6));
		orderedlist.addInOrder(new ListNode(3));
		orderedlist.addInOrder(new ListNode(9));
		orderedlist.addInOrder(new ListNode(1));
		orderedlist.print();
	}
	
}
