package p2023_01_02;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 구구단 2~9단 출력하는 프로그램 작성   - 다중 for문  활용
		
		for (int dan = 2; dan <= 9; dan++) { // 단
			System.out.println(dan + "단"); // 타이틀

			for (int i = 1; i <= 9; i++) { // 곱
				System.out.println(dan + "X" + i + "=" + dan * i);
			}
			System.out.println(); // 줄 간격벌리기
		}

	}

}
