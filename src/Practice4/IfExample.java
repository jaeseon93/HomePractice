package Practice4;

public class IfExample {
   public static void main(String[] args) {
	int score = 93;
	
	if(score>=90) { //if의 조건문에 true가 되면 실행
		System.out.println("점수가 90보다 큽니다.");
		System.out.println("등급은 A");
	}
	if(score<90) { 
		System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B");
	}
}
}
