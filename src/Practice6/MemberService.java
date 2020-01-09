package Practice6;

public class MemberService {
	boolean login(String id, String password) {
		// id가 hong이고 password가 12345면 true를 리턴 , &&=AND 논리연산자
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
