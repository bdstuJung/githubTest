package �������̽�����;

import java.util.Random;

public class PlusGame2 implements IGame{
	// �˰��� �����
	
	// �ʵ�
	private Random ran;
	private int num1;
	private int num2;
	
	@Override
	public void makeRandom() {
		// ���� �����ϴ� ���
		ran = new Random();
		num1 = ran.nextInt(9)+1;
		num2 = ran.nextInt(9)+1;
	}

	@Override
	public String getQuizMsg() {
		// ������ ������ ���ڿ� ���·� �ǵ����ֱ�
		// ����1 + ����2 = 
		// String result = num1 + " + " + num2 + " = ";
		return num1 + " + " + num2 + " = ";
	}

	@Override
	public boolean checkAnswer(int answer) {
		// �Ű������� �޾ƿ� ���ڿ� ���� ����1 + ����2 ��ġ�ϴ��� üũ
		// ����üũ�ϴ� ���
		
		return num1+num2 == answer; // �񱳿����ڴ� ��������� boolean �ǵ����ش�
	}

	
	
}
