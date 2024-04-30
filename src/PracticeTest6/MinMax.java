package PracticeTest6;

public class MinMax {
	
//	int getMaxValue(int a ,int b, int c) {
//			
//		int mixAB =  Math.max(a,b);
//		
//		return Math.max(c, mixAB);
//	}
//	
//	int getMinValue(int a ,int b, int c) {
//		
//		int mixAB =  Math.min(a,b);
//		
//		return Math.min(c, mixAB);
//	}
	
	int getMaxValue(int a,int b,int c) {
		if(a > b && a > c) {
			return a;
		}else if(b > a && b > c) {
			return b;
		}else {
			return c;
		}
	}
	
	int getMinValue(int a,int b,int c) {
		if(a < b && a < c) {
			return a;
		}else if(b < a && b < c) {
			return b;
		}else {
			return c;
		}
	}
}
