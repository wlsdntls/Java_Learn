package p2023_01_02;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	   if(조건식1){
//	          조건식1이 참인경우 실행될 문장;
//	   }else if(조건식2){
//	          조건식2가 참인경우 실행될 문장;
//	   }else{
//	          위의 조건식을 만족하지 않을때 실행될 문장;
//	   }		

// 키보드로 정수 3개를 입력 받았을때, 최대값과 최소값을 구하는 프로그램을 작성하세요?

		int n1, n2, n3, max, min;
		System.out.println("정수 3개를 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		// 최대값
		if (n1 >= n2 && n1 >= n3) {
			max = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			max = n2;
		} else {
			max = n3;
		}
		// 최소값
		if (n1 <= n2 && n1 <= n3) {
			min = n1;
		} else if (n2 <= n1 && n2 <= n3) {
			min = n2;
		} else {
			min = n3;
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
