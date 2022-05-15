package BMIApp;

public class Calculate_BMI {

	
	public double BMI_Calculate(int height, int weight ){
		
		double bmi_value = (weight/Math.pow(height, 2))*10000;
		
		return bmi_value;
		
	}
	
}
