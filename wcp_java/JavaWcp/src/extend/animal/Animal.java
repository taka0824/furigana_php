package extend.animal;

abstract public class Animal {
	protected String name;
	
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}
	
	abstract public void cry();
}