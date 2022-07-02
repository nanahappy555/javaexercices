package designpatternex;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "리터럴";
		String s2 = new String("리터럴");
		
		System.out.println(s1); //리터럴
		System.out.println(s2.toString()); //인스턴스 안에 리터럴 값이 있음
		
		System.out.println(s1 == s2.toString()); //false
		System.out.println(s1 == s2); //false
	}
}
