package 인터페이스예제;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 입출력 담당
		// 정답횟수 체크, 5문제를 제시할 수 있게끔 로직작성

		Scanner sc = new Scanner(System.in);
		// GameDummy p1 = new GameDummy(); // ---> 임시테스트용
		PlusGame2 p1 = new PlusGame2();

		int count = 0; // 정답의 개수를 체크하는 역할!

		// 1. 총 5문제를 제시
		for (int i = 0; i < 5; i++) {
			// 2. 난수 생성하는 기능
			p1.makeRandom();

			// 3. 문제 출력
			for (int j = 0; j < 3; j++) {
				System.out.print(p1.getQuizMsg());
				int answer = sc.nextInt();
				// 4. 한 문제당 정답을 맞출 수 있는 기회는 3번
				if (p1.checkAnswer(answer)) {
					// 정답을 맞췄다!
					count++;
					break;
				} else {
					// 정답을 맞추지 못했다!
					System.out.println("오답입니다!");
				}
			}
		}
		// 5. 맞은 정답 횟수를 출력
		System.out.println("정답의 개수는 " + count + "개 입니다!");

//		// 게임 횟수 체크
//		// 정답기회 횟수 체크
//		// 사용자로부터 값 입력
//		// 메시지 출력
//		
//		// 횟수 확인해줄 변수 만들기
//		int gameCnt = 5;
//		int answerCnt = 3;
//		
//				// 문제 출제
//				
//				// 3번의 기회주고 문제 정답 체크하는 부분
//				// while로 다시? // for?
//				
//				for (int i = 5; i > 0; i--) {
//					p1.makeRandom();
//					String q = p1.getQuizMsg();
//					for (int j = 3; j > 0; j--) {
//						System.out.print(q);
//						int userAnswer = sc.nextInt();
//
//						if (p1.checkAnswer(userAnswer) == true) {
//							System.out.println("정답입니다!");
//							break;
//
//						} else if (p1.checkAnswer(userAnswer) == false) {
//							answerCnt--;
//							if(answerCnt==2) {
//								System.out.println("한번 더 생각해보세요");
//							}else if(answerCnt == 1) {
//								System.out.println("마지막 기회입니다.");
//							}
//						}
//
//					}
//
//
//				}
//				System.out.println("게임이 종료됐습니다.");
//				

	}

}
