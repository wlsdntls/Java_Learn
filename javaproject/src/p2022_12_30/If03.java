package p2022_12_30;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 키보드로 정수 2개를 입력 받았을 때, 최대값가 최소값을 구하는 프로그램
		int n1, n2, max, min;
		System.out.println("정수 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);

		sc.close();
	}

}
