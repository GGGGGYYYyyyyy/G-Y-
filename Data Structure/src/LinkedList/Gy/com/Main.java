package LinkedList.Gy.com;
/*
 * 数据结构：链表测试用例
 * By:GY
 * Date:2019/5/22
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(int i = 0; i < 5; i++) {
			linkedList.addFirst(i);
			System.out.println(linkedList);
		}
		linkedList.add(2, 35);
		System.out.println(linkedList);
		if(linkedList.contains(35)) {
			System.out.println("1");
		}
		linkedList.removeFirst();
		System.out.println(linkedList);
	}

}
