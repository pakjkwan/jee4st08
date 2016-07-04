package grade;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :pakjkwan@gmail.com
 * @file :Avg.java
 * @story :
 */
public class GradeController2 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
	 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점,
	 * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A
	 * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
	 * [단]switch-case 문으로 해결하세요
	 */
	public static void main(String[] args) {
		// ------------ 변수 선언부,준비,초기화(init) --------
		String name = "", grade = "";
		int total = 0, avg = 0, kor = 0, eng = 0, math = 0;
		Scanner scanner = new Scanner(System.in);
		// --------------연산부 (알고리즘)-----------------------
		System.out.println("name?");
		name = scanner.next();
		System.out.println("국,영,수??");
		kor = scanner.nextInt();
		if (kor >= 101 || kor<0) {
			System.out.println("0에서 100까지 입력해주세요");
			return;
		}
		
		eng = scanner.nextInt();
		if (eng >= 101 || eng <0) {
			System.out.println("0에서 100까지 입력해주세요");
			return;
		}
		
		math = scanner.nextInt();
		if (math >= 101||math<0) {
			System.out.println("0에서 100까지 입력해주세요");
			return;
		}
		
		total = kor + eng + math;
		avg = total / 3;
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else if (avg >= 50) {
			grade = "E";
		} else if (avg >= 49) {
			grade = "F";
		} else {
		}
		// ----------------출력부(콘솔)--------------
		System.out.println("[" + name + "] : 총점 " + total + "점, "
				+ "평균" + avg + "점],"+ grade + "");
	}
}
