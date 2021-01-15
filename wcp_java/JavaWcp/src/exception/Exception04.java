package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
    public static void main(String[] args) {
        try {
            Exception04.readFile("exception.txt");
//            readFileの呼び出し元がtryの中なので、catchで同じクラスの例外があればその処理が走る
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException例外が発生");
//            readFileでthrowsされたFileNotFoundExceptionをcatchしてブロック内の処理が走る
        }
        System.out.println("プログラム終了");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        System.out.println("ファイルの読み込み開始");
        FileReader fr = new FileReader(fileName);
//        読み込みができなかったところで処理は進まない
//        FileNot FountExceptionの例外を呼び出し元に飛ばす
        System.out.println(fileName + "の読み込み完了");
    }
}