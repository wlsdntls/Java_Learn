package p2023_01_02;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 1 ~ 100 까지 홀수, 짝수의 합을 구하는 프로그램		
		int odd = 0, even = 0;
		
		//홀수의 합					i+=2
		for (int i = 1; i <= 100; i+=2) {
			odd += i; 				// odd = odd +i;
		}
		
		//짝수의 합
		for (int i =0; i <=100; i+=2) {
			even += i;				// even = even + i;
		}
		System.out.println("1~100까지 홀수의 합" + odd);
		System.out.println("1~100까지 짝수의 합" + even);
	}

}
