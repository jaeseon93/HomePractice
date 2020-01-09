package Practice6;

public class Printer {

//println 오버로딩	 , PrinterExample에서 쓰는 메소드.
//void println (int i) {
//	System.out.println(i);
//}
//void println (boolean b) {
//	System.out.println(b);
//}
//void println (double d) {
//	System.out.println(d);
//}
//void println (String s) {
//	System.out.println(s);
//}

//	다른 클래스에서 객체를 선언하지 않고 바로 호출하고 싶을 경우 static 메소드를 붙이고 선언해주어야 한다.  PrinterExample2에서 쓰는 메소드.
static void println (int i) {
	System.out.println(i);
}
static void println (boolean b) {
	System.out.println(b);
}
static void println (double d) {
	System.out.println(d);
}
static void println (String s) {
	System.out.println(s);
}


} 