package designpatternex;

public class SingletonCarTest {
	public static void main(String[] args) {
		SingletonCar car1 = SingletonCar.getInstance();
		SingletonCar car2 = SingletonCar.getInstance();
		
		System.out.println(car1);
		System.out.println(car2);
		//같은 주소값을 가짐
	}
}
