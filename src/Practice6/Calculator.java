package Practice6;

public class Calculator {
	void powerOn() { // 매개값이 필요없음 라이브러리용
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {  //리턴값이 필요함
		int result = x + y;
		
		return result;  //결과값으로 리턴(출력)하겠다는뜻.
	}
	
	double divide(int x, int y) {
		double result =(double) x / y;
		
		return result;
	}
}
