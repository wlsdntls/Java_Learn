package p2022_12_29;

import java.util.Scanner;

public class Pr1 {
	public static void main(String[] args) {
		int n1, n2, n3, max, min, temp, temp2;
		System.out.println("정수 3개를 입력하세요?");
		Scanner sc = new Scanner(System.in);		//Scanner 객체 생성
		n1 = sc.nextInt();	//입력값 스페이스바 or 엔터키로 구분	
		n2 = sc.nextInt();		
		n3 = sc.nextInt();		
		
		if (n1>n2) {	//n1 n2 중 큰값 temp 작은값 temp2에 저장 temp > temp2 고정
			temp = n1;
			temp2 = n2;
		}
		else {
			temp = n2;
			temp2 = n1;
		}
//						----------------------
		if (temp>n3 & temp2>n3) {			//n3와 temp, temp2 비교 	
			max = temp;
			min = n3;
		}
		else if (temp > n3) {				// min값 temp2 n3 결정
			max = temp;
			min = temp2;
		}
		else {
			max = n3;
			min = temp2;
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
	}
}