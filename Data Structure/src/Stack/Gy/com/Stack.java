package Stack.Gy.com;
/*
 * 数据结构：Stack接口
 * By:GY
 * Date:2019/5/21
 */
public interface Stack<E> {
	void push(E e);
	E pop();
	E peek();
	int getSize();
	boolean isEmpty();
}
