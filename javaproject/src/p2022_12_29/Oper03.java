package p2022_12_29;

public class Oper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//비교 연산자 : >, >=, <, <=, ==(같다), !=(같지않다)
//비교 연산자 결과 참 true, 거짓 false 값 리턴

		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);	//true
		boolean result2 = (num1 != num2);	//false
		boolean result3 = (num1 <= num2);	//true
		
		
		System.out.println("result1:" + result1); 
		System.out.println("result2:" + result2); 
		System.out.println("result3:" + result3); 
		System.out.println(num1 < num2); //false
		
		char c1 = 'A';		//65  		//문자끼리 비교는 아스키 코드로 비교
		char c2 = 'B';		//66
		boolean result4 = (c1 <= c2);
		System.out.println("result4:" + result4); //true
		
	}

}
