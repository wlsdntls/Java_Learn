package p2023_01_02;

import java.util.Scanner;

public class IfMaxMin01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, max, min;
		System.out.println("정수 3개를 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 >= n2) {					// n1이 n2보다 큰 경우
			if(n1 >= n3) {
				max = n1;
				if(n2 <= n3) {
					min = n2;
				}else {
					min = n3;
				}
			}else {						
				max = n3;
				if(n1 <= n2) {
					min = n1;
				}else {
					min = n2;
				}
			}
		}else {							// n2가 n1보다 큰 경우
			if(n2 >= n3) {
				max = n2;
				if(n1 <= n3) {
				   min = n1;
				}else {
					min = n3;
				}
			}else {
				max = n3;
				if(n1 <= n2) {
					min = n1;
				}else {
					min = n3;
				}
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
