package classMethod;

import classMethod.human.Human03;
//上記の記述を入れずに実行しようとすると、new Human03()の部分が実行できないため、自動でimportの文章が挿入された

public class ClassMethod03 {
	public static void main(String[] args) {
		Human03 yamada = new Human03();
		System.out.println("私の名前は、" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");

		yamada.greet("田辺");
		yamada.greet(null);
	}
}