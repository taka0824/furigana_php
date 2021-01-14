package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;
	
	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}
	
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
//		System.out .println("年齢は" + this.age + "、職業は" + this.profession);
//		と同じじゃないの？だったら戻り値不要だからvoid?
//		⇨2つ目の記述だと、getProfile()メソッドを読んだときにこの文章の出力が行われるけど、一つ目のメソッドは出力は行われない。
	}
	
	public void greet(String friend) {
		if(friend == null) {
			System.out.println("挨拶する友達がわかりません");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}