package Practice5;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
//      스코어 0 = 83, 1 = 90, 2 = 87 로 나타내고 스코어의 총합과 평균을 구해라.
//		1.배열변수로 int[]값 선언해주고 총합은 for구문이용하고 평균은avg변수로구해보기.

		int[] intAry = { 83, 90, 87 };
		System.out.println("스코어 : " + intAry[0]);
		System.out.println("스코어 : " + intAry[1]);
		System.out.println("스코어 : " + intAry[2]);

		int i = 0;
		int sum = 0;
		for (i = 0; i < 3; i++) {
			sum += intAry[i];

		}
		System.out.println("스코어의 총합은" + sum);

		double avg = (double) sum/3;
		System.out.println("스코어의 평균은"+ avg);
			
	}

}
