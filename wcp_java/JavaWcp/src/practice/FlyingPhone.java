package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    // プログラムを作成
	private int flyTime;

	public FlyingPhone(int flyTime) {
		this.flyTime = flyTime;
	}
	public void fly() {
		System.out.println(this.flyTime + "分間、飛びます");
	}

	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}

	public void powerOff() {
        Flying.super.powerOff();
//        二つのinterfaceで存在する同名のdefaultメソッドの選択が必要
//        インターフェイス名.supter.defaultメソッド名
    }
}