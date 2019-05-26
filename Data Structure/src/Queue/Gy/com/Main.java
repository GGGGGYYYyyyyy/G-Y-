package Queue.Gy.com;
/*
 * 数据结构：队列测试用例
 * By:GY
 * Date:2019/5/22
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayQueue<Integer> queue = new ArrayQueue<>();
		LoopQueue<Integer> queue2 = new LoopQueue<>();
		for(int i = 0; i < 4; i++) {
			queue.enqueue(i);
			queue2.enqueue(i);
			System.out.println(queue);
			System.out.println(queue2);
		}
		queue.dequeue();
		System.out.println(queue);
		queue2.dequeue();
		System.out.println(queue2);
	}

}
