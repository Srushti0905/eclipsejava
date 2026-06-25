//package com.mmcoe.ds;
//
//public class LinkedList<Z> {
//	
//private class Node{
//	
//	private Z data;
//	public Node next;
//	
//	public Node(Z data){
//		this.data = data;
//		
//	}
//	public Z getData() {
//		return data ;
//	}
//}
//	private Node head, last;
//	private int size;
//	
//	
//	public void add(Z data) {
//	    Node n = new Node(data);
//
//	    if(head == null)
//	        head = n;
//	    else
//	        last.next = n;
//	    
//
//	    last = n;
//	    size++;
//	}
//	void insert(int idx, Z data) throws IllegalArgumentException {
//
//	    if(idx < 0 || idx > size)
//	        throw new IllegalArgumentException("Index out of bounds");
//
//	    Node n = new Node(data);
//
//	    if(idx == 0) {
//	        n.next = head;
//	        head = n;
//	    }
//	    else {
//	        Node t = head;
//	        for(int c = 1; true; c++, t = t.next) {	
//	        	if(c== idx) {
//	        		n.next =t.next;
//	        		t.next = n;
//	        		break;
//	        	}
//	        	
//	        }
//	            
//
//	        
//	    }
////	    if(idx == size)
////	        last = n;
//	    size++;
//	}
//	
//	public void remove(int idx) {
////		Node cur = head,prev;
////		for(int c =1;true;c++,prev =cur,cur=cur.next) {
////			if(c==idx) {
////				t.next =t.next.next;
////				break;
////				
////			}
////		}
//		if(idx == 0) {
//	        head = head.next;
//	    }
//	    else {
//		Node t = head;
//        for(int c = 1; true; c++, t = t.next) {	
//        	if(c== idx) {
//        		if(t.next == last)last =t;
//        		t.next = t.next.next;
//        		break;
//        	}
//        	
//        }
//	    }
//		size --;
//	}
//	public void print() {
//	    Node t = head;
//	    while(t != null) {
//	        System.out.println(t.getData());
//	        t = t.next;
//	    }
//	}
//
//
//}


package com.mmcoe.ds;

public class LinkedList<T> {
	private class Node {
		private T data;
		private Node next;
		
		public Node(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}
	}
	
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}		
	private Node head,last;
	private int size;
	
	public void add(T data) {
		Node n = new Node(data);
		if(head == null) {
			head =n;
		} else
			last.next=n;
		last = n;
		size++;
	}
	
	
	public void print() {
		Node t = head;
		while(t != null) {
			System.out.println(t.getData());
			t = t.next;
		}
	}
	
	public void insert(int idx, T data) {
		if(idx > size) {
			throw new IllegalArgumentException("Index out of bound");
		}
		Node n = new Node(data);
		
		if (idx == 0) {
			n.next = head;
			head = n;
			return;
		}
		
		Node temp = head;
	    for(int i = 0; i < idx - 1; i++)	    {
	        temp = temp.next;
	    }

	    n.next = temp.next;
	    temp.next = n;
	    
	    size++;
//	    if ()
				
	}
	
	public void remove(int idx) {
		if (head == null) {
			return;
		}
		
		if (idx == 0) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		
		for(int i = 0; i < idx-1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
			
	
		
		size--;
}


	
	}