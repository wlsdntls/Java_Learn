package p2023_01_02;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// do ~ while문으로 1~100까지 홀수, 짝수의 합 구하는 프로그램
		int odd = 0, even = 0, i = 0;
		do {
			if (i % 2 == 0) { // 짝수 even
				even += i;
			} else {
				odd += i; // 홀수 odd
				
			}
			i++; 			//증감식

		} while (i <= 100);

		System.out.println("짝수합" + even);
		System.out.println("홀수합" + odd);
	}
}
