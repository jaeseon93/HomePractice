package Jan.eight.Practice;

public class ConditionSwitch {

	public static void main(String[] args) {
		int score = 68;
		
		switch(score/5) {
		case 19: 
			System.out.println(score +"점 " + "등급 A+");
			break;
		case 18: 
			System.out.println(score +"점 " + "등급 A");
			break;
		case 17: 
			System.out.println(score +"점 " + "등급 B+");
			break;
		case 16: 
			System.out.println(score +"점 " + "등급 B");
			break;
		case 15: 
			System.out.println(score +"점 " + "등급 C+");
			break;
		case 14: 
			System.out.println(score +"점 " + "등급 C");		
			break;
		case 13: 
			System.out.println(score +"점 " + "등급 D+");
			break;
		case 12: 
			System.out.println(score +"점 " + "등급 D");
			break;
		case 11: 
			System.out.println(score +"점 " + "등급 F");
			break;
		}
	}

}
