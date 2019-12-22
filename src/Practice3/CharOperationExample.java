package Practice3;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // A의 유니코드는 65
		char c2 = 'A'; // 65를 저장
//		char c3 = c2 + 1; //변수에 산술이 들어가면 결과값은 int타입으로 산출된다.
		int result = c2 + 1; //따라서 int타입으로 선언하기.
		System.out.println(result);

		char c3 = (char) result; //다시 char타입으로 변환
		System.out.println(c3);
	}
}
