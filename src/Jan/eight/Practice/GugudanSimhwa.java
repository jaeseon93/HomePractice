package Jan.eight.Practice;

public class GugudanSimhwa {
//2단부터 9단까지
	public static void main(String[] args) {
		//단은 따로 구문 만들어서 출력해줘야 함
		for(int i = 2; i<10; i++) {
			System.out.print("**"+ i +"단 **"+ "  ");
		}
		System.out.println();
		//컴퓨터 출력할때 2단을 다 돌고 3단을 바로 위로 가져오게 할수는 없음. 가로로 한 줄씩 출력하는 형태라고 봐야함.
			for(int i =1; i<10; i++) {
				for(int j = 2; j<10; j++) {		
				int result = i*j;
				System.out.print(j + "*" + i + " = " + result+"||");
	
			}
				System.out.println();
		}
	}

}
