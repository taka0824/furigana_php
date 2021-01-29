
public class pyramid {
	public static void main(String[] args) {
		int height = 5;
		String star = "*";
		
		for(int i = 1; i <= height; i++) {
//			iはピラミッドの何段目かを表す。指定したheightの高さまでfor文を回す必要がある。
			for(int j = 1; j <= 5 - i; j++) {
//				jは空白の"　"の個数を表す。ピラミッドではheight - i（段目）が空白の個数になる。
				System.out.print(" ");
			}
			for(int k = 1; k <= i * 2 - 1; k++) {
//				kはその行のstarの数を表す。iとkの数は一致する。
				System.out.print(star);
			}
			System.out.print("\n");
		}
	}

}
