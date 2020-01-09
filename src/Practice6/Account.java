package Practice6;
/*은행계좌 만들기 전 설계하기
 -balance의 필드는 음수값 금지. 최대 백만원까지 저장가능. 외부에서 balance 필드 마음대로 수정 불가능하게 만들기.
1.setter와 getter 이용하기
2.balance의 값은 0 <= balanace <= 1000000
3.setter의 매개값이 음수이거나 백만원 초과하면 현재 balance값을 유지하기. */

public class Account {
	// 상수 선언하기 (외부에서 상수값읽도록하기,대문자로)
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

//banlance 라는 필드를 선언 (외부에서 접근하지 못하게 선언하기)
	private int balance;

	public int getBalance() { // getBanlance()라는 메소드를 호출.
		return balance;
	}
	//setter로 유효성 검사하기. 
	public void setBalance(int balance) { // 외부에서 값을 받아서 balance저장.
		// (min, max) 여기서 balance는 필드가 아니라 매개변수로 작용. ||:이거나
		if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;  //if범위에서 초과하는 값이 들어오면 메소드를 끝내버리고 필드값은 유지하도록 함.
	}

}
