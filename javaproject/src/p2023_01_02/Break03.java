package p2023_01_02;

public class Break03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int i = 1;
		int cnt = 0;
		while(true) {
			i++;
			int num = (int)(Math.random()*45) + 1; //난수발생 1~45
			cnt += 1;
			System.out.println(num);
		if(num == 6) break; 		//무한루프 탈출~
		
		}
		System.out.println("6 "+cnt+"번째 등장" );
		System.out.println("프로그램 종료입니다");
	
	}

}
