package Stack.Gy.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> stack = new ArrayStack<>();
		for(int i = 0; i < 5; i++) {
			stack.push(i);
			System.out.println(stack);
		}
		stack.pop();
		System.out.println(stack);

	}

}
