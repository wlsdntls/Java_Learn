package p2023_01_03;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
// 변수 -> 배열 -> 자료구조(List)		

// 1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않는 경우에 주로 사용하는 형식

		int[] score = new int[3];
//		자료형    배열변수	   연산자  자료형[배열크기]		
//		int score[] = new 	int[3];

		// int형 배열은 자동으로 0으로 초기화
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);

		score[0] = 80;
		score[1] = 90;
		score[2] = 100;

		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		// double형 배열은 자동으로 0으로 초기화
		double[] d = new double[3];
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);

		// char형 배열 자동으로 초기화가 되지 않는다
		char[] c = new char[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);

		// boolean 배열 false값으로 초기화
		boolean[] b = new boolean[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);

		// String같은 참조형은 null로 나옴
		String[] str = new String[3];
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);

		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스프링";
		System.out.println(str[0]); // 자바
		System.out.println(str[1]); // 오라클
		System.out.println(str[2]); // 스프링

// 1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할 때 주로 사용되는 형식
//					(배열에 할당될 값이 정해져 있는 경우에 주로 사용함)		
		// 동일한 자료형만 사용가능
		int[] s = { 80, 90, 100 };
		int[] s1 = new int[] { 80, 90, 100 };
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

		System.out.println("배열의 크기" + s.length); // 배열의 크기 구하기
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "\t");
		}
		System.out.println();

		double[] dd = { 3.14, 10.5, 42.195, 50 };
		for (int i = 0; i < dd.length; i++) {
			System.out.print(dd[i] + "\t");
		}
		System.out.println();

		char[] cc = { 'j', 'a', 'v', 'a', '자', '바' };
		for (int i = 0; i < cc.length; i++) {
			System.out.print(cc[i] + "\t");
			
		}
		System.out.println();

		boolean[] bb = { true, false, true };
		for (int i = 0; i < bb.length; i++) {
			System.out.print(bb[i] + "\t");
		}
		System.out.println();

		String[] str1 = { "자바", "오라클", "스프링", "파이썬", "텐스플로우" };
		String[] str2 = new String[] { "자바", "오라클", "스프링", "파이썬", "텐스플로우" };
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str1[i] + "\t");
		}
	}

}
