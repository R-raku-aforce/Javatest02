package PracticeTest8;

class RandomMessage {
	
	void printRandomMessage() {
		
		int n = (int)(3 * Math.random());
		
		if (n == 0) {
			System.out.println("こんばんは");
		}else if(n == 1) {
			System.out.println("こんにちは");
		}else {
			System.out.println("おはよう");
		}
	}
}

public class PrintRandomMessage {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RandomMessage randommessage = new RandomMessage();
		randommessage.printRandomMessage();
	}

}
