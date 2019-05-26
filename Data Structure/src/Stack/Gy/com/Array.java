package Stack.Gy.com;

import java.util.Arrays;

/*
 * 数据结构：数组
 * By:GY
 * Date:2019/5/17
 */
public class Array<E> {
	private int size;
	private int capacity;
	private E[] arr;
    /**
         *有参构造函数，传入数组容量capacity
     */
	public Array(int capacity) {
		arr = (E[])new Object[capacity];
		size = 0;

		
	}
    /**
         *无参构造函数，默认capacity为10
     */
	public Array() {
		this(10);
	}
	/**
	 *获取size的值
	 * @return
	 */
	public int getSize() {
		return size;
	}
	/**
	  *获取capacity的值
	 */
	public int getCapacity() {
		return arr.length;
	}
	/**
	 *判断数组是否为空
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * 在index位置插入e
	 */
	public void add(int index,E e) {
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed.Illegal inidex.");
		}
		//动态的增加数组
		if(size == arr.length) {
			resize(2*arr.length);
		}
		//从最后一个元素开始
		for(int i = size; i >= index; i--) {
			arr[i + 1] = arr[i]; 
		}
		arr[index] = e;
		size++;
	}
	/**
	 * 向所有元素最后添加元素e
	 */
	public void addLast(E e) {
		add(size,e);
	}
	/**
	 * 向数组头添加元素e
	 */
	public void addFirst(E e) {
		add(0,e);
	}
	/**
	 * 获取index索引位置的元素
	 */
	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("Get failed.");
		}
		return arr[index];
	}
	/**
	 * 找到最后一个元素
	 */
	public E getLast() {
		return get(size - 1);
	}
	/**
	 * 找到第一个元素
	 */
	public E getFirst() {
		return get(0);
	}
	/**
	 * 修改index索引位置的元素
	 */
	public void set(int index,E e) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("Set failed.");
		}
		arr[index] = e;
	}
	/**
	 * 查找数组中是否包含该元素
	 */
	public boolean contains(E e) {
		for(int i = 0; i < size; i++) {
			if(arr[i].equals(e)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 查找并返回索引index
	 */
	public int find(E e) {
		for(int i = 0 ; i < size; i++) {
			if(arr[i] == e) {
			    return i;
			}
		}
		return 0;
	}
	/**
	 * 删除索引为index的数据，并返回值
	 */
	public E remove(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("remove failed.");
		}
		E ret = arr[index];
		for(int i = index + 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		size--;
		//动态缩小数组
		if(size == arr.length / 2) {
			resize(arr.length / 2);
		}
		return ret;
	}
	/**
	 * 删除最后一个元素
	 */
	public E removeLast() {
		return remove(size - 1);
	}
	/**
	 * 删除第一个元素
	 */
	public E removeFirst() {
		return remove(0);
	}
	/**
	 * 删除指定元素
	 */
	public void removeElement(E e) {
		int index = find(e);
		if(index != 0) {
		   remove(index);
		}
	}
	/**
	 * 对数组进行扩容，以达到动态数组的目的
	 */
	private void resize(int newCapacity) {
		E[] newArr = (E[])new Object[newCapacity];
		for(int i = 0; i < size; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	 @Override
	    public String toString(){

	        StringBuilder res = new StringBuilder();
	        res.append(String.format("Array: size = %d , capacity = %d\n", size, arr.length));
	        res.append('[');
	        for(int i = 0 ; i < size ; i ++){
	            res.append(arr[i]);
	            if(i != size - 1)
	                res.append(", ");
	        }
	        res.append(']');
	        return res.toString();
	    }
	}
