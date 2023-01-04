package p2023_01_03;

public class MethodEx01 {

	// 메소드 : 여러가지 코드르르 묶어 놓은것
	// 메소드를 사용하는 이유는 코드를 재사용하기 위함.
	// 메소드 안 메소드 불가

	// 사용자 정의 메소드
	// 사용자 정의 메소드는 프로그래머가 직접 호출해야 실행됨.
	public static void check() { // static : 정적 메소드
		System.out.println("메소드 호출 성공");
		return; // void 이므로 생략가능
	}

	// 값 전달에 의한 메소드 호출방식(Call by Value방식)
	static void check(int a) { // 매개변수(parameter) : int a = 30;
		System.out.println("전달된값 : " + a);
	}

	static void check(int a, double d) {
		double result = a + d;
		System.out.println("전달된 값의 합:" + result);
	}

	static void check(char c) {
		System.out.println("전달된 값 :" + c);
	}

	static void check(boolean b) {
		System.out.println("전달된 값 :" + b);
	}

	// 주소값 전달에 의한 메소드 호출 (Call by Reference 방식)
	static void check(String s) { // String s="자바";
		System.out.println("전달된 값" + s); // String s = new String("파이썬");
	}

	// return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
	// return문은 메소드 가장 마지막 줄에 사용해야 한다.
	static int check01() {
		System.out.println("리턴 구문");
		return 50;
	}

	static double check02(int a, double d) {
		double result = a + d;		//Stack이라는 메모리에 일시저장
		System.out.println("");
		return result;
		
	}
	//main() 메소드는 자바가상머신(java.exe.)로만 호출
	//main() 메소드는 사용자가 직접 호출 불가
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx01.check(); // check 메소드 호출
		check();
		check(30);
		check(15, 20.5);
		check('A');
		check(true);
		check("java");
		check(new String("파이썬")); // 주소값 전달 메소드 호출

		check01(); // return문 50출력 X
		int result = check01();
		System.out.println("돌려 받은 값 1 : " + result);
		System.out.println("돌려 받은 값 2 : " + check01());

		double result2 = check02(50, 3.14);
		System.out.println("돌려 받은 값 3 : " + result2);
		System.out.println("돌려 받은 값 4 : " + check02(50, 3.14));
	}
}
