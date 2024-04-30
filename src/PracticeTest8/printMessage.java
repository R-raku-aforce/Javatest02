package PracticeTest8;
//⑧
class Message {
	void printMessage(String message) {
		System.out.println(message);
	}

	String getMessage(String name,boolean isKid) {
		if(isKid) {
			String helloWord = "こんにちは。" + name + "ちゃん。" ;
			return helloWord ;
		}else {
			String helloWord = "こんにちは。" + name + "さん。" ;
			return helloWord ;
		}
	}
	}
	

public class printMessage {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Message Message = new Message();
		String helloWord = Message.getMessage("マリン", true);
		System.out.println(helloWord);
	}

}
