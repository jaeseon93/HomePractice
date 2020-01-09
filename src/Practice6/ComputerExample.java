package Practice6;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 };
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		//위의 방법과 달리 , 매개변수를 배열로 따로 선언하지 않고  매소드를호출할때 바로 매개값을 선언해주었다.
		int result2 = myCom.sum1(new int[] { 1, 2, 3 });
		System.out.println("result2: " + result2);
		//(int... values) 의 방법으로 선언하였기 때문에 매소드 호출뒤에 바로 숫자만 넣으면 된다.
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result4: " + result4);
	}

}
