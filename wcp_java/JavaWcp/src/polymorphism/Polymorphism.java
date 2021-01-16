package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism {
	public static void main(String[] args) {
		Human human1 = new Student("佐藤", 17, 70);
//		 Student ⇨　Humanのアップキャスト
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human1.getProfile());
//		Humanのインスタンスクラスhuman1であるが、
//		実態はStudentクラスなのでSturdentクラスでオーバーライドされたgetProfileメソッドが適用される
		
		Human human2 = new Employee("田中", 28, "システム部");
//		Employee ⇨　Humanのアップキャスト
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human2.getProfile());
//		Studentと同じで、EmployeeでオーバーライドされたgetProfileの適用
//		※オーバーライドの記述がない場合は、superクラスのメソッドが適用される
	}
}