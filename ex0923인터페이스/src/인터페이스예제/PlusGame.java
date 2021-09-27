package 인터페이스예제;

import java.util.Random;

public class PlusGame implements IGame {
	Random ran = new Random();
	int num1;
	int num2;

	@Override
	public void makeRandom() {
		num1 = ran.nextInt(9) + 1;
		num2 = ran.nextInt(9) + 1;
	}

	@Override
	public String getQuizMsg() {
		return num1 + " + " + num2 + "= ";
	}

	@Override
	public boolean checkAnswer(int answer) {
		if (num1 > num2) {
			if (answer == (num1 - num2)) {
				return true;
			}
		}else {
			if (answer == (num1 - num2)) {
				return true;
			}
		}
		return false;
	}

}
