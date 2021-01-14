package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		
		Human04.staticMethodPrint();
		// 静的メンバーは、インスタンス生成せずに直接使用できる 静的メンバー=Human04
		
		System.out.println(Human04.GREETING);
		// staticなクラス定数もインスタンスを生成せずに参照できる
		
		yamada.instanceMethodPrint();
	}
}