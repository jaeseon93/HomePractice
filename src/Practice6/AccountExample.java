package Practice6;

public class AccountExample {

	public static void main(String[] args) {
      Account account = new Account ();
      
      account.setBalance(10000);
      System.out.println("현재 잔고: " + account.getBalance()); //balance를 리턴하는 getter사용
      
      account.setBalance(-100);
      System.out.println("현재 잔고: " + account.getBalance()); //엉터리 값을 주게되면 setBalance에서 정의 한if구문이 음수인걸 알아내서  
                                                             //if구문이 true로 되기때문에 	this.balance = balance;를 실행하게된다. 
      account.setBalance(2000000);
      System.out.println("현재 잔고: " + account.getBalance());  //엉터리 값을 주게되면 setBalance에서 정의 한if구문이 음수인걸 알아내서  
                                                              //if구문이 true로 되기때문에 	this.balance = balance;를 실행하게된다. 
      account.setBalance(300000);
      System.out.println("현재 잔고: " + account.getBalance());
	
	
	
	}

}
