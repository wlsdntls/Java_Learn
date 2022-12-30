package p2022_12_30;

public class Oper09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////5. 확장 대입 연산자
//	     +=, -=, *=, /=, %=
//
//	    	     ex) 중요 a+=b;	// a = a + b;
//	    	            a-=b; 	// a = a - b;
//	    	            a*=b; 	// a = a * b;
//	    	            a/=b; 	// a = a / b;
//	    	            a%=b;	// a = a % b;

		int a = 10, b = 3;
		System.out.println(a+=b); 	// a = a+b 13 -> a 13저장 
		System.out.println(a-=b);	// a = a-b 10 -> a 10저장
		System.out.println(a*=b);	// a = a*b 30 -> a 30저장
		System.out.println(a/=b);	// a = a/b 10 -> a 10저장
		System.out.println(a%=b);	// a = a%b 1  -> a 1저장
		
	}

}
