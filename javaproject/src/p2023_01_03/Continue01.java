package p2023_01_03;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue문
		// 1. 다시 반복문으로 돌아 가라는 의미를 가지고 있다.
		// 2. continue문이 실행되면, continue문 아래쪽 내용들은 실행되지 않고 다시 반복문으로 돌아감

		for (int i = 1; i <= 10; i++) {
			
			if(i==5) continue;
			System.out.println("출력:" + i);
			}

	}

}
