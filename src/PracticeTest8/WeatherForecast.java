package PracticeTest8;
//⑥
 class weatherForecast {
	
	String getWeatherForecast() {
		
		String[] days = {"明日","今日","明後日"};
		String[] weathers = {"晴れ","曇り","雨","雪"};
		
		int n = (int)(3 * Math.random());
		int m = (int)(4 * Math.random());
		
		String weather = days[n] + "の天気は" + weathers[m] + "でしょう。";
		
		return weather ;
	}
 }
public class WeatherForecast {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		weatherForecast randomWeather = new weatherForecast();
		String weather = randomWeather.getWeatherForecast();
		System.out.println(weather);
	}

}
