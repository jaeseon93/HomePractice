package Practice6;

public class ShopService {
   //이클래스를 싱글톤으로 만들어보기.
   //일단 싱글톤이란 하나의 객체만 이안의 클래스에서 선언해야함. (외부에서 호출 안되게.)
   //private 선언하고 , 자신의 타입인정적필드 (static)를 선언해야 main메소드에서 사용가능.
   //다른 외부에서 호출할 수 있게하려면 getInstance() 선언해줘야함.
	
	private static ShopService shopService = new ShopService(); //외부에서도 변경하지 못하도록 정적필드에 private를 붙인다.
	
	//getInsatance()의 메소드는 단 하나의 객체만 리턴. 
	static ShopService getInstance() {
		return shopService;
	}
	
	
	
}
