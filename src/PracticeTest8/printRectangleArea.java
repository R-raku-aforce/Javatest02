package PracticeTest8;
//⑤
class rectangleArea{
	void printRectangleArea(double height,double width) {
		System.out.println("長方形の面積は" + height * width + "です。");
	}
}

public class printRectangleArea {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		rectangleArea rectangArea = new rectangleArea();
		rectangArea.printRectangleArea(2.4, 3.6);
	}

}
