package Practice3;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

//		double z = 5 / y;
		double z = 5 % y;
//        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));
        
	}
}
