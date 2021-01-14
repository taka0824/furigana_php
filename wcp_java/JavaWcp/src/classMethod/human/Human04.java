package classMethod.human;

public class Human04 {
	public static int humanCount = 0;
//	static変数
	public String name;
	public static final String GREETING = "こんにちは";
//	static public finalと記述しても同じだが、
//	mainメソッドの書き方と揃えたいのでstatic public 型　名前
	//定数
			
	public Human04(String name) {
		this.name = name;
		Human04.humanCount++;
//		コンストラクター
	}
	
	public static void staticMethodPrint() {
		System.out.println("人の数は" + Human04.humanCount);
//		staticメソッド
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
		System.out.println("人の数は" + Human04.humanCount);
//		インスタンスメソッド
//		インスタンスメソッドの中からstatic変数(Human04.humanCount)を呼ぶことができる
	}
}