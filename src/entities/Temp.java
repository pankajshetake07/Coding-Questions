package entities;

public class Temp {

	public static void main(String[] args) {
		int n = 5, a = 0, b = 1;
		for(int i=0; i<=n; i++) {
			int next = a+b;
			System.out.println(a);
			a = b;
			b = next;
		}
		String s = "Hello";
		s = s.toLowerCase();
		//s = s.concat("bye");
		System.out.println(s);
		System.out.println(50 + 50 + "hello");
		System.out.println("hello"+50+50);
	}

}
