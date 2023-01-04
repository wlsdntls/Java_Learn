package p2023_01_03;

public class MethodEx02 {

	// 1 ~ n 까지 합을 구하는 메소드
	static void sum(int n) {
		int hap=0;
		for(int i=1; i<=n; i++) {
			hap += i;
		}
		System.out.println("1~"+n+"="+hap);
	}

	// 한번 정의된 메소드는 재사용 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(3);
		sum(5);
		sum(100);
		

	}
}
