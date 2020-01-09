package Jan.eight.Practice;

public class Condition {
	/*
	 * 문제2) 조건문 등급 정해주기. 95점이상 A+, 90점이상 A, 85점이상 B+, 80점이상 B, 75 c+ 70 c 65 d+ 60 d
	 * 60미만F 점수68점 등급 D
	 */
	public static void main(String[] args) {
		int score = 68;

		if (score >= 95) {
			System.out.print(score + "점 ");
			System.out.println("등급 A+");
		} else {
			if (score >= 90) {
				System.out.print(score + "점 ");
				System.out.println("등급 A");
			} else {
				if (score >= 85) {
					System.out.print(score + "점 ");
					System.out.println("등급 B+");
				} else {
					if (score >= 80) {
						System.out.print(score + "점 ");
						System.out.println("등급 B");
					} else {
						if (score >= 75) {
							System.out.print(score + "점 ");
							System.out.println("등급 C+");
						} else {
							if (score >= 70) {
								System.out.print(score + "점 ");
								System.out.println("등급 C");
							} else {
								if (score >= 65) {
									System.out.print(score + "점 ");
									System.out.println("등급 D+");
								} else {
									if (score >= 60) {
										System.out.print(score + "점 ");
										System.out.println("등급 D");
									} else {
										if (score > 60) {
											System.out.print(score + "점 ");
											System.out.println("등급 F");
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
