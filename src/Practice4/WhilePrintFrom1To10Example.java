package Practice4;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;  //이 구문을 안만들어주면 i=1이기때문에 계속해서 반복하게됨.
		}
	}
}
