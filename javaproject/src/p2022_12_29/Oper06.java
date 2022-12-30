package p2022_12_29;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3, max, min, temp, temp2;
		System.out.println("정수 3개를 입력하세요?");
		Scanner sc = new Scanner(System.in);		//Scanner 객체 생성
		n1 = sc.nextInt();	//입력값 스페이스바 or 엔터키로 구분	
		n2 = sc.nextInt();		
		n3 = sc.nextInt();		
		
		temp = (n1 > n2) ? n1 : n2;
 		temp2 = (n1 < n2) ? n1 : n2;
		
		max = (n3 > temp)	? n3 : temp;		//최대값
		min = (n3 < temp2)	? n3 : temp2;		//최소값
		
		System.out.println("max:" + max);
		System.out.println("min:" + min);
		
	}

}
