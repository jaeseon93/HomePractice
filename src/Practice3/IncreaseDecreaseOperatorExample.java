package Practice3;

public class IncreaseDecreaseOperatorExample {
   public static void main(String[] args) {
	int x = 10;
	int y = 10;
	int z; //선언만함
	
	System.out.println("------------");
    x++;  //11
    ++x;  //12
    System.out.println("x=" + x);  //문자열이 하나 있으니까 결합이 되는걸로 나옴.
   
    System.out.println("------------");
    y--; //9
    --y; //8
    System.out.println("y=" + y);
    
    System.out.println("------------");
    z = x++;  //먼저 x를 z에 대입 , 그 후에 1 증감
    System.out.println("z=" + z);
    System.out.println("x=" + x);
    
    System.out.println("------------");
    z = ++x;  //13을 먼저 1 증감 , 그 후에 결과값을 z에 저장
    System.out.println("z=" + z);
    System.out.println("x=" + x);
    
    System.out.println("------------");
    z = ++x + y++; //x=14 , y=8 / x의+가 앞에 붙어있기때문에 먼저 1증감 시킨다.=15
//    y의 경우 +가 뒤에 붙어 있기때문에 8을먼저 대입시킨후 1 증감시킨다.=9
    System.out.println("z=" + z);
    System.out.println("x=" + x);
    System.out.println("y=" + y);
    
    
   
   }
}
