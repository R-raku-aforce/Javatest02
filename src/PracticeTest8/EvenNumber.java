package PracticeTest8;
//⑦
class isEvenNum{
	public boolean isNumber;
	
	boolean isEvenNum(int value) {
		if (value % 2 == 0) {
			isNumber = true;
		}else {
			isNumber = false;
		}
		return isNumber;
	}
}

public class EvenNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		isEvenNum Number = new isEvenNum();
		boolean isNumber = Number.isEvenNum(4);
		System.out.println(isNumber);
		boolean isNumber2 = Number.isEvenNum(5);
		System.out.println(isNumber2);
	}

}
