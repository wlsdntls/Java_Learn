package p2023_01_02;

import java.util.Scanner;

public class Pr0102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정수를 입력하세요!");
		Scanner sc = new Scanner(System.in);
		
		int inp= sc.nextInt(); //정수값 입력
		int fac = 1;
		
		for (int i = inp; i>0; i--) {
			fac *= i;
		}
		System.out.println(inp+"! = "+fac);
		
	}

}
