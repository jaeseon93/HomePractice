package Practice3;

public class DenyLogicOperatorExample {
   public static void main(String[] args) {
	boolean play = true;
	System.out.println(play);
	
	play = !play;
	System.out.println(play);
	
	play = !play;
	System.out.println(play); //위에 나온 값이 false였기때문에 true.
}
}
