package Practice1;

public class VariableScopeExample {

	public static void main(String[] args) {
		int var1;
		
		if(true) {
			int var2;
			
			var1 = 10;
			var2 = 20;
		}
		
		var1 =10;
//		var2 =20; //if 구문에서 끝났음 이미
		
		for(int i=0; i<1; i++) {
			int var3;
			
			var1 = 10;
			var3 = 30;
		}
		
		var1 = 10;
//		var3 = 30; //for 구문에서 끝났음

	}

}
