package p2022_12_30;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 2개를 입력 하세요.");

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);

		if (n1 > n2) {
			System.out.println(n1 + "이" + n2 + "보다 크다.");
		} else {
			System.out.println(n2 + "이" + n1 + "보다 크다.");
		}
		sc.close();
	}

}
