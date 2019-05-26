package Array.Gy.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array<Integer> Arr = new Array<>(20);
		for(int i = 0; i < 5; i++) {
			Arr.addLast(i);
		}
		System.out.println(Arr);
		
		Arr.add(1, 100);
		System.out.println(Arr);
	
		Arr.remove(3);
		System.out.println(Arr);
		Arr.removeLast();
		System.out.println(Arr);
	}
}
