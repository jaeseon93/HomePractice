package Practice6;

public class PrinterExample2 {

	public static void main(String[] args) {
//Printer 클래스에서 선언한 메소드를 객체 생성하지 않고 클래스에서 바로 호출하려면 정적(static)메소드로 하나 더 만들어줘야 한다.
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("펭수");
		
	}

}
