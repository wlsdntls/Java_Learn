package p2023_01_03;

import java.util.Scanner;

public class MethodEx03 {

// 키보드로 입력한 2개의 정수 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요
// 단 메소드를 이용해 작성하세요
	
	//최대값
	static int max(int a, int b) {		//매
	if(a>b) 
		return a;
	else
		return b;
}
	//최소값
	static int min(int a, int b) {
		if(a < b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요");
		n1 = sc.nextInt();				//n1입력
		n2 = sc.nextInt();				//n2입력
		
		max = MethodEx03.max(n1,n2);	//max() 메소드 호출
		min = MethodEx03.min(n1,n2);	//min()	메소드 호출
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
				
	}

}
