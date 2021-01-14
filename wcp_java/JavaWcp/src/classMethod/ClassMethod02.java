package classMethod;

import classMethod.human.Human02;
//どこのパッケージに属しているのかの宣言
//Human02のコンストラクタやメンバー変数を使用したいので、import

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
//		new classMethod.human.Human02()
//		importしない場合は、　Human02のインスタンスを生成するのに毎回上記の記述が必要になる
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}