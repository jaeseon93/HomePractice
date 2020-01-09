package Practice6;

public class Car {

	// 필드
	int gas;

	// 생성자
	public Car() {

	}

	// 메소드
	void setGas(int gas) { // void라서 리턴값이 없음
		this.gas = gas; // 필드값 gas에 변수 gas를 대입
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 메소드 실행 종료
			}
		}
	}
}
