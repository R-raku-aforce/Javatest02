package PracticeTest8;
//⑩
class Person {
    private String name;
    private int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
    
     boolean isAdult() {
    	return age >= 20;
     }
}

public class getperson {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person person1 = new Person("John",30);
		Person person2 = new Person("Lisa",26);
		Person person3 = new Person("Joy",6);
		
		System.out.println(person1.isAdult());
		System.out.println(person2.isAdult());
		System.out.println(person3.isAdult());
	}

}
