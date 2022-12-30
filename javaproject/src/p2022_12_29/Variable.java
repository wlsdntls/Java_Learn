package p2022_12_29;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 변수 : 메모리상에 데이터를 저장하기 위한 기억 공간의 이름
// 변수 생성 방법 : 자료형 변수명 = 데이터(값);

// 기본 자료형 변수
// 1. 정수형
		byte b1 = 10; // -128 ~ 127
//			byte b2 = 130;	//오버플로우 발생
		System.out.println("b1=" + b1);

		short s = 100; // -32768 ~32767
		System.out.println("s=" + s);

		int i = 10000; // -21억 ~ 21억
		System.out.println("i=" + i);

		long l = 1000000000000L;
		System.out.println("l=" + l);

// 2.실수형 변수
		float ft1 = 3.14f; // float형은 f를 붙여야 한다.
		float ft2 = 3.14F; // float형은 f를 붙여야 한다.
		float ft3 = (float) 3.14; // f를 안붙이면 double 로 인식하므로 (float) 붙이기
		System.out.println("f=" + ft1);
		System.out.println("f=" + ft2);
		System.out.println("f=" + ft3);

		double d = 42.195;
		System.out.printf("d=%.1f\n", d); // printf %.1f 소수 첫쨰
		System.out.printf("d=%.2f\n", d); // printf %.2f 소수 둘째

// 3. 문자형 변수
		char c1 = 'A';
		char c2 = '안';
		System.out.println("c1=" + c1);
		System.out.println("c1=" + c2);

// 4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1= " + bn1);
		System.out.println("bn2= " + bn2);
// 참조형 변수 : 클래스							//데이터 값이 아닌 데이터의 (heap)주소값을 저장  데이터는 heap이라는 메모리에 저장
		String s1 = "자바";					
		String s2 = new String("자바");		//new 연산자를 통해서 String Class 생성	

		if (s1 == s2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		} // 변수 값이 아닌 주소 비교
		if (s1.equals(s2)) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

// 참조형 변수 : 배열 - 동일한 자료형의 데이터를 저장하는 정적인 자료구조
			int[] score = {80,90,100};
			
			for(int j=0; j<score.length; j++) {
				System.out.print(score[j]+"\t"); 		//\t tab
			}
		System.out.println();
		
// 참조형 변수 : 인터페이스(List)
// 1. 순차적인 자료구조
// 2. 여러가지 자료형의 데이터를 모두 저장할 수 있다.
// 3. 동적으로 공간의 크기를 늘릴 수 있다.

		//	List list = new List();	//오류발생
			List list = new ArrayList();		//왼쪽의 클래스와 오른쪽 클래스가 다르면 형변환 	(자료형변환)
			list.add(30);
			list.add(3.14);
			list.add('j');
			list.add(true);
			list.add("자바");
			
		for(int k =0; k<list.size(); k++) {
			System.out.print(list.get(k)+"\t");			
	
			
			
		}
		System.out.println();

	}
}