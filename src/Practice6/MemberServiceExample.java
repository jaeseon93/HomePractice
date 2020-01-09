package Practice6;

public class MemberServiceExample {

	public static void main(String[] args) {
        MemberService ms = new MemberService();  //객체생성
        boolean result = ms.login("hong", "12345"); //result변수 선언,ms로 memberService호출
        if (result) { //true일때
        	System.out.println("로그인 되었습니다.");
        	ms.logout("hong");  //로그인과 동시에 로그아웃을 시킴
        } else { //false일때
        	System.out.println("id 또는 password가 올바르지 않습니다.");
        }
	}

}
