package p2023_01_04;

// p152 ~ 153
public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {83,90,97};
		
		System.out.println("score[0]:" + score[0]);
		System.out.println("score[0]:" + score[1]);
		System.out.println("score[0]:" + score[2]);
		
		int sum = 0;
		for(int i = 0;	i<score.length; i++)
			sum += score[i];
		
		System.out.println("총점:" +sum);		//총점
		
		double avg = (double)sum/3.0;		//강제 형변환
		System.out.println("평균:" + avg);		//평균
		
		// 평균 값을 소숫점 2째자리까지 출력
		System.out.printf("평균: %.2f", avg);
		System.out.println();
		
		
	}

}
