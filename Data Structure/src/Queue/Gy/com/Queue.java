package Queue.Gy.com;
/*
 * 数据结构：队列的接口
 * By:GY
 * Date:2019/5/22
 */
public interface Queue<E> {

	void enqueue(E e);
	E dequeue();
	E getFront();
	int getSize();
	boolean isEmpty();
}
