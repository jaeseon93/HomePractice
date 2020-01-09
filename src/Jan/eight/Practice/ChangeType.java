package Jan.eight.Practice;

public class ChangeType {
/*	문제1) 변수(데이터 타입, 형변환)

	50/3 = 16.66666
	1.1*1.2 = 1.32*/

	public static void main(String[] args) {
		int i = 50;
		int j = 3;
		double result= i / (double)j;
		
		System.out.println("50/3" + " = " + result);
		
		double var1 = 1.1;
		double var2 = 1.2;
		double result1 = var1*var2;
		System.out.println("1.1*1.2" + "=" + result1);
		
	}

}
