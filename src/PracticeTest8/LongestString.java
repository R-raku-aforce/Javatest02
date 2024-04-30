package PracticeTest8;
//⑨
class LongestStr {
	String getLongestString(String[] array) {
		
		String longest = array[0];
	
		for(int i = 1;i < array.length;i++) {
			if(array[i].length() > longest.length()) {
				longest = array[i];
			}else if(array[i].length() == longest.length() && i > 0){
				longest = array[i];
			}
		}
		return longest;
	}	
}

public class LongestString {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LongestStr exampleArray = new LongestStr();
		String[] testArray = {"apple","banana","orange","tea","coffee","beef"};
		String longest = exampleArray.getLongestString(testArray);
		System.out.println(longest);
	}

}
