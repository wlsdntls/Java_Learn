package p2022_12_30;

import java.util.Scanner;

public class Pr02 {

	public static void main(String[] args) {
		int n1, n2, n3, max, min, temp, temp2;
		System.out.println("정수 3개를 입력하세요?");
		Scanner sc = new Scanner(System.in);		//Scanner 객체 생성
		n1 = sc.nextInt();	//입력값 스페이스바 or 엔터키로 구분	
		n2 = sc.nextInt();		
		n3 = sc.nextInt();		
		
		if (n1>n2) {	//n1 n2 중 큰값 temp저장 
			temp = n1;	
		}
		else {
			temp = n2;
		}
		if (temp>n3) {		
			max = temp;
		}
		else {
			max = n3;
		}
		
		if (n1<n2) {	//n1 n2 중 작은값 temp저장 
			temp = n1;	
		}
		else {
			temp = n2;
		}
		if (temp<n3) {		
			min = temp;
		}
		else {
			min = n3;
		}
		
		
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		
	}

}
