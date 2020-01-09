package Practice6;

public class Computer {
	public int sum1(int[] values) {
		int sum = 0; // 0이라는 값으로 초기화함
		for (int i = 0; i < values.length; i++) {
			sum += values[i]; // int[]의 수의 합을 구할때.
		}
		return sum;
	}

	int sum2(int... values) {
        //선언방법만 다를뿐, 이 방법또한 배열이므로 처리내용이 같다.
		int sum = 0; 
		for (int i = 0; i < values.length; i++) {
			sum += values[i]; // int[]의 수의 합을 구할때.
		}
		return sum;
	}
	}

