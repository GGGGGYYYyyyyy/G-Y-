package Queue.Gy.com;

import Stack.Gy.com.Array;

/*
 * 数据结构：数组实现队列的操作
 * By:GY
 * Date:2019/5/22
 */
public class ArrayQueue<E> implements Queue<E> {
	
	Array<E> array;
	public ArrayQueue(int capacity) {
		array = new Array<>(capacity);
	}
	
	public ArrayQueue() {
		array = new Array<>();
	}
	/**
	 * 入队操作
	 */
	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		array.addLast(e);
	}
	@Override
	 public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }

	/**
	 * 出队操作
	 */
	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return array.removeFirst();
	}
	/**
	 * 查看队首操作
	 */
	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		return array.getFirst();
	}
	/**
	 * 返回队列长度
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return array.getSize();
	}
	/**
	 * 查看队列是否为空
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return array.isEmpty();
	}
	/**
	 * 返回数组的容器长度
	 */

	public int getCapacity() {
		// TODO Auto-generated method stub
		return array.getCapacity();
	}

}
