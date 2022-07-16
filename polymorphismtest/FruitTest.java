package polymorphismtest;

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
	}
}

class Apple extends Fruit {
	
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
	
	public void testP() {
		System.out.println("메서드 testp : Fruit1");
	}
	
	public void testP2() {
		System.out.println("메서드 testp2 : Fruit2");
	}
}