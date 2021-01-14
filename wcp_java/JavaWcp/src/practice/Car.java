package practice;

public class Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    // コンストラクタを作成
    public Car(double fuelCost, double fuelAmount) {
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }

    // moveメソッド
    public void move(int distance) {
//    	戻り値はないのでvoid
    	System.out.println(distance + "km走ります");
    	this.fuelAmount -= distance / fuelCost;
//    	16km/Lの燃費で16km走った時に消費する燃料は1L(16(16km走る) / 16(燃費が16km/L))
    }
    // ・"xx km 走ります"を出力
    // ・残量を計算

    // fuelAmountを取得するメソッドを作成
    public double getFuelAmount() {
    	return this.fuelAmount;
    }
}