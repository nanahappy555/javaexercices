package polymorphismtest;
/**
 * 필드는 인스턴스
 * 일반 메서드는 타입을 봄
 * 오버라이딩 메서드는 인스턴스를 봄
 * 
 * @author PC-17
 *
 */
public class FruitTest {
	
	public static void main(String[] args) {
		Fruit f = new Apple();
		Apple a = new Apple();
		
		//오버라이딩x
		f.testP(); //a1
		a.testP(); //a1
		
		//오버라이딩
		f.testP2(); //a1
		a.testP2(); //a1
		
//		f.test3();
		a.test3();
		
		f.getName();
		a.getName();
	}
}

class Apple extends Fruit {
	private String name = "자식필드";
	
	public void getName() {
		System.out.println(name);
	}
	
	public void testP() {
		System.out.println("메서드 testP : Apple1");
	}
	
	@Override
	public void testP2() {
		System.out.println("오버라이딩 메서드 testP2 : Apple2");
	}
	
	public void test3() {
		System.out.println("자식클래스에만 존재하는 메서드");
	}

}

class Fruit {
	private String name = "부모필드";
	
	public void getName() {
		System.out.println(name);
	}
	
	public void testP() {
		System.out.println("메서드 testp : Fruit1");
	}
	
	public void testP2() {
		System.out.println("메서드 testp2 : Fruit2");
	}
}
