package p2022_12_30;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 난수 발생 공식
// 난수 = (정수화) (Math.random() * (상한값 - 하한값  + 1) + 하한값;
//상한값 : 가장 큰 값, 하한값 : 가장 작은 값
		//0.0 <= Math.random() < 1.0
		//Math m = new Math(); 생성자가 없기 때문에  new 사용 객체 생성 시 오류 발생
		System.out.println("E="+ Math.E);	//e
		System.out.println("Pi="+ Math.PI);	//pi
		System.out.println(Math.random());	//난수발생 0.0 <= 난수 < 1.0
		
// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int) (Math.random()*6) + 1; // 1~6
		System.out.println("num="+num);
		
		if(num == 1) {
			System.out.println("1번");
		}
		else if(num == 2) {
			System.out.println("2번");
			
		}
		else if(num == 3) {
			System.out.println("3번");
			
		}
		else if(num == 4) {
			System.out.println("4번");
			
		}
		else if(num == 5) {
			System.out.println("5번");
			
		}
		else {
			System.out.println("6번");
		}
		
		System.out.println("1~45 사이의 난수 발생");
		int r = (int)(Math.random()*45) + 1;
		System.out.println("난수" + r);
	}

}




