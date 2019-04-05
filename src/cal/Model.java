package cal;

public class Model {	
	
	static double value1;
	static double value2;
	static double res;
	
	public void setValue(double v1, double v2) {
		value1 = v1;
		value2 = v2;
	}
	
	public double getResult(){
		return res;
	}
	
	public void add() {
		res = value1 + value2;
	}
	
	public void sub() {
		res = value1 - value2;
	}
	
	public void mul() {
		res = value1 * value2;
	}
	
	public void div() {
		res = value1 / value2;
	}
	
	public void remainder() {
		res = value1 % value2;
	}
	
	public void sqrt() {
		res = Math.sqrt(value1);
	}
	
	
}
