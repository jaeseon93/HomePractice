package Practice4;

import java.util.Scanner; //컴파일러에게 스캐너클래스가 어디에있는지 알려줌.

public class DoWhileExample {
	public static void main(String[] args) {

		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
        String inputString;


		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (! inputString.contentEquals("q"));

		System.out.println();
		System.out.println("프로그램 종료");

	
	}

}
