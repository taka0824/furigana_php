package classMethod.human;

public class Human05 {
	private String name;
	private int age;

	public Human05() {
		name = "山田";
		this.age = 20;
//		thisは不要？
//		入れても入れなくても同じ
	}

	public String getName() {
		return this.name;
//		thisは不要？
//		入れても入れなくても同じ
	}

	public int getAge() {
		return this.age;
	}
}
