
public class Chapter5 {
	public static void main(String[] args) {
		long number = 56L;
		System.out.println(number);
		double number2 = 23.895;
		System.out.println(number2);
		boolean bool = true;
		System.out.println(bool);
		
		Integer number4 = 34;
		System.out.print(number4);
		Float number3 = 5.34f; 
		System.out.print(number3);
//		浮動小数型はデフォルトでdoubleになるので、明示的に代入する値にfをつける必要がある
		Character word = 'a';
//		Stringと異なり、Character, charを使用する場合はシングルコーテーションを使用する必要がある
		System.out.println(word);
		
		int[] array = {1,2,3,4,5};
		System.out.println(array[3]);
		
	}

}
