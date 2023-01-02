package p2023_01_02;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		do~while문
//	    do{
//	           반복 실행할 문장;
//	    }while(조건식);

// do ~ while 문으로 "사랑해요" 메세지를 10번 출력하세요		
		int i =1;				//초기값
		do {
			System.out.println(i+"사랑해요");
			i++;				//증감식
		}while(i<=10);			//조건식
	
	}

}
