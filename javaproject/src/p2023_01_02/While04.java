package p2023_01_02;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// while문을 이용해서 구구단 2~9단을 출력하는 프로그램 작성
		int dan = 2;
		int i = 1;
		while (dan < 10) {
			System.out.println("[" + dan + "단]");
			
			while (i < 10) {
				System.out.println(dan + "X" + i + "=" + dan * i);
				i++;
			}			// i = 10  이기때문에 i =1 로 초기화 필요
			i = 1;		// i 초기화
			
			dan++;
			System.out.println();
		}
	}
}
