package p2022_12_30;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if(조건식){
//	         조건식이 참인 경우 실행될 문장;
//	    }

	// if 10 > 5 {} 조건식 괄호 필수 (오류발생)
		
		if(10 > 5) {
			System.out.println("실행1");
		}
		
	//실행 될 문장이 1줄인 경우에 중괄호 생략 가능
		if(10 > 5) System.out.println("실행2");
		
		if(true) {
			System.out.println("무조건 실행");
		}
		if(false) {
			System.out.println("실행안됨");
		}
		if (10>30)
			System.out.println("출력안됨");
			System.out.println("조건식 적용 받지않고 실행");
	}

}
