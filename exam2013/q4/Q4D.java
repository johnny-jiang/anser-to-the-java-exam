package exam2013.q4;

public class Q4D {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StringBuilder sb1 = new StringBuilder("dessert");
		sb1.append(" apples");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder("123");
		// sb2.append(" there!").delete(0, 4).insert(0, "Hello");
		sb2.append(" there!").delete(4, 0).insert(0, "Hello");
		System.out.println(sb2);
	}

}
