package Practice2;

public class CharExample {
   public static void main(String[] args) {
	
	   char c1 = 'H';
	   char c2 = 72;
	   char c3 = '\u0041';
	   
	   char c4 = '가';
	   char c5 = 44032;
			   
	   int unicode = c1; 
			   
	   System.out.println(c1);
	   System.out.println(c2);
	   System.out.println(c3);
	   
	   System.out.println(c4);
	   System.out.println(c5);
	   
	   System.out.println(unicode); //c1의 유니코드 확인
   }
}
