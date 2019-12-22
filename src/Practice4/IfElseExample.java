package Practice4;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;

		if (score >= 90) {
			System.out.println("90보다 큽니다");
			System.out.println("등급은 A");
		} else { // if의 조건문이 false이면 실행.
			System.out.println("90보다 작습니다");
			System.out.println("등급은 B");
		}
	}
}
