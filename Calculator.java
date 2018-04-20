public class Calculator {
	
	private int result;
	
	public void add(int ... values) {
		for (int value : values) {
			result += value;
		}
	}
	
	public void substract(int ... values) {
		result = values[0] - values[1];
	}
	
	public void devide(int ... values) {
			result = values[0] / values[1];
	}
	
	public void multiply(int ... values) {
			result = values[0] * values[1];
	}
	
	public int getResult() {
		return result;
	}
	
	public void clearResult() {
		result = 0;
	}
}