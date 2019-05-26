package Stack.Gy.com;
/*
 * 数据结构：链表
 * By:GY
 * Date:2019/5/22
 */
public class LinkedList<E> {
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
	//设置虚拟头节点：dummyHead.
	private Node dummyHead;
	//未使用虚拟头节点时：
	//private Node head;
	private int size;
	
	public LinkedList() {
		 dummyHead = new Node(null,null);
		//head = null;
		size = 0;
	}
	/**
	 * 返回链表元素个数
	 */
	public int getSize() {
		return size;
	}
	/**
	 * 判断链表是否为空
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * 在表头添加元素
	 */
	public void addFirst(E e) {
		//未使用虚拟头节点时代码如下:
		//Node node = new Node(e);
		//node.next = head;
		//head = node;
		//size ++;
		//优雅简化代码：head = new Node(e,head);
	      add(0,e);
	}
	/**
	 * 在表中添加元素
	 */
	public void add(int index, E e) {
		if(index > size || index < 0) {
			throw new IllegalArgumentException("cannot add");
		}
		//if(index == 0) {
		//	addFirst(e);
		//}
		Node prev = dummyHead;
		//未使用虚拟头节点时：
		//Node prev = head;
		for(int i = 0; i < index; i ++) {
			prev = prev.next;
		}
		Node node = new Node(e);
		node.next = prev.next;
		prev.next = node;
		//优雅简化代码: prev.next = new Node(e,prev.next);
		size ++;
	}
	/**
	 * 在表的末尾添加元素
	 */
	public void addLast(E e) {
		add(size,e);
	}
	/**
	 * 获得表的第index元素
	 */
	public E get(int index) {
		if(index > size || index < 0) {
			throw new IllegalArgumentException("cannot add");
		}
		Node cur = dummyHead.next;
		for(int i = 0; i < index; i ++) {
			cur = cur.next;
		}
		return cur.e;
	}
	/**
	 * 获得表的第一个元素
	 */
	public E getFirst() {
		return get(0);
	}
	/**
	 * 获得表的最后一个元素
	 */
	public E getLast() {
		return get(size);
	}
	/**
	 * 修改链表的第index元素为e
	 */
	public void set(int index,E e) {
		if(index > size || index < 0) {
			throw new IllegalArgumentException("cannot add");
		}
		Node cur = dummyHead.next;
		for(int i = 0; i < index; i ++) {
			cur = cur.next;
		}
		cur.e = e;
	}
	/**
	 * 修改链表的第一个元素
	 */
	public void setFirst(E e) {
		set(0,e);
	}
	/**
	 * 修改链表的最后一个元素
	 */
	public void setLast(E e) {
		set(size,e);
	}
	/**
	 * 查找链表中是否有e元素
	 */
	public boolean contains(E e) {
		Node cur = dummyHead.next;
		while(cur != null) {
			if(cur.e.equals(e)) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}
	/**
	 * 删除链表中的索引位置元素
	 */
	public E remove(int index) {
		if(index > size || index < 0) {
			throw new IllegalArgumentException("cannot add");
		}
		Node prev = dummyHead;
		for(int i = 0; i < index; i++) {
			prev = prev.next;
		}
		Node curNode = new Node();
		curNode = prev.next;
		prev.next = curNode.next;
		curNode.next = null;
		size--;
		return curNode.e;
	}
	/**
	 * 删除链表第一个元素
	 */
	public E removeFirst() {
		return remove(0);
	}
	/**
	 * 删除链表最后一个元素
	 */
	public E removeLast() {
		return remove(size);
	}
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		Node cur = dummyHead.next;
		while(cur!= null) {
			res.append(cur + "->");
			cur = cur.next;
		}
		res.append("null");
		return res.toString();
	}
} 
