package PracticeTest6;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MinMax minMax = new MinMax();
		
		int a = 4, b = 2, c =10; 
		
		System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + minMax.getMaxValue(a,b,c));
		System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + minMax.getMinValue(a,b,c));
	}

}
