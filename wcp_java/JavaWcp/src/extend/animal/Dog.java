package extend.animal;

public class Dog extends Animal {
	public Dog() {
		this.name = "犬";
	}
	
	public void cry() {
		System.out.println(this.name + "が吠えました。わんわん！");
//		superクラス(animal)で抽象メソッド(cry)が定義されているため、自クラスに内容を追記してから使用する必要がある
	}
}
