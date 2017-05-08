// ListNode.java
// Node class for use by the LinkedList class
// Similar to the NodeClass.java class except includes hasNsxt() method

public class ListNode {
	private int data;
	private ListNode next = null;
	
	public ListNode(int data) {
		this.data = data;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public void setNext(ListNode nodeToAdd) {
		next = nodeToAdd;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int dataToSet) {
		data = dataToSet;
	}
}
