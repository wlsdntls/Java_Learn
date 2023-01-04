package p2023_01_03;

public class Continue03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// continue 문을 이용해서 1~100까지 정수 중에서 5의 배수만 출력
		for (int i = 1; i < 101; i++) {
			if (i % 5 != 0) {
				continue;
			}
			System.out.println("5의배수" + i);
		}

	}

}
