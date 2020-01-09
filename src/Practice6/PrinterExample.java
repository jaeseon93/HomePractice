package Practice6;

public class PrinterExample {

	public static void main(String[] args) {
		//println 오버로딩 연습. 매개값이 다르기때문에 이름이 같아도 괜찮.
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("펭수");
		
	}

}
