package exam2013.q4;

import java.util.Scanner;

public class SummingInts {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("input 10 number.");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += sc.nextInt();
		}
		System.out.println("the sum is :" + sum);
	}

}
