package Practice3;

public class SignOperatorEample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
	    int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
//		short result3 = -s; //부호 연산자를붙이면 int(4byte) 타입으로 산출됨
	    int result3 = -s;
	    System.out.println(result3);
	}
}
