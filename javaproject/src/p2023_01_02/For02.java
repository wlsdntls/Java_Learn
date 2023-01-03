package p2023_01_02;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;				//지역변수 (local variable)
		
		for(int i =1; i < 11; i++) {
			 sum += i;			//sum = sum + i;
	
			 System.out.println(i+"번째 sum="+sum);
		}
		// System.out.println(i);		오류 i가 for문 안에서 정의된 지역변수 이므로 
	}

}
