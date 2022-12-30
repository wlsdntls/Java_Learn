package p2022_12_29;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		조건 연산자		
//		
//		변수 = (조건식) ? 값1 : 값2;
//		조건식이 참이면 값1을 변수에 할당하고,
//		조건식이 거짓이면 값2를 변수에 할당한다.
		
		
//n1 n2 비교 최대값 최소값 구하기		
		int n1, n2, max, min;
		System.out.println("정수 2개를 입력하세요?");
		Scanner sc = new Scanner(System.in);		//Scanner 객체 생성
		n1 = sc.nextInt();	//입력값 스페이스바 or 엔터키로 구분	
		n2 = sc.nextInt();		
	
		max = (n1 > n2)	? n1 : n2;		//최대값
		min = (n1 < n2)	? n1 : n2;		//최소값
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	}

}
