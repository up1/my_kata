package kata.kata;

public class MyCaptcha {

	public int process(String left, String operator, String right) {
		if(left.equals("one")) {
			left = "1";
			
		}
		if(right.equals("one")) {
			right = "1";
		}
		
		return Integer.parseInt(left) + Integer.parseInt(right);
	}

}
