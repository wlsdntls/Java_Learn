package p2023_01_03;

public class Pr0103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 구구단 2~9단 출력하는 프로그램 작성   - 다중 for문  활용
		

		for(int k=2;k<=9;k++) {
			System.out.print("제 "+k+"단	"); // 단 이름
		}                                  
		System.out.println(); // 없으면 구구단으로 줄바꿈이 되지 않음

		for(int j=1;j<=9;j++) {
					
			for(int i=2;i<=9;i++) {

				System.out.print(i+"X"+j+"="+(i*j)+"\t");
			}                      
			System.out.println("");
		} System.out.println("");// 구분용 빈줄 

		
	}

}
