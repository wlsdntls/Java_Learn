package p2023_01_05;

class MyDate03{   	// field, 멤버변수
  private int year;    
  private int month;    
  private int day;
 
  // 생성자 : 객체를 생성할 때 생성자가 호출되고, 필드 값을 초기화 시켜주는 역할을 한다.
  public MyDate03(){ // 기본 생성자 
    year=2016;
    month=4;
    day=1;
  }  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate03 d=new MyDate03();
    d.print(); 
  
  // private 접근제어자는 외부 클래스의 접근을 허용하지 않기 때문에 직접 접근을 할 수 없다.
    
  
  }
}               