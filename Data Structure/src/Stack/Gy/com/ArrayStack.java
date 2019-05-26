package Stack.Gy.com;

/*
 * 数据结构：数组实现栈的操作
 * By:GY
 * Date:2019/5/21
 */
public class ArrayStack<E> implements Stack<E> {
	
	Array<E> array;
	public ArrayStack(int capacity) {
		array = new Array<>(capacity);
	}
	
	public ArrayStack() {
		array = new Array<>();
	}

	/**
	 * 入栈
	 */
	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		array.addLast(e);
		
	}
	/**
	 * 出栈
	 */
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return array.removeLast();
	}
	/**
	 * 查看栈顶元素
	 */
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return array.getLast();
	}
	/**
	 * 返回栈的长度
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return array.getSize();
	}
	/**
	 * 查看栈是否为空
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return array.isEmpty();
	}
	/**
	 * 返回数组容器长度
	 */
	public int getCapacity() {
		// TODO Auto-generated method stub
		return array.getCapacity();
	}

	 @Override
	    public String toString(){
	        StringBuilder res = new StringBuilder();
	        res.append("Stack: ");
	        res.append('[');
	        for(int i = 0 ; i < array.getSize() ; i ++){
	            res.append(array.get(i));
	            if(i != array.getSize() - 1)
	                res.append(", ");
	        }
	        res.append("] top");
	        return res.toString();
	    }

}
