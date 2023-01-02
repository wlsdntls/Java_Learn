package p2023_01_02;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 무한루프 : for문
// break : 반복문을 빠져 나오는 역할	
		
		for(int i=1;;i++) {
		if(i == 100) {
			break;
		}
		System.out.println(i+"무한루프!");
		}
		
	}

}
