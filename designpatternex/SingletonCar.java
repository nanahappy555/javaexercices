package designpatternex;

public class SingletonCar {
	private static SingletonCar myCar; //자기자신 타입 변수
	
	//생성자 private로 외부에서 생성할 수 없음
	private SingletonCar() {
	}

	//외부에서 생성을 위한 메서드
	public static SingletonCar getInstance() {
		//아직 한번도 생성한 적 없을 때만 1회 새로운 객체를 생성한다.
		if(myCar == null) {
			myCar = new SingletonCar();
		}
		return myCar; //생성한 객체반환
	}
	
	 
}
