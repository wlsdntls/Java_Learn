package p2023_01_02;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//while문을 이용해서 1~100까지 홀수, 짝수의 합을 구하는 프로그램을 작성하세요
//단, while문 1개와 if ~ else문 사용
		int odd = 0, even = 0;
		int i = 0;
		while (i <= 100) {
			if (i % 2 == 0) { // 짝수
				even += i;

			} else { 		// 홀수
				odd += i;
				
			}
			i++;
		}
		System.out.println("홀수 합" + odd);
		System.out.println("짝수 합" + even);

	}

}
