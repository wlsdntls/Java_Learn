package p2023_01_05;

public class StringEx01 {
// p148
	public static void main(String[] args) {
		// TODO Auto-generated method stub

// String 객체
// == : 참조하는 주소를 비교
// equals() : 참조하는 값(데이터) 를 비교

		String str1 = "자바";
		String str2 = "자바";
		// 참조 주소 비교
		if (str1 == str2) {
			System.out.println("같은 주소"); // 같은 주소
		} else {
			System.out.println("다른 주소");
		}

		String str3 = new String("자바");
		String str4 = new String("자바");

		if (str3 == str4) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소"); // 다른 주소
		}
		// 참조값 비교
		if (str1.equals(str2)) {
			System.out.println("참조 값 같은 값");
		} else {
			System.out.println("참조 값 다른 값");
		}

		if (str3.equals(str4)) {
			System.out.println("참조 값 같은 값");
		} else {
			System.out.println("참조 값 다른 값");
		}

		boolean b = "자바".equals("파이썬");
		if (b) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

		if ("오라클".equals("스프링")) {
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값");
		}

	}

}
