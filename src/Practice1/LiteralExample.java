package Practice1;

public class LiteralExample {
   public static void main(String[] args) {
	int var1 = 10;
	System.out.println(var1);
	
	int var2 = 010;  //8진수
	System.out.println(var2);
	
	int var3 = 0x10; //16진수
	System.out.println(var3);
	
	double var4 = 0.25; //double타입의 실수
	System.out.println(var4);
	
	double var5 = 2E5;
	System.out.println(var5);
	 
	char var6 = 'j';  //''(작은따옴표) 문자 하나만 저장함
	System.out.println(var6);
	
    System.out.println('\t' + "들여쓰기");
    System.out.println('\n' + "줄바꿈");
    System.out.println('\r' + "리턴"); //\n,\r은자바에서줄바꿈
    System.out.println("This" + '\'' + "s Java");
    
    char var8 = '\u0041'; //16진수의41
    System.out.println(var8);
    
    System.out.println("대한" + "민국"); //+의미는 문자열과 문자열을 결합하는의미
    System.out.println("java" + 8);
    
    String var9 = "자바";
    System.out.println(var9);
    
    boolean var10 = true;
    boolean var11 = false;
    System.out.println(var10);
   
   }
}
