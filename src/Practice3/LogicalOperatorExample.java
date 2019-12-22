package Practice3;

public class LogicalOperatorExample {
  public static void main(String[] args) {
	int charCode = 'A';
	
	if((charCode>=65) && (charCode<=90)) {
		System.out.println("대문자이네요.");
	}
	if((charCode>=97) && (charCode<=102)) {
		System.out.println("소문자이네요."); //false라서 출력안됨
	}
	if(!(charCode<48) && !(charCode>57)) {
		System.out.println("0~9 숫자이네요."); //charCode에 5를대입하면 true값.
	}
}
}
