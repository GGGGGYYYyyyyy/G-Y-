package Queue.Gy.com;

import java.util.Arrays;

/*
 * 数据结构:循环队列的实现
 * By:GY
 * 队首：front，队尾：tail.
 * 队列中的元素个数：size.
 * Date:2019/5/22
 */
public class LoopQueue<E> implements Queue<E> {
	private E[] data;
	private int front,tail;
	private int size;

	public LoopQueue(int capacity) {
		data = (E[])new Object[capacity + 1 ];
		front = 0;
		size = 0;
		size = 0;
	}
	public LoopQueue() {
		this(10);
	}
	/**
	 * 扩容，达到动态数组
	 */
	private void resize(int capacity) {
		E[] newData = (E[]) new Object[capacity + 1];
		for(int i = 0; i < size; i ++) {
			newData[i] = data[(i + front) % data.length];
		}
		data = newData;
		front = 0;
		tail = size;
	}
	/**
	 * 入队
	 */
	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		//队满，扩容
		if(front == tail) {
			resize(getCapacity() * 2);
		}
		data[tail]  = e;
		tail = (tail + 1) % data.length;
		size ++;
	}
	/**
	 * 出队
	 */
	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalArgumentException("can't dequeue. Queue is empty");
		}
		E ret = data[front];
		front = (front + 1) % data.length;
		size --;
		//缩容操作
		if(size == getCapacity() / 4 && getCapacity() / 2 != 0) {
			resize(getCapacity() / 2);
		} 
		return ret;
	}

	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalArgumentException("can't dequeue. Queue is empty");
		}
		return data[front];
	}
	/**
	 * 返回队列长度
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	/**
	 * 查看队列是否为空
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front == tail;
	}
	/**
	 * 返回数组的容器长度
	 */
	public int getCapacity() {
		// TODO Auto-generated method stub
		return data.length - 1;
	}
	 @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
        res.append("front [");
        for(int i = front ; i != tail ; i = (i + 1) % data.length) {
           res.append(data[i]);
           if((i + 1) % data.length != tail)
	              res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
