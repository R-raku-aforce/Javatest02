package PracticeTest8;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//①
		Hello Hello = new Hello();
		Hello.printHello();
		
		//➁
		RandomMessage randommessage = new RandomMessage();
		randommessage.printRandomMessage();
		
		//③
		Message message = new Message();
		message.printMessage("Good Evening");
		
		//④
		Message2 message2 = new Message2();
		message2.printMessage2("Hello",5);
		
		//⑤
		rectangleArea rectangArea = new rectangleArea();
		rectangArea.printRectangleArea(2.7, 3.6);
		
		//⑥
		weatherForecast randomWeather = new weatherForecast();
		String weather = randomWeather.getWeatherForecast();
		System.out.println(weather);
		
		//⑦
		isEvenNum Number = new isEvenNum();
		boolean isNumber = Number.isEvenNum(4);
		System.out.println(isNumber);
		boolean isNumber2 = Number.isEvenNum(5);
		System.out.println(isNumber2);
		
		//⑧
		Message Message = new Message();
		String helloWord = Message.getMessage("マリン", true);
		System.out.println(helloWord);
		
		//⑨
		LongestStr exampleArray = new LongestStr();
		String[] testArray = {"apple","banana","orange","tea","coffee","beef"};
		String longest = exampleArray.getLongestString(testArray);
		System.out.println(longest);
		
		//⑩
		Person person1 = new Person("John",30);
		Person person2 = new Person("Lisa",26);
		Person person3 = new Person("Joy",6);
		
		System.out.println(person1.isAdult());
		System.out.println(person2.isAdult());
		System.out.println(person3.isAdult());
		
		
	}


	
}
