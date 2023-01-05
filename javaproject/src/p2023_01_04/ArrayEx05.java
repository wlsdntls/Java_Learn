package p2023_01_04;

// p154
public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for(int i = 0 ; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		// add 메소드 호출  : 주소값 호출방식
		int sum2 = ArrayEx05.add(new int[] {83,80,87});		//add 메소드 호출
		System.out.println("총합 sum2 : " + sum2);
	}	//main() end
	
	//사용 자 정의 메소드 : 합을 구해주는 역할
	//매개변수에서 배열 정의
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
			
		}
		return sum;		//return 호출한 곳에  sum반환
	}
	
}
