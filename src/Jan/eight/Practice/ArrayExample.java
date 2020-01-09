package Jan.eight.Practice;

public class ArrayExample {
//score배열의 합계와 평균구하기
// 합:415 평균: 67.142.....
	public static void main(String[] args) {
		int[] score = { 55, 60, 70, 80, 80, 70, 55 };

		/* int[0]:55 ,[1]:60, [2]:70, [3]:80,[4]:80,[5]:70,[6]:55 합 */
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println("합: " + sum);
		double avg = (double) sum /score.length;
		System.out.println("평균: " + avg);
	}

}
