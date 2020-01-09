package Practice6;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();

		int result1 = myCalc.plus(10, 20); // 10+20을 계산하고 난후에 받는 값이 30이기때문에 int값으로 선언
		 System.out.println("result1 : " + result1);
        byte x =10;
        byte y =4;
        double result2 = myCalc.divide(10, 4);  //자동타입변환실행됨
        System.out.println("result2 : " + result2);
	}

}
