package Practice6;

public class ShopServiceExample {

	public static void main(String[] args) {
		//getInsatance()의 메소드는 단 하나의 객체만 리턴. 따라서 밑에서 obj1과 obj2를 비교해도 같은 결과값이 나오게 된다.
		ShopService obj1 = ShopService.getInstance(); //new로 호출안되고 getInsance로만 호출 가능.
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1==obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
		
		
	}

}
