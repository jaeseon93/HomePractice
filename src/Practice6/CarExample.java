package Practice6;

public class CarExample {

	public static void main(String[] args) {
      Car myCar = new Car();
      
      myCar.setGas(5);  //car의 setGas()메소드호출
      
      boolean gasState = myCar.isLeftGas(); //car의 isLeftGas()메소드호출
      if(gasState) {
    	  System.out.println("출발합니다.");
    	  myCar.run();
      }
      
      if(myCar.isLeftGas()){  //직접 메소드를 if의 조건식에 넣어도 됨 boolean
    	  System.out.println("gas를 주입할 필요가 없습니다.");
    	  
      } else {
    	  System.out.println("gas를 주입하세요.");
      }
      
	}

}
