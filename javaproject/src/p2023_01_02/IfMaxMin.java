package p2023_01_02;


import java.util.Scanner;

public class IfMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, n3, max, min;
		System.out.println("정수 3개를 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			max = n1;
			min = n2;
		}else {
			max = n2;
			min = n1;
		}
		
		if(max > n3) {			// 최대값
			max = max;
		}else {
			max = n3;
		}
		if(min < n3) {			// 최소값
			min = min;
		}else {
			min = n3;
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
