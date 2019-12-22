package Practice3;

public class 확인문제 {
	public static void main(String[] args) {
		// Exercise02
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
//      Exercise03
		int score = 85;
		String result = (!(score > 90) ? "가" : "나");
		System.out.println(result);
//      Exercise04
		int pencils = 534;
		int students = 30;

		// 학생 한명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);

		// 남은 연필 수
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);
//      Exercise05
		int value = 356;
		System.out.println((value/10)*10);
//      Exercise06
		int lengthTop = 5; // 사다리꼴의 윗변
		int lengthBottom = 10;// 아랫변
		int height = 7; // 높이
		double area = (lengthTop + lengthBottom) / 2.0 * height; //사다리꼴높이구하는코드
		System.out.println(area);
		
	}
}
