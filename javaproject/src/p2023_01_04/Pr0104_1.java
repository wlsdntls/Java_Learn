package p2023_01_04;

import java.util.Scanner;

public class Pr0104_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//배열에 저장된 데이터 중에서 최대값과 최소값을 구하는 프로그램을 작성하세요
		
		System.out.println("정수 5개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5]; // data[0~4]
//데이터 초기화
		for (int j = 0; j< data.length; j++) {		
			data[j] = sc.nextInt();
		}
	
		int max, min;		//최대 최소 변수
		max = data[0];
		min = data[0];

		for (int i = 1; i < data.length; i++) {	//data[0] 값과 비교 max min 지정
			if (data[i] > max) {
				max = data[i];
			}
			if (data[i] < min) {
				min = data[i];
			}
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);
		
		sc.close();
	}

}
