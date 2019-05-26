package Queue.Gy.com;
/*
 * 数据结构：链表实现队列
 * By:GY
 * Date:2019/5/22
 */
public class LinkedListQueue<E> implements Queue<E> {
	private class Node{
		public E e;
		public Node next;
		
		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}
		public Node(E e) {
			this(e,null);
		}
		public Node() {
			this(null,null);
		}
		@Override
		public String toString() {
			return e.toString();
		}
	}
	private Node head,tail;
	private int size;

	public LinkedListQueue(LinkedListQueue<E>.Node head, LinkedListQueue<E>.Node tail, int size) {
		super();
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if(tail == null) {
			tail = new Node(e);
			head = tail;
		}
		else {
			tail.next = new Node(e);
			tail = tail.next;
		}
		size ++;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalArgumentException("cannot dequeue");
		}
		Node retNode = head;
		head = head.next;
		retNode.next = null;
		if(head == null) {
			tail = null;
		}
		size --;
		return retNode.e;
	}

	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalArgumentException("cannot dequeue");
		}
		return head.e;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Queue: front");
		Node cur = head;
		while(cur!= null) {
			res.append(cur + "->");
			cur = cur.next;
		}
		res.append("null tail");
		return res.toString();
	}


}
