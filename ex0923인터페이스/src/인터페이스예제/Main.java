package �������̽�����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ����� ���
		// ����Ƚ�� üũ, 5������ ������ �� �ְԲ� �����ۼ�

		Scanner sc = new Scanner(System.in);
		// GameDummy p1 = new GameDummy(); // ---> �ӽ��׽�Ʈ��
		PlusGame2 p1 = new PlusGame2();

		int count = 0; // ������ ������ üũ�ϴ� ����!

		// 1. �� 5������ ����
		for (int i = 0; i < 5; i++) {
			// 2. ���� �����ϴ� ���
			p1.makeRandom();

			// 3. ���� ���
			for (int j = 0; j < 3; j++) {
				System.out.print(p1.getQuizMsg());
				int answer = sc.nextInt();
				// 4. �� ������ ������ ���� �� �ִ� ��ȸ�� 3��
				if (p1.checkAnswer(answer)) {
					// ������ �����!
					count++;
					break;
				} else {
					// ������ ������ ���ߴ�!
					System.out.println("�����Դϴ�!");
				}
			}
		}
		// 5. ���� ���� Ƚ���� ���
		System.out.println("������ ������ " + count + "�� �Դϴ�!");

//		// ���� Ƚ�� üũ
//		// �����ȸ Ƚ�� üũ
//		// ����ڷκ��� �� �Է�
//		// �޽��� ���
//		
//		// Ƚ�� Ȯ������ ���� �����
//		int gameCnt = 5;
//		int answerCnt = 3;
//		
//				// ���� ����
//				
//				// 3���� ��ȸ�ְ� ���� ���� üũ�ϴ� �κ�
//				// while�� �ٽ�? // for?
//				
//				for (int i = 5; i > 0; i--) {
//					p1.makeRandom();
//					String q = p1.getQuizMsg();
//					for (int j = 3; j > 0; j--) {
//						System.out.print(q);
//						int userAnswer = sc.nextInt();
//
//						if (p1.checkAnswer(userAnswer) == true) {
//							System.out.println("�����Դϴ�!");
//							break;
//
//						} else if (p1.checkAnswer(userAnswer) == false) {
//							answerCnt--;
//							if(answerCnt==2) {
//								System.out.println("�ѹ� �� �����غ�����");
//							}else if(answerCnt == 1) {
//								System.out.println("������ ��ȸ�Դϴ�.");
//							}
//						}
//
//					}
//
//
//				}
//				System.out.println("������ ����ƽ��ϴ�.");
//				

	}

}
